package Model;

public class Tour_Type {
String idTourType;
String nameType;
String parent;
public Tour_Type() {
}

public Tour_Type(String idTourType, String nameType, String  parent) {
	this.idTourType = idTourType;
	this.nameType = nameType;
	this.parent = parent;
}

@Override
public String toString() {
	return "Tour_Type [idTourType=" + idTourType + ", nameType=" + nameType + ", parent=" + parent + "]";
}

public String getParent() {
	return parent;
}

public void setParent(String parent) {
	this.parent = parent;
}

public String getIdTourType() {
	return idTourType;
}
public void setIdTourType(String idTourType) {
	this.idTourType = idTourType;
}
public String getNameType() {
	return nameType;
}
public void setNameType(String nameType) {
	this.nameType = nameType;
}

}
