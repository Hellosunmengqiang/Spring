package com.springdem.model2;

import org.springframework.stereotype.Component;

@Component("audiCar")
public class AudiCar implements Car{

	@Override
	public String getCar() {
		// TODO 自动生成的方法存根
		return "audi";
	}

}
