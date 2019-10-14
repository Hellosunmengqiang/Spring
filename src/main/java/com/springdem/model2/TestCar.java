package com.springdem.model2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("testCar")
public class TestCar {
	@Autowired
	@Qualifier("bMWCar")//实现类就是有多个该怎么办？此时可以使用@Qualifier注解，指明你要spring装载那个对象
	private Car myCar;

	@Override
	public String toString() {
		return "TestCar [myCar=" + myCar + "]";
	}
	
}
