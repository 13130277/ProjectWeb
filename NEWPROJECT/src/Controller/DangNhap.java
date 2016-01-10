//package Controller;
//
//import java.io.IOException;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import DB.ConnectionDB;
//import Model.User;
//
///**
// * Servlet implementation class DangNhap
// */
//@WebServlet("/DangNhap")
//public class DangNhap extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public DangNhap() {
//		super();
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		todo(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		todo(request, response);
//	}
//
//	private void todo(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
//		String uname = request.getParameter("uname");
//		String pass = request.getParameter("pass");
//		String sql = "Select * from user where userName='" + uname +"' and pass=" + pass + " and active =1 ";
//		ResultSet rs = null;
//		try {
//			rs = ((Object) ConnectionDB.getConnection()).executeQuery(sql);
//			rs.last();
//			int i = rs.getRow();
//			if (rs != null && i == 1) {
//				rs.first();
//				User u = new User();
//				u.setId(rs.getInt(1));
//				u.setUname(rs.getString(2));
//				u.setPass("");
//				u.setActive(rs.getInt(5));
//				HttpSession session = request.getSession();
//				session.setAttribute("user", u);
//				response.sendRedirect("NEWPROJECT/home.jsp");
//			} else {
//				request.setAttribute("err", " sai user name ");
//				request.getRequestDispatcher("dangNhap.jsp").forward(request, response);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Loi Ket Noi CSDL");
//			request.getRequestDispatcher("dangNhap.jsp").forward(request, response);
//		}
//
//	}
//	
//
//}
