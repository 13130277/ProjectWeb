package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class addProduct
 */
@WebServlet("/addProduct")
public class addProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProduct() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        toDo(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        toDo(request, response);
    }

    private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf8");
        response.setCharacterEncoding("utf8");
        System.out.println(request.getAttribute("id"));
        int id = Integer.parseInt((String) request.getParameter("id"));
        Product p = Data.getProduct(id);
        if (p != null) {
            HttpSession session = request.getSession();
            TreeMap<Integer, Product> card = (TreeMap<Integer, Product>) session.getAttribute("card");
            
            if (card == null) {
                card = new TreeMap<Integer, Product>();
                card.put(id, p);
            } else {
                Product p1 = card.get(id);
                if (p1 == null) card.put(id, p);
                else p1.plusCount();
            }
            session.setAttribute("card", card);
        }
        response.sendRedirect("index.html");
    }

}
