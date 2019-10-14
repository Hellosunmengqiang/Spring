package com.springdem.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component     //不加值@Value 相当于monkey
public class Monkey {
	
	@Value("小猴子啊")    //和加在set方法上效果一样,此作用相当于不用注解时在bean标签上的value=“”
	private String monkeyName;

	public String getMonkeyName() {
		return monkeyName;
	}

	public void setMonkeyName(String monkeyName) {
		this.monkeyName = monkeyName;
	}

	
	@Override
	public String toString() {
		return "Monkey [monkeyName=" + monkeyName + "]";
	}
	

}
