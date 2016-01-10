package Test;


import java.util.ArrayList;

import DAO.TourDaoImp;
import Model.Tour;
public class Test {

	public static void main(String[] args) {
		TourDaoImp tour  = new TourDaoImp();
		String sql2 = "SELECT* FROM tour inner join tour_type on tour.idTourType = tour_type.idTourType;";
		ArrayList<Tour> listTour = tour.getAllTour(sql2);
		System.out.println(listTour.size()+"LienTamTest");
		for (Tour tour2 : listTour) {
			System.out.println(tour2.getNameTour());
//			System.out.println(tour2.getPrice());
			System.out.println(tour2.getContent());
			System.out.println(tour2.getShortContent());
			
		}
//		String idTour = "DL03";
//		tour.deleteTour(idTour);
//		String sl = "SELECT * FROM tour ";
//		TourDaoImp tour = new TourDaoImp();
//		System.out.println(listTour.size());
//		for (Tour tour2 : listTour) {
//			System.out.println(tour2.toString());
//			
//		}
	}

}
