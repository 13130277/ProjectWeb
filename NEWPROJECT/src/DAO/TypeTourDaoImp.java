package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DB.ConnectionDB;
import Model.Tour_Type;
public class TypeTourDaoImp implements TypeTourDao{

	@Override
	public ArrayList<Tour_Type> getListTourTypeParent(String tourParent) {
		String sql = "SELECT idTourType, nameTourType, parent FROM tour_type WHERE parent=?";
		Connection con = ConnectionDB.getConnection();
		ArrayList<Tour_Type> listTourType = new ArrayList<>();
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			ps.setString(1, tourParent);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Tour_Type tour_Type = new Tour_Type();
				tour_Type.setIdTourType(rs.getString("idTourType"));
				tour_Type.setNameType(rs.getString("nameTourType"));
				tour_Type.setParent(rs.getString("parent"));
				listTourType.add(tour_Type);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listTourType;
	}

}
