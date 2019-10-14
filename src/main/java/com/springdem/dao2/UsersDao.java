package com.springdem.dao2;

public interface UsersDao {
	public double getBalance(int uid);//通过用户id获取余额
	
	public void updateBalance(int uid,double amount);

}
