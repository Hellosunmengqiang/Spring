package com.springdem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.springdem.dao.UserDao;
import com.springdem.model.User;
@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {
	/*
	 * 1. UserDaoImpl userdaoimpl=new UserDaoImpl();userdaoimpl.add(user);
	 * 
	 * 2.private UserDao userdao=new UserDaoImpl();userdao.add(user);
	 * 
	 * 3.private UserDao userdao=Factory.getUserDaoInstance();userdao.add(user);
	 * 
	 */
	//需要注入的对象userDao
	//@Autowired
	//private UserDao userDao;//UserDao 依赖 UserServiceImpl 注入
	//private String testName;
	//配置文件中通过set方法将userDao这个对象注入进来的
	/*public void setUserDao(UserDao userDao)
	{
		this.userDao=userDao;
	}*/
	/*public UserServiceImpl(UserDao userDao,String testName)//1.构造函数注入
	{
		this.userDao=userDao;
		this.testName=testName;
	}*/
	
	/*public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {//2.setter注入
		this.testName = testName;
	}*/
	@Override
   public void add(User user) {
		System.out.println(baseDao);
		//baseDao.add(user);
		//System.out.println(userDao);
		//System.out.println(testName);

	}
	
	/*public static void main(String[] args) {
		
		//spring用法
		//1.拿到springIOC容器
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过这个容器，我们可以拿到我们想要的类的对象的实例
		//User user=ctx.getBean(User.class);
		//UserDao userDao=ctx.getBean(UserDao.class);
		
		//3.获取到的对象实例的变量调用类里面的方法
		//userDao.add(user);
		User user=new User();
		user.setUsername("zzss");
		user.setPassword("123");
		UserService userservice=(UserService)ctx.getBean("userService");
		userservice.add(user);
		
	}*/

	
	

}
