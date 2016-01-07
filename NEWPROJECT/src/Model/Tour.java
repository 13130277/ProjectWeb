package Model;

import java.sql.Date;
import java.util.ArrayList;

public class Tour {
	private String idTour;
	private Tour_Type tourType;
	private String nameTour;
	private Date departure;
	private Date end;
	private int amountDays;
	private String content;
	private double price;
	private String shortContent;
	public Tour() {
	}
	public String getIdTour() {
		return idTour;
	}
	public void setIdTour(String idTour) {
		this.idTour = idTour;
	}
	public Tour_Type getTourType() {
		return tourType;
	}
	public void setTourType(Tour_Type idTourType) {
		this.tourType = idTourType;
	}
	public String getNameTour() {
		return nameTour;
	}
	public void setNameTour(String nameTour) {
		this.nameTour = nameTour;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public int getAmountDays() {
		return amountDays;
	}
	public void setAmountDays(int amountDays) {
		this.amountDays = amountDays;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getShortContent() {
		return shortContent;
	}
	public void setShortContent(String shortContent) {
		this.shortContent = shortContent;
	}
	public ArrayList<IMG> getList() {
		return list;
	}
	public void setList(ArrayList<IMG> list) {
		this.list = list;
	}
	public Tour(String idTour, Tour_Type idTourType, String nameTour, Date departure, Date end, int amountDays,
			String content, double price, String shortContent, ArrayList<IMG> list) {
		super();
		this.idTour = idTour;
		this.tourType = idTourType;
		this.nameTour = nameTour;
		this.departure = departure;
		this.end = end;
		this.amountDays = amountDays;
		this.content = content;
		this.price = price;
		this.shortContent = shortContent;
		this.list = list;
	}
	private ArrayList<IMG> list;
	
	
}
