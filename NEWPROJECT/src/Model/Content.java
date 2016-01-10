package Model;

import java.util.ArrayList;

public class Content {
	private String idContent;
	private String nameContent;
	private ArrayList<SmallContent> listSmallContent;
	public Content() {
	}
	public Content(String idContent, String nameContent, ArrayList<SmallContent> listSmallContent) {
		this.idContent = idContent;
		this.nameContent = nameContent;
		this.listSmallContent = listSmallContent;
	}
	public String getIdContent() {
		return idContent;
	}
	public void setIdContent(String idContent) {
		this.idContent = idContent;
	}
	public String getNameContent() {
		return nameContent;
	}
	public void setNameContent(String nameContent) {
		this.nameContent = nameContent;
	}
	public ArrayList<SmallContent> getListSmallContent() {
		return listSmallContent;
	}
	public void setListSmallContent(ArrayList<SmallContent> listSmallContent) {
		this.listSmallContent = listSmallContent;
	}
	

}
