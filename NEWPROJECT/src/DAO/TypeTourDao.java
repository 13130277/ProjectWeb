package DAO;

import java.util.ArrayList;

import Model.Tour_Type;

public interface TypeTourDao {
public ArrayList<Tour_Type> getListTourTypeParent(String typeTourParent);
}
