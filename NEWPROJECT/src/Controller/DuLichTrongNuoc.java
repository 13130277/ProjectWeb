package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TourDaoImp;
import DAO.TypeTourDaoImp;
import Model.Tour;
import Model.Tour_Type;

/**
 * Servlet implementation class DuLichTrongNuoc
 */
@WebServlet("/DuLichTrongNuoc")
public class DuLichTrongNuoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DuLichTrongNuoc() {
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

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TourDaoImp tour = new TourDaoImp();
		ArrayList<Tour> listTourDuLichTrongNuoc = new ArrayList<>();
		String param = (String) request.getParameter("newUrl");
		System.out.println(param+" tamtam------------");
		if (param.equals("all")) {
			System.out.println("connect ...");
			listTourDuLichTrongNuoc = tour.getAllTour("Du Lịch Trong Nước");
		} else {
			TypeTourDaoImp tourType = new TypeTourDaoImp();
			ArrayList<Tour_Type> listTourType = tourType.getListTourTypeParent("Du Lịch Trong Nước");
			for (Tour_Type newTType : listTourType) {
				String nTT = newTType.getIdTourType();
				if (param.equals(nTT)) {
					listTourDuLichTrongNuoc = tour.getAllTour(nTT);
				}
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("listTourDuLichTrongNuoc", listTourDuLichTrongNuoc);
		request.getRequestDispatcher("/NEWPROJECT/html/DuLichTrongNuoc.jsp").forward(request, response);

	}

}
