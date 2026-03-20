package com.mphasis.productmanagerapp.service;

import com.mphasis.productmanagerapp.model.UserModel;

public class LoginService {

	
	public boolean check(UserModel us) {
		if(us.getLogin().equals("Kou") && us.getPassword().equals("123"))
			return true;
		else
			return false;
		
	}
}
