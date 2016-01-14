package DAO;

import java.util.ArrayList;

import Model.User;

public interface UserDao {
    public ArrayList<User> getAll(int limit, int offset);
 	public boolean deleteaCustomer(String idUser);
    public boolean deleteAllCustomer();
    public boolean register( String fullName, String userName, String email,  String pass, String phone, String address);
	public boolean checkRegister(String userName);
	public boolean checkEmail(String Email);
	public boolean checkLogin(User user) ;
	public boolean changepass(String userName, String pass) ;
	public boolean checkpass(String userName, String pass) ;
	public boolean checkforgotpass(String user, String mail);
	public String getpassforgot(String user, String mail);
	public User getUserInfo(String idUsers);
	public int countercustomer();

}
