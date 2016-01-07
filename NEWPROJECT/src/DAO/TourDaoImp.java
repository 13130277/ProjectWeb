package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

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
		return null;
	}

	@Override
	public ArrayList<Tour> getAllTour(String sql) {
		ArrayList<Tour> listTour = new ArrayList<>();
		try {
		Connection con = ConnectionDB.getConnection();
		Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.println("abcd");
				Tour tour = new Tour();
				tour.setIdTour(rs.getString("idTour"));
				System.out.println(tour.getIdTour());
				tour.setTourType(new Tour_Type(rs.getString("idTourType"), rs.getString("nameTourType"), rs.getString("parent")));
				System.out.println(tour.getTourType().toString());
				tour.setNameTour(rs.getString("nameTour"));
				System.out.println(tour.getNameTour());
				tour.setDeparture(new Date(rs.getDate("departure").getTime()));
				System.out.println(tour.getDeparture());
				tour.setEnd(new Date(rs.getDate("end").getTime()));
				System.out.println(tour.getEnd());
				tour.setAmountDays(rs.getInt("amountDays"));
				tour.setContent(rs.getString("content"));
				tour.setPrice(rs.getDouble("price"));
				tour.setShortContent(rs.getString("shortContent"));
				listTour.add(tour);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listTour;
	
		}
}
