package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.ConnectionPool;
import Model.User;

public class UserDaoImp implements UserDao {

	@Override
	public ArrayList<User> getAll(int limit, int offset) {
		ArrayList<User> result = new ArrayList<>();
		String sql = "select * from user limit ? offset ?";
		Connection con = new ConnectionPool().getConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps = con.prepareStatement("select * from user limit ? offset ?");
			ps.setInt(1, limit);
			ps.setInt(2, offset);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setIdUser(rs.getString("idUser"));
				user.setFullName(rs.getString("fullName"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("userName"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
				user.setImg(rs.getString("img"));
				user.setActive(rs.getInt("active"));
				result.add(user);
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteaCustomer(String idUser) {
		String sql = "DELETE FROM user WHERE idUser = ?";
		Connection con = new ConnectionPool().getConnection();
		boolean result = false;
		try {
			PreparedStatement delpd = con.prepareStatement(sql);
			delpd.setString(1, idUser);
			int number = delpd.executeUpdate();
			if (number > 0) {
				result = true;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

	@Override
	public boolean deleteAllCustomer() {
		String sql = "DELETE FROM customer";
		Connection con = new ConnectionPool().getConnection();
		boolean result = false;
		try {
			PreparedStatement delallpd = con.prepareStatement(sql);
			int number = delallpd.executeUpdate();
			if (number > 0) {
				result = true;
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean register( String fullName, String userName, String email,  String pass,
			String phone, String address) {
		String sql = "INSERT INTO `user`(idUser, fullName, userName, email, pass, phone, address, active) VALUES ('US0010',?,?,?,?,?,?,0)";
		boolean result = false;
		Connection con = new ConnectionPool().getConnection();
		try {
			PreparedStatement sqlr = con.prepareStatement(sql);
			sqlr.setString(1, fullName);
			sqlr.setString(2, userName);
			sqlr.setString(3, email);
			sqlr.setString(4, pass);
			sqlr.setString(5, phone);
			sqlr.setString(6, address);

			int number = sqlr.executeUpdate();
			if (number > 0) {
				result = true;
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean checkRegister(String userName) {
		String sql = "select * from user where userName = ?";
		boolean result = false;
		Connection con = new ConnectionPool().getConnection();
		try {
		PreparedStatement sqlu = con.prepareStatement(sql);
			sqlu.setString(1, userName);
			ResultSet rs = sqlu.executeQuery();
			while (rs.next()) {
				result = true;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean checkEmail(String email) {
		String sql = "select * from user where email = ?";
		boolean result = false;
		Connection con = new ConnectionPool().getConnection();
		try {
		PreparedStatement sqlu = con.prepareStatement(sql);
			sqlu.setString(1, email);
			ResultSet rs = sqlu.executeQuery();
			while (rs.next()) {
				result = true;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean checkLogin(User user) {
		String sql = "select * from user where userName = ? AND pass = ?";
		boolean result = false;
		Connection c = new ConnectionPool().getConnection();
		try {
		PreparedStatement sqll = c.prepareStatement(sql);

			sqll.setString(1, user.getUserName());
			sqll.setString(2, user.getPass());   			
			ResultSet rs =  sqll.executeQuery();
			
			while(rs.next() == true) {
				result = true;
				
				break;
			}
			
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean changepass(String userName, String pass) {
		boolean result = false;
		String sql = "update user set pass = ? where userName = ?";
		Connection con = new ConnectionPool().getConnection();
		try {
		PreparedStatement sqlcp = con.prepareStatement(sql);
			sqlcp.setString(1, pass); 
			sqlcp.setString(2, userName); 
			int number = sqlcp.executeUpdate();
			if (number > 0) {
				result = true;
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean checkpass(String userName, String pass) {
		String sql = "select * from user where userName = ? and pass = ?";
		boolean result = false;
		Connection con = new ConnectionPool().getConnection();
		try {
		PreparedStatement sqlcpa = con.prepareStatement(sql);

			sqlcpa.setString(1, userName);
			sqlcpa.setString(2, pass);
			ResultSet rs = sqlcpa.executeQuery();
			while (rs.next()) {
				result = true;
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean checkforgotpass(String user, String mail) {
		String sql = "select * from user where userName = ? AND email = ?";
		boolean result = false;
		Connection c = new ConnectionPool().getConnection();
		try {
		PreparedStatement sqlf = c.prepareStatement(sql);
			sqlf.setString(1, user);
			sqlf.setString(2, mail);
			ResultSet rs =  sqlf.executeQuery();
			
			while(rs.next() == true) {
				result = true;
				break;
			}
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public String getpassforgot(String user, String mail) {
		String sql = "select pass from user where userName = ? AND email = ?";
		Connection con = new ConnectionPool().getConnection();
		String password = "null";
		try {
    	PreparedStatement sqlgp = con.prepareStatement(sql);
			sqlgp = con.prepareStatement(sql);
			sqlgp.setString(1, user);
			sqlgp.setString(2, mail);
			ResultSet rs = sqlgp.executeQuery();
	        while (rs.next()) { 	        	
	        	password = rs.getString("pass");
	        }
		
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;
	}

	@Override
	public User getUserInfo(String idUser) {
		String sql ="select * from user where idUser = ?";
		Connection c = new ConnectionPool().getConnection();
		User us = new User();
		try {
		PreparedStatement sqlui = c.prepareStatement(sql);
			sqlui.setString(1, idUser);
			ResultSet rs =  sqlui.executeQuery();   			
			if (rs.next()) {
				us.setIdUser(rs.getString("idUser"));
				us.setFullName(rs.getString("fullName"));
				us.setUserName(rs.getString("userName"));
				us.setEmail(rs.getString("email"));
				us.setImg(rs.getString("img"));
				us.setPhone(rs.getString("phone"));
				us.setAddress(rs.getString("address"));
			}
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return us;
	}

	@Override
	public int countercustomer() {
		String sql = "select count(idUser) from user";
		int countercustomer = 1;
		Connection con = new ConnectionPool().getConnection();
		try {
		PreparedStatement ct = con.prepareStatement(sql);
	        ResultSet rs = ct.executeQuery();
	        while (rs.next()) { 	        	
	        	countercustomer = rs.getInt(1);
	        }
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return countercustomer;
	}

public static void main(String[] args) {
	UserDaoImp daoImp = new UserDaoImp();
//	for (User user : daoImp.getAll(4, 0)) {
//		System.out.println(user.toString());
//	}
//	System.out.println(daoImp.deleteaCustomer("utLT11"));
//	daoImp.register("US002", "Trần Ngọc Minh Thư", "Minh Thư", "longnguyen11095@gmail.com"," lientam", "ngocTam", "01672651508", "Linh Trung 01");
	System.out.println(daoImp.getpassforgot("Minh Thư", "longnguyen110995@gmail.com"));
}
}
