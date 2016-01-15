package Controller;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.UserDaoImp;

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

		String fullName = request.getParameter("fullname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("userName");
		String pass = request.getParameter("pass");
		String rePass = request.getParameter("rePass");
		boolean flag = true;
		if (fullName.length() < 1) {
			request.setAttribute("fullName", "Bạn chưa nhập họ và tên");
			flag = false;
		} else if (count(fullName) < 2) {
			request.setAttribute("fullName", "Bạn cần nhập đầy đủ họ và tên");
			flag = false;
		} else {
			request.setAttribute("fullNameTrue", fullName);
		}
		if (email.equals("")) {
			request.setAttribute("email", "Bạn chưa nhập địa chỉ mail");
			flag = false;
		} else {
			request.setAttribute("emailTrue", email);
		}
		if (address.equals("")) {
			request.setAttribute("address", "Bạn chưa nhập địa chỉ ");
			flag = false;
		} else {
			request.setAttribute("addressTrue", address);
		}
		if (phone.length() < 10 || phone.length() > 11) {
			request.setAttribute("phone", "Bạn hãy nhập lại số điện thoại");
			flag = false;
		} else {
			request.setAttribute("phoneTrue", phone);
		}
		if (userName.equals("")) {
			request.setAttribute("userName", "Bạn chưa đặt tên tài khoản của mình ");
			flag = false;
		} else {
			request.setAttribute("userNameTrue", userName);
		}
		if (!checkPass(pass, rePass) || pass.length() < 6) {
			request.setAttribute("pass", "Hãy nhập lại mật khẩu ");
			flag = false;
		}
		if (flag) {
			UserDaoImp u = new UserDaoImp();
			if (u.checkEmail(email)) {
				request.setAttribute("email", "Đại chỉ mail này đã được đăng ký");
				request.setAttribute("emailTrue", "");
				request.getRequestDispatcher("/NEWPROJECT/html/DangKy.jsp").forward(request, response);
			}
			if (u.checkRegister(userName)) {
				System.out.println("ngọc Tâm");
				request.setAttribute("userName", "Tên tài khoản này đã được đăng ký");
				request.setAttribute("userNameTrue", "");
				request.getRequestDispatcher("/NEWPROJECT/html/DangKy.jsp").forward(request, response);
			}
				u.register(fullName, userName, email, pass, phone, address);
			

		} else {
			request.getRequestDispatcher("/NEWPROJECT/html/DangKy.jsp").forward(request, response);

		}
	}

	private boolean checkPass(String pass, String rePass) {
		if (pass.equals(rePass)) {
			return true;
		}
		return false;
	}

	private int count(String string) {
		StringTokenizer tk = new StringTokenizer(string);
		return tk.countTokens();
	}

}
