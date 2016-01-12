package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import DB.ConnectionDB;
import Model.Content;
import Model.SmallContent;
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
	public ArrayList<Tour> getAllTour(String parent) {
		String sql = "SELECT* FROM tour inner join tour_type on tour.idTourType = tour_type.idTourType WHERE parent=?";
		ArrayList<Tour> listTour = new ArrayList<>();
		try {
			Connection con = ConnectionDB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, parent);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tour tour = new Tour();
				tour.setIdTour(rs.getString("idTour"));
				System.out.println(tour.getIdTour());
				tour.setTourType(new Tour_Type(rs.getString("idTourType"), rs.getString("nameTourType"),
						rs.getString("parent")));
				tour.setImg(rs.getString("mainImg"));
				System.out.println(tour.getTourType().toString());
				tour.setNameTour(rs.getString("nameTour"));
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

	@Override
	public ArrayList<Tour> getAllTourWithParent(String tour_type) {
		String sql = "SELECT* FROM tour inner join tour_type on tour.idTourType = tour_type.idTourType WHERE tour.idTourType='?'AND parent ='Du Lịch Trong Nước'";
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
				tour.setTourType(new Tour_Type(rs.getString("idTourType"), rs.getString("nameTourType"),
						rs.getString("parent")));
				System.out.println(tour.getTourType().toString());
				tour.setNameTour(rs.getString("nameTour"));
				// System.out.println(tour.getNameTour());
				// tour.setImg(rs.getString("mainImg"));
				// System.out.println(tour.getImg());
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



	@Override
	public ArrayList<SmallContent> getListSmallContent(String idContent) {
		String sql ="SELECT * FROM `small_content` WHERE idContenTour =?";
		ArrayList<SmallContent> listSmallContent = new ArrayList<>();
		try {
		Connection connection = ConnectionDB.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, idContent);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			SmallContent smallContent = new SmallContent();
			smallContent.setIdSmallConTent(rs.getString("idSmallContent"));
			smallContent.setContent(rs.getString("content"));
			smallContent.setImg(rs.getString("id_img"));
			listSmallContent.add(smallContent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return listSmallContent;
	}

	@Override
	public ArrayList<Content> getListContent(String idTour) {
		String sql ="SELECT * FROM content_tour WHERE idTour =?";
		ArrayList<Content> listContentTour = new ArrayList<>();
		try {
		Connection connection = ConnectionDB.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, idTour);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			Content content = new Content();
			content.setIdContent(rs.getString("idContenTour"));
			content.setNameContent(rs.getString("content"));
			content.setListSmallContent(getListSmallContent(rs.getString("idContenTour")));
			listContentTour.add(content);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listContentTour;
	}

	@Override
	public Tour getInfoTour(String idTour) {
		String sql ="SELECT * FROM tour WHERE idTour =?";
		Tour tour = new Tour();
		try {
		Connection connection = ConnectionDB.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, idTour);
			ResultSet rs = ps.executeQuery();
			tour.setIdTour(rs.getString("idTour"));
			System.out.println(tour.getIdTour());
			tour.setTourType(new Tour_Type(rs.getString("idTourType"), rs.getString("nameTourType"),
					rs.getString("parent")));
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
			tour.setContent(getListContent(idTour));
			tour.setOldPrice((rs.getInt("oldPrice")));
			System.out.println(tour.getOldPrice());
			tour.setNewPrice(rs.getInt("newPrice"));
			System.out.println(tour.getNewPrice());
			tour.setShortContent(rs.getString("shortContent"));
			System.out.println(tour.getShortContent());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tour;
	}
	
}
