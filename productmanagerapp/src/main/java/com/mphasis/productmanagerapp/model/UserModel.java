package com.mphasis.productmanagerapp.model;

public class UserModel {
	private String login;
	private String password;
	UserModel(){
		
	}
	public UserModel(String lg,String ps) {
		this.login=lg;
		this.password=ps;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}


}
