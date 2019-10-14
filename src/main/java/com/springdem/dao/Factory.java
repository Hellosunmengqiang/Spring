package com.springdem.dao;

public class Factory {
	public static UserDao getUserDaoInstance() {
		
		return new UserDaoImpl();
	}
	

}
