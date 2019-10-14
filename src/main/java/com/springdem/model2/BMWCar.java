package com.springdem.model2;

import org.springframework.stereotype.Component;

@Component("bMWCar")
public class BMWCar implements Car{

	@Override
	public String getCar() {
		// TODO 自动生成的方法存根
		return "BMW";
	}

}
