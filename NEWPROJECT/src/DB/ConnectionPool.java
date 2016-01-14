package DB;

import java.sql.Connection;

public class ConnectionPool {
	public Connection getConnection() {
		Connection connection = null;
			connection = ConnectionDB.getConnection();
		
		return connection;
	}

	public static void main(String[] args) {
		ConnectionPool c = new ConnectionPool();
		System.out.println(c.getConnection());
	}

}
