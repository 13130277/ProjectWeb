package Model;


import java.util.ArrayList;
import java.util.Date;

public class Tour {
	private String idTour;
	private Tour_Type tourType;
	private String nameTour;
	private String img;
	private Date departure;
	private Date end;
	private int amountDays;
	private ArrayList<Content> content;
	private double oldPrice;
	private double newPrice;
	private String shortContent;
	private int adults;
	
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public Tour() {
	}
	public Tour(String idTour, Tour_Type tourType, String nameTour,String img, Date departure, Date end, int amountDays,
			ArrayList<Content> content, double oldPrice, double newPrice, String shortContent) {
		this.img = img;
		this.idTour = idTour;
		this.tourType = tourType;
		this.nameTour = nameTour;
		this.departure = departure;
		this.end = end;
		this.amountDays = amountDays;
		this.content = content;
		this.oldPrice = oldPrice;
		this.newPrice = newPrice;
		this.shortContent = shortContent;
		this.setAdults(1);
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
	public void setTourType(Tour_Type tourType) {
		this.tourType = tourType;
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
	public ArrayList<Content> getContent() {
		return content;
	}
	public void setContent(ArrayList<Content> content) {
		this.content = content;
	}
	public double getOldPrice() {
		return oldPrice;
	}
	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}
	public double getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}
	public String getShortContent() {
		return shortContent;
	}
	public void setShortContent(String shortContent) {
		this.shortContent = shortContent;
	}
	
	public static void main(String[] args) {
		
	}
}
