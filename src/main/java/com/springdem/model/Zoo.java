package com.springdem.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("zoo")//相当于bean中的id 作用于类
public class Zoo {
	//@Resource(name="tigger")//相当于ref=tigger 作用于对象
	//@Autowired(required=false)//@Autowired注解要去寻找的是一个Bean，Tiger和 Monkey的Bean定义都给去掉了，Spring容器找不到了自然抛出异常。那么，如果属性找不到对应
	//的对象我不想让Spring容器抛 出异常，而就是显示null，可以吗？可以的，就是将@Autowired注解的required属性设置为false 即可
	@Autowired   //@Autowired顾名思义，就是自动装配，其作用是为了消除代码Java代码里面的getter/setter与bean属性中的property。
	private Tigger tigger;
	//@Resource(type=Monkey.class)  //type 与上面的name效果一样
	@Autowired
	private Monkey monkey;
	
	
	@Override
	public String toString() {
		return "Zoo [tigger=" + tigger.getTiggerName() + ", monkey=" + monkey.getMonkeyName() + "]";
	}
	

}
