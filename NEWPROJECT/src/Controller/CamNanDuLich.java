package Controller;

import java.io.IOException; 
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.HandBookImp;
import Model.HandBook;

/**
 * Servlet implementation class CamNanDuLich
 */
@WebServlet("/CamNanDuLich")
public class CamNanDuLich extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CamNanDuLich() {
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
		HandBookImp handBookImp = new HandBookImp();
		ArrayList<HandBook> listAllHandBook = handBookImp.getAllHandBook();
		HttpSession session = request.getSession();
<<<<<<< HEAD
		session.setAttribute("listAllHandBook", listAllHandBook);
		request.getRequestDispatcher("/NEWPROJECT/html/Camnangdulich.jsp").forward(request, response);
=======
		session.setAttribute("listTourDuLichNuocNgoai", listAllHandBook);
		request.getRequestDispatcher("/NEWPROJECT/html/CamNangDuLich.jsp").forward(request, response);
>>>>>>> a0d980a5e37ea795083aaf857548dbbe1018255d
	}
}
