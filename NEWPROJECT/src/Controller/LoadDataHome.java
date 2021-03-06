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
import Model.Tour;
import Model.User;

/**
 * Servlet implementation class LoadDatahome
 */
@WebServlet("/LoadDataHome")

public class LoadDataHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public LoadDataHome() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		loadData(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		loadData(request, response);
	}
	private void loadData(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		TourDaoImp tour = new TourDaoImp();
//		User us = new User();
		HttpSession session = request.getSession();
//		session.setAttribute("user", us);
		ArrayList<Tour> listTour = tour.getAllTour("Du Lịch Trong Nước");
		session.setAttribute("tourHot", listTour);
		session.setAttribute("tourTrongNuoc", listTour);
		session.setAttribute("tourNuocNgoai", listTour);
		request.getRequestDispatcher("NEWPROJECT/html/home.jsp").forward(request, response);
		
	}
}
