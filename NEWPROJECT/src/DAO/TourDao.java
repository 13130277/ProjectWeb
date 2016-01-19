package DAO;

import java.util.ArrayList;

import Model.Content;
import Model.SmallContent;
import Model.Tour;

public interface TourDao {
	public boolean deleteTour(String sql);
	public ArrayList<Tour> getAllTour(String parrent);
	public ArrayList<Tour> getAllTourWithParent(String tour_type);
	public Tour getInfoTour(String idTour);
	public ArrayList<Tour> getTourHot(int limit ,int offset);
	public ArrayList<SmallContent> getListSmallContent(String idContent);
	public ArrayList<Content> getListContent(String idTour);

}
