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
 * Servlet implementation class DuLichNuocNgoai
 */
@WebServlet("/DuLichNuocNgoai")
public class DuLichNuocNgoai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DuLichNuocNgoai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo( request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo( request, response);
	}

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TourDaoImp tour = new TourDaoImp();
		ArrayList<Tour> listTourDuLichNuocNgoai = new ArrayList<>();
		String param = (String) request.getParameter("newUrl");
		if (param.equals("all")) {
			listTourDuLichNuocNgoai = tour.getAllTour("Du Lịch Nước Ngoài");
		} else {
			TypeTourDaoImp tourType = new TypeTourDaoImp();
			ArrayList<Tour_Type> listTourType = tourType.getListTourTypeParent("Du Lịch Nước Ngoài");
			for (Tour_Type newTType : listTourType) {
				String nTT = newTType.getIdTourType();
				if (param.equals(nTT)) {
					listTourDuLichNuocNgoai = tour.getAllTour(nTT);
				}
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("listTourDuLichNuocNgoai", listTourDuLichNuocNgoai);
		request.getRequestDispatcher("/NEWPROJECT/html/DuLichNuocNgoai.jsp").forward(request, response);
			
		
	}
}
