package Model;

import java.util.ArrayList;

public class HandBook {
String idHandBook;
String title;
ArrayList<Content> content;
String shortContent;
String id_img;
public HandBook() {
}
public HandBook(String idHandBook, ArrayList<Content> content, String shortContent, String mainImg, String title) {
	super();
	this.idHandBook = idHandBook;
	this.content = content;
	this.shortContent = shortContent;
	this.title = title;
	this.id_img = mainImg;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getMainImg() {
	return id_img;
}
public void setMainImg(String mainImg) {
	this.id_img = mainImg;
}
public String getIdHandBook() {
	return idHandBook;
}
public void setIdHandBook(String idHandBook) {
	this.idHandBook = idHandBook;
}
public ArrayList<Content> getContent() {
	return content;
}
public void setContent(ArrayList<Content> content) {
	this.content = content;
}
public String getShortContent() {
	return shortContent;
}
public void setShortContent(String shortContent) {
	this.shortContent = shortContent;
}

}
