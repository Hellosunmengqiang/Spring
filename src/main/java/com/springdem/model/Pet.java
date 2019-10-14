package com.springdem.model;

public class Pet {
	private int id;
	private String type;
	private double petPrice;
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
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type 要设置的 type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public Pet() {
		super();
	}
	/**
	 * @return petPrice
	 */
	public double getPetPrice() {
		return petPrice;
	}
	/**
	 * @param petPrice 要设置的 petPrice
	 */
	public void setPetPrice(double petPrice) {
		this.petPrice = petPrice;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", petPrice=" + petPrice + "]";
	}
	

}
