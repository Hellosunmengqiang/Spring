package com.springdem.model2;

public class Users {
	private int id;
	private String username;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", balance=" + balance + "]";
	}
	public Users() {
		super();
	}
	

}
