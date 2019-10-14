package com.springdem.model;

import java.util.List;

public class Person {
	private int id;
	private Pet pet;
	private double petPrice;
	private List<Car> cars;
	private double pi;
	private String test;
	
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
	 * @return pet
	 */
	public Pet getPet() {
		return pet;
	}
	/**
	 * @param pet 要设置的 pet
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	/**
	 * @return cars
	 */
	public List<Car> getCars() {
		return cars;
	}
	/**
	 * @param cars 要设置的 cars
	 */
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public Person() {
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
	
	/**
	 * @return pi
	 */
	public double getPi() {
		return pi;
	}
	/**
	 * @param pi 要设置的 pi
	 */
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	/**
	 * @return test
	 */
	public String getTest() {
		return test;
	}
	/**
	 * @param test 要设置的 test
	 */
	public void setTest(String test) {
		this.test = test;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", pet=" + pet + ", petPrice=" + petPrice + ", cars=" + cars + ", pi=" + pi
				+ ", test=" + test + "]";
	}
	

}
