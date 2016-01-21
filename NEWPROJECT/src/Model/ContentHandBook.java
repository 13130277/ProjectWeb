package Model;

public class ContentHandBook {
	String idContentHB;
	String content;
	String id_img;
	String idHandBook;
	public ContentHandBook(String idContentHB, String content, String id_img,
			String idHandBook) {
		super();
		this.idContentHB = idContentHB;
		this.content = content;
		this.id_img = id_img;
		this.idHandBook = idHandBook;
	}
	public String getIdContentHB() {
		return idContentHB;
	}
	public void setIdContentHB(String idContentHB) {
		this.idContentHB = idContentHB;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId_img() {
		return id_img;
	}
	public void setId_img(String id_img) {
		this.id_img = id_img;
	}
	public String getIdHandBook() {
		return idHandBook;
	}
	public void setIdHandBook(String idHandBook) {
		this.idHandBook = idHandBook;
	}
	
}
