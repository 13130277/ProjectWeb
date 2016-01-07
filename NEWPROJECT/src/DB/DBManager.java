package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import Model.Tour;

public class DBManager {
	public static Connection conn = ConnectionDB.getInstance().getConnection();

	public static void insert(Tour tour) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		String sql = "INSERT INTO `tour`(`idTour`, `nameTour`, `departure`, `end`, `amountDays`, `content`, `price`) VALUES ( ?,?,?,?,?,?,?)";
		PreparedStatement statement =  conn.prepareStatement(sql);//'007', 'Đà Lạt', '22/12/2015', '26/12/2015', 4, 'du lịch Đà Lạt', '270000')
		statement.setString(1, tour.getIdTour());
		statement.setString(2, tour.getNameTour());
//		statement.setString(3, tour.g());
//		statement.setString(4, tour.getIdTour());
//		statement.setString(5, tour.getIdTour());
		statement.setString(6, tour.getContent());
//		statement.setString(6, tour.getIdTour());
		ConnectionDB.getInstance().close();
	}

}
