package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TourDaoImp;
import Model.Tour;

/**
 * Servlet implementation class ThongTinTour
 */
@WebServlet("/ThongTinTour")
public class ThongTinTour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThongTinTour() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo(request,response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo(request,response);
		
	}
	private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("xemThem");//xem them nhan vao gia tri id cua tour
		HttpSession session = request.getSession();
		TourDaoImp tourDaoImp = new TourDaoImp();
		Tour tour = tourDaoImp.getInfoTour(param);
		session.setAttribute("thongTinTour", tour);
		request.getRequestDispatcher("NEWPROJECT/html/ThongTinTour.jsp").forward(request, response);		
	}

}
