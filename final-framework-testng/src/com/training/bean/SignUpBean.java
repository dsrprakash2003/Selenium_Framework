package com.training.bean;

public class SignUpBean {
	
	private String FirstName;
	private String LastName;
	private String Email;
	private String UserName;
	private String Pwd;
	private String CPwd;
	private String Phone;
	private String Lang;
	

	public SignUpBean() {
	}

	public SignUpBean(String FirstName, String LastName, String Email, String UserName, String Pwd, String CPwd, String Phone, String Lang) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.UserName = UserName;
		this.Pwd = Pwd;
		this.CPwd = CPwd;
		this.Phone = Phone;
		this.Lang = Lang;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	
	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String Pwd) {
		this.Pwd = Pwd;
	}
	
	public String getCPwd() {
		return CPwd;
	}

	public void setCPwd(String CPwd) {
		this.CPwd = CPwd;
	}
	
	public String getPhone() {
		return Phone;
	}

	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	
	public String getLang() {
		return Lang;
	}

	public void setLang(String Lang) {
		this.Lang = Lang;
	}	

	


}
