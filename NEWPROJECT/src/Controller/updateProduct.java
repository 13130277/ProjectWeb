package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class updateProduct
 */
@WebServlet("/updateProduct")
public class updateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
        int count=Integer.parseInt((String) request.getParameter("count"));
            HttpSession session = request.getSession();
            TreeMap<Integer, Product> card = (TreeMap<Integer, Product>) session.getAttribute("card");
            if (card != null&&count>0) {
                Product p=card.get(id);
                if(p!=null)p.plusCount(count);
            }
            session.setAttribute("card", card);

        response.sendRedirect("giohang.jsp");
    }

}
