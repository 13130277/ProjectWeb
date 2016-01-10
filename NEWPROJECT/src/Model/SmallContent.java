package Model;

public class SmallContent {
private String idSmallConTent;
private String img;
public SmallContent(String idSmallConTent, String img) {
	this.idSmallConTent = idSmallConTent;
	this.img = img;
}
public SmallContent() {
}
public String getIdSmallConTent() {
	return idSmallConTent;
}
public void setIdSmallConTent(String idSmallConTent) {
	this.idSmallConTent = idSmallConTent;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}

}
