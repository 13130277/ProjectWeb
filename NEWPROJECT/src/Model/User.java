package Model;


public class User {
    @Override
	public String toString() {
		return "User [idUser=" + idUser + ", fullName=" + fullName + ", userName=" + userName + ", email=" + email
				+ ", pass=" + pass + ", phone=" + phone + ", address=" + address + ", active=" + active + ", img=" + img
				+ "]";
	}

	private String idUser;
    private String fullName;
    private String userName;
    private String email;
    private String pass;
    private String phone;
    private String address;
    private int active;
    private String img;
    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public User() {
    }

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

    
  
}
