package Controller;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TourDaoImp;
import Model.Tour;
import Model.User;

/**
 * Servlet implementation class DatHang
 */
@WebServlet("/DatHang")
public class DatHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DatHang() {

		super();
		// TODO Auto-generated constructor stub
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

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		new CheckLogin();
		User us = (User) session.getAttribute("user");
		if (us==null) {
			request.getRequestDispatcher("NEWPROJECT/html/login.jsp").forward(request, response);
		}else {
			String idTour = request.getParameter("idTour");
			TourDaoImp daoImp = new TourDaoImp();
			Tour tour = daoImp.getInfoTour(idTour);
			TreeMap<Integer, Tour> card = new TreeMap<Integer, Tour>();
			card.put(Integer.parseInt(idTour), tour);
			request.setAttribute("card", card);
			request.setAttribute("infoTour", tour);
		}
	}
	

}
