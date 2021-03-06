package Controller;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Tour;

/**
 * Servlet implementation class DelTour
 */
@WebServlet("/DelTour")
public class DelTour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelTour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	private void toDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");

		System.out.println(request.getAttribute("id"));
		System.out.println(request.getParameter("id"));

		int id = Integer.parseInt((String) request.getParameter("id"));
		HttpSession session = request.getSession();
		TreeMap<Integer, Tour> card = (TreeMap<Integer, Tour>) session
				.getAttribute("card");
		if (card != null) {
			Tour tour = card.remove(id);
		}
		session.setAttribute("card", card);
		response.sendRedirect("thongtindattour.jsp");
	}
}
