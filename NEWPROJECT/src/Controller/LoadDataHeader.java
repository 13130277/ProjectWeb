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
@WebServlet("/LoadDataHeader")
public class LoadDataHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadDataHeader() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		toDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		toDo(request, response);
	}

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {	
		TypeTourDaoImp typeTourDaoImp = new TypeTourDaoImp();
		ArrayList<Tour_Type> listTourTN = typeTourDaoImp.getListTourTypeParent("Du Lịch Trong Nước");
		ArrayList<Tour_Type> listTourNN = typeTourDaoImp.getListTourTypeParent("Du Lịch Nước Ngoài");
		HttpSession session = request.getSession();
		session.setAttribute("listTourTN", listTourTN);
		session.setAttribute("listTourNN", listTourNN);
		request.getRequestDispatcher("/NEWPROJECT/html/header.jsp").forward(request, response);

	}

}
