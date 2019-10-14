package com.springdem.model;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	private String type;
	
    public CarFactoryBean(String type) {
		// TODO 自动生成的构造函数存根
    	this.type=type;
	}
	
	@Override
	public Car getObject() throws Exception {
		// TODO 自动生成的方法存根
		return  new Car(1,type);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO 自动生成的方法存根
		return Car.class;
	}

	/* （非 Javadoc）
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		
		return true;
	}

}
