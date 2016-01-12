package Model;

public class SmallContent {
private String idSmallConTent;
private String content;
private String img;
public SmallContent(String idSmallConTent, String img, String content) {
	this.idSmallConTent = idSmallConTent;
	this.img = img;
	this.content = content;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
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
