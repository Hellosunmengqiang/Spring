package com.springdem.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AopTest aopTest=(AopTest) context.getBean("aopTest");
		aopTest.add(1, 1);
		aopTest.sub(4, 1);
		aopTest.div(10, 2);
		
	}
	

}
