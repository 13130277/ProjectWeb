package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAOMVC;
import DB.ConnectionDB;
import Model.ModelMVC;
import Model.User;

/**
 * Servlet implementation class DangKySl
 */
@WebServlet("/DangKySl")
public class DangKySl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangKySl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		todo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		todo(request, response);
	}

	private void todo(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rpassword = request.getParameter("rpassword");
		
		ModelMVC m = new ModelMVC();
		m.setFullName(fullname);
		m.setEmail(email);
		m.setAddress(address);
		m.setPhone(phone);
		m.setUsername(username);
		m.setPassword(password);
		m.setRpassword(rpassword);
		
		String sql = "INSERT INTO USER value(?,?,?,?,?,?)";
		int  i =  DAOMVC.dangKyUser(m, sql);
	}
}
