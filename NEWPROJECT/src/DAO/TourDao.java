package DAO;

import java.util.ArrayList;

import Model.Tour;

public interface TourDao {
	public boolean deleteTour(String sql);
	public void deleteAllTour(String sql);
	public ArrayList<Tour> getInfoTour(String sql);
	public ArrayList<Tour> getAllTour(String sql);

}
