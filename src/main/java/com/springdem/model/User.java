package com.springdem.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
@Repository("user")
public class User {
	@Value("1")
	private int id;
	private String username;
	private String password;
	/*private Map<String,String> map=new HashMap<String, String>();
	private List<String> list=new LinkedList<String>();
	private Set<String> set=new HashSet<String>();
	private Properties properties;*/
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username 要设置的 username
	 */
	public void setUsername(String username) {
		//System.out.println("User类中setUsername被使用，传来username值:"+username);
		this.username = username;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password 要设置的 password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		//System.out.println("User构造方法被使用！");
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}
