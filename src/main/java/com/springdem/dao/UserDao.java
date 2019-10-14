package com.springdem.dao;

import com.springdem.model.User;

public interface UserDao {
	public void add(User user);
	
	public User get(int id);

}
