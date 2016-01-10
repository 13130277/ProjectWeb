package DAO;

import java.util.ArrayList;

import Model.Tour;

public interface TourDao {
	public boolean deleteTour(String sql);
	
	public ArrayList<Tour> getInfoTour(String sql);
	public ArrayList<Tour> getAllTour(String tour_type);

}
