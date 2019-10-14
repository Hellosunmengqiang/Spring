package com.springdem.model2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestCar testCar=(TestCar) context.getBean("testCar");
		System.out.println(testCar);
	}

}
