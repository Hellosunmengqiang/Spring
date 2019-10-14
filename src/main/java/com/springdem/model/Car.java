package com.springdem.model;

public class Car {
	private int id;
	private String mark;
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
	 * @return mark
	 */
	public String getMark() {
		return mark;
	}
	/**
	 * @param mark 要设置的 mark
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [id=" + id + ", mark=" + mark + "]";
	}
	public Car() {
		super();
	}
	public Car(int id, String mark) {
		super();
		this.id = id;
		this.mark = mark;
	}
	

}
