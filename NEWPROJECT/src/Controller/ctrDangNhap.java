package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDaoImp;
import Model.User;

/**
 * Servlet implementation class ctrDangNhap
 */
@WebServlet("/ctrDangNhap")
public class ctrDangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ctrDangNhap() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		toDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		toDo(request, response);
	}

	private void toDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		UserDaoImp daoImp = new UserDaoImp();
		if (daoImp.checkEmail(email)) {
			if (!daoImp.checkpass(email, pass)) {
				request.setAttribute("pass", "pass không đúng");
				request.setAttribute("emailTrue", email);
				request.getRequestDispatcher("NEWPROJECT/html/login.jsp").forward(request, response);
			}else{
			HttpSession session = request.getSession();
			UserDaoImp u = new UserDaoImp();
			User us = u.getUser(email);
			session.setAttribute("user", us);
			request.getRequestDispatcher("/LoadDataHome").forward(request, response);
			}
		} else {
			request.setAttribute("email", "email không tồn tại");
			request.getRequestDispatcher("NEWPROJECT/html/login.jsp").forward(request, response);
		}
	}

}
