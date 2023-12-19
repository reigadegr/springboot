package cn.edu.bcu.eshop.domain;

public class TUser {
	private Integer id;
	private String userName;
	private String psw;
	private String phone;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPsw() {
		return psw;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPsw(String psw) {
		this.psw = psw;
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
	
	
}

