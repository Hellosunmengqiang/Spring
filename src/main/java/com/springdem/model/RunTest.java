package com.springdem.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

public class RunTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*SchedulerFactoryBean scheduler=(SchedulerFactoryBean) applicationContext.getBean("scheduler");
		scheduler.start();*/
		Zoo tigger=(Zoo) applicationContext.getBean("zoo");
		System.out.println(tigger);//通过注解来比较区别
	}

}
