package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDaoImp;
import Model.User;

/**
 * Servlet implementation class mainDangKy
 */
@WebServlet("/ControlDangKy")
public class ControlDangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlDangKy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo(request, response);
	}

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName = request.getParameter("fullName");
		System.out.println(fullName);
		String userName =request.getParameter("userName");
		System.out.println(userName);
		String email=request.getParameter("email");
		System.out.println(email);
		String pass = request.getParameter("pass");
		System.out.println(pass);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		String address = request.getParameter("address");
		System.out.println(address);
		UserDaoImp uImp = new UserDaoImp();
		boolean flag = uImp.register( fullName, userName, email, pass, phone, address);
//		request.getRequestDispatcher("NEWPROJECT/dangNhap.jsp").forward(request, response);
	}

}
