package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.ConnectionDB;
import Model.Tour;
import Model.Tour_Type;

public class TourDaoImp implements TourDao{

	@Override
	public boolean deleteTour(String sql) {

		return false;
	}

	@Override
	public void deleteAllTour(String sql) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Tour> getInfoTour(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tour> getAllTour(String sql) {
		ArrayList<Tour> listTour = new ArrayList<>();
		try {
		Connection con = ConnectionDB.getConnection();
			PreparedStatement ps;
				ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Tour tour = new Tour();
				tour.setIdTour(rs.getString(1));
				tour.setTourType(new Tour_Type(rs.getString(10), rs.getString(11), rs.getString(12)));
				tour.setNameTour(rs.getString(3));
				tour.setDeparture(rs.getDate(2));
				tour.setEnd(rs.getDate(5));
				tour.setAmountDays(rs.getInt(6));
				tour.setContent(rs.getString(7));
				tour.setPrice(rs.getDouble(8));
				tour.setShortContent(rs.getString(9));
				listTour.add(tour);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listTour;
	
		}
}
