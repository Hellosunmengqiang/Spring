package com.springdem.model2;

public class Clothes {
	private int id;
	private double price;
	private String inventory;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	@Override
	public String toString() {
		return "Clothes [id=" + id + ", price=" + price + ", inventory=" + inventory + "]";
	}
	public Clothes() {
		super();
	}
	

}
