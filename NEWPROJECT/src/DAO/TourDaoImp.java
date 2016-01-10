package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import DB.ConnectionDB;
import Model.Tour;
import Model.Tour_Type;

public class TourDaoImp implements TourDao {

	@Override
	public boolean deleteTour(String idTour) {
		try {
			Connection con = ConnectionDB.getConnection();
			String sql = "DELETE FROM tour WHERE idTour=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, idTour);
			ps.executeUpdate();
			System.out.println("Xóa Thành Công");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public ArrayList<Tour> getInfoTour(String sql) {
		
		return null;
	}

	@Override
	public ArrayList<Tour> getAllTour( String tour_type) {
		String sql = "SELECT* FROM tour inner join tour_type on tour.idTourType = tour_type.idTourType WHERE parent=?";
		ArrayList<Tour> listTour = new ArrayList<>();
		try {
			Connection con = ConnectionDB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tour_type);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tour tour = new Tour();
				tour.setIdTour(rs.getString("idTour"));
				System.out.println(tour.getIdTour());
				tour.setTourType(new Tour_Type(rs.getString("idTourType"),rs.getString("nameTourType"), rs.getString("parent")));
				System.out.println(tour.getTourType().toString());
				tour.setNameTour(rs.getString("nameTour"));
				System.out.println(tour.getNameTour());
				tour.setImg(rs.getString("mainImg"));
				System.out.println(tour.getImg());
				tour.setDeparture(new Date(rs.getDate("departure").getTime()));
				System.out.println(tour.getDeparture());
				tour.setEnd(new Date(rs.getDate("end").getTime()));
				System.out.println(tour.getEnd());
				tour.setAmountDays(rs.getInt("amountDays"));
				System.out.println(tour.getAmountDays());
				tour.setOldPrice((rs.getInt("oldPrice")));
				System.out.println(tour.getOldPrice());
				tour.setNewPrice(rs.getInt("newPrice"));
				System.out.println(tour.getNewPrice());
				tour.setShortContent(rs.getString("shortContent"));
				System.out.println(tour.getShortContent());
				listTour.add(tour);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listTour;

	}
}
