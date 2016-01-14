package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.HandBookImp;
import Model.HandBook;

/**
 * Servlet implementation class ThongTinCamNanDuLich
 */
@WebServlet("/ThongTinCamNanDuLich")
public class ThongTinCamNanDuLich extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThongTinCamNanDuLich() {
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
		HttpSession session = request.getSession();
		String idHandBook = request.getParameter("xemThem");//bien duoc gui qua tu xem them
		HandBookImp handBookImp = new HandBookImp();
		HandBook handBook = handBookImp.getInfoHandBook(idHandBook);
		session.setAttribute("handbook", handBook);
		request.getRequestDispatcher("NEWPROJECT/html/ThongTinCamNanDuLich.jsp").forward(request, response);
		
		
		
	}
}
