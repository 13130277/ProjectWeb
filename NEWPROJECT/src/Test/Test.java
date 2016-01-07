package Test;


import DAO.TourDaoImp;
import DAO.TypeTourDaoImp;
import Model.Tour;
import Model.Tour_Type;
public class Test {

	public static void main(String[] args) {
		TypeTourDaoImp typeTour = new TypeTourDaoImp();
		String sql = "SELECT `idTourType`, `nameTourType`, `parent` FROM `tour_type` WHERE `parent`='TrongNuoc'";
		for (Tour_Type los : typeTour.getListTourType(sql)) {
			System.out.println(los.getNameType());
		}
		TourDaoImp tour  = new TourDaoImp();
		String sql2 = "SELECT* FROM tour inner join tour_type on tour.idTourType = tour_type.idTourType;";
		for (Tour tour2 : tour.getAllTour(sql2)) {
			System.out.println(tour2.getPrice());
			
		}
	}

}
