package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	static ConnectionDB instance = null;
	static Connection connection = null;
	public ConnectionDB() {
	}

	public static  ConnectionDB getInstance() {
		if (instance==null)
			instance = new ConnectionDB();
		

		return instance;
		
	}	
	public static boolean openConnection (){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?setUnicode=true&characterEncoding=UTF-8", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}
	public static Connection getConnection(){
		if (connection == null) {
			if (openConnection()) {
				System.out.println("open Connection");
				return connection;
			}else {
				return null;
			}
			
		}
		return connection;
		
	}
	public void close(){
		System.err.println("Closing connection");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	}

}
