package com.springdem.model;

public class LiftBean {
	private int id;
	private String name;
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
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		System.out.println("ListBean的setName方法");
		this.name = name;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LiftBean [id=" + id + ", name=" + name + "]";
	}
	public LiftBean() {
		
		super();
		System.out.println("ListBean构造方法执行了");
	}
	public void init()
	{
		System.out.println("LiftBean的init，初始化方法");
	}
	public void destroy()
	{
		System.out.println("LiftBean的destroy,销毁的方法");
	}
	

}
