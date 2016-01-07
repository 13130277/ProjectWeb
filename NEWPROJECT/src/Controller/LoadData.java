package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TypeTourDaoImp;
import Model.Tour_Type;

/**
 * Servlet implementation class LoadData
 */
@WebServlet("/LoadData")
public class LoadData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadData() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		toDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		toDo(request, response);
	}

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String sql = "SELECT `idTourType`, `nameTourType`, `parent` FROM `tour_type` WHERE `parent`='TrongNuoc'";
		TypeTourDaoImp typeTourDaoImp = new TypeTourDaoImp();
		ArrayList<Tour_Type> listTypeTour = typeTourDaoImp.getListTourType(sql);
		HttpSession session = request.getSession();
		session.setAttribute("listTypeTour", listTypeTour);
		response.sendRedirect("NEWPROJECT/html/header.jsp");

	}

}
