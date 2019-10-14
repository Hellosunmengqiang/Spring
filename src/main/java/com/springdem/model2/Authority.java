package com.springdem.model2;

public class Authority {
	private int id;
	private String authorityName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	@Override
	public String toString() {
		return "Authority [id=" + id + ", authorityName=" + authorityName + "]";
	}
	public Authority() {
		super();
	}
	

}
