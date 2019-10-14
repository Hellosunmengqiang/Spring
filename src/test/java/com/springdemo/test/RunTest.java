package com.springdemo.test;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdem.dao.UserDao;
import com.springdem.dao2.ClothesDao;
import com.springdem.model.User;
import com.springdem.service2.ClothesService;
import com.springdem.service2.MultiClothesService;

public class RunTest {
	
	@Test
	public void test() throws SQLException {
		//spring用法
	   //1.返回拿到springIOC容器
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Person person=(Person) context.getBean("person1");
		System.out.println(person);
		
		Pet pet=(Pet) context.getBean("cat1");//new pet
		Pet pet1=(Pet)context.getBean("cat1");
		System.out.println(pet==pet1);*/
		/*DataSource dataSource=(DataSource) context.getBean("dataSource");
		System.out.println(dataSource.getConnection());*/
		/*LiftBean liftBean=(LiftBean) context.getBean("liftBean");
		System.out.println(liftBean);*/
		
		/*Car bmwcar=(Car)applicationContext.getBean("bmw");
		System.out.println(bmwcar);*/
		
		/*User user=(User) applicationContext.getBean("user");		
		System.out.println(user);
		
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		System.out.println(userDao);
		
		UserController userController=(UserController) applicationContext.getBean("userController");
		System.out.println(userController);
		
		UserService userService=(UserService) applicationContext.getBean("userService");
		System.out.println(userService);*/
		
		/*AuthorityService as=(AuthorityService) applicationContext.getBean("authorityService");
		
		UserService us=(UserService) applicationContext.getBean("userService");
		
		as.add(null);
		us.add(null);*/
		
		//连接数据库
		/*DataSource dataSource2=(DataSource) applicationContext.getBean("dataSource2");
		System.out.println(dataSource2.getConnection());*/
		
		//增加
		//JdbcTemplate jdbcTemplate=(JdbcTemplate) applicationContext.getBean("jdbcTemplate");//此处需要加这句话，查询语句放在类里面就不需要了
		
		/*String sql1="INSERT INTO users(username,password) VALUES(?,?)";
		jdbcTemplate.update(sql1,"li","123");*/
		
		/*String sql2="delete from users where id=?";
		jdbcTemplate.update(sql2,3);*/
		
		/*String sql3="update users set username=? ,password=? where id=?";
		jdbcTemplate.update(sql3,"as","as123",2);*/
		
		//查询一条记录
		/*String sql4="select id,username,password from users where id=?";
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
		User user=jdbcTemplate.queryForObject(sql4, rowMapper, 1);
		System.out.println(user);*/
		
		//查询多条记录
		/*String sql5="select id ,username,password from users where id>?";
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
		List<User> list=jdbcTemplate.query(sql5,rowMapper, 0);
		System.out.println(list);*/
		
		//查询摸个值
		/*String sql6="select count(id) from users";
		long count=jdbcTemplate.queryForObject(sql6, Long.class);
		System.out.println(count);*/
		/*String sql7="select username from users where id=?";
		String username=jdbcTemplate.queryForObject(sql7, String.class,1);
		System.out.println(username);*/
		
		//批量插入
		/*String sql8="insert into users(username,password) values(?,?)";
		List<Object[]> list=new ArrayList<>();
		list.add(new Object[] {"q1","123"});
		list.add(new Object[] {"q2","123"});
		list.add(new Object[] {"q3","123"});
		list.add(new Object[] {"q4","123"});	
		jdbcTemplate.batchUpdate(sql8,list);*/
		
		
		//在UserDaoImpl里面实现jdbcTemplate
		/*UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		User user=userDao.get(1);
		System.out.println(user);*/
		
		//1.具名参数
		/*NamedParameterJdbcTemplate namejdbc=(NamedParameterJdbcTemplate) applicationContext.getBean("namedParameterJdbcTemplate");
		String sql="select id ,username,password from users where id=:uid";
		Map<String,Object> paramMap=new HashMap<>();
		paramMap.put("uid", 1);
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
		User user=namejdbc.queryForObject(sql, paramMap, rowMapper);
		System.out.println(user);*/
		
		//2.具名参数(实际应用这个)，结合UserDaoImpl里面的add方法，还有用JdbcTemplate接口；
		/*UserDao userDao=(UserDao) applicationContext.getBean("userDao");	
		User user=new User();		
		user.setPassword("haha123");
		user.setUsername("haha");
		userDao.add(user);*/
		
		
		//正常买衣服例子
		/*ClothesService clothesService=(ClothesService) applicationContext.getBean("clothesService");
		clothesService.purchaseClothes(1, 1, 1);*/
		//事务买衣服
		MultiClothesService mcs=(MultiClothesService) applicationContext.getBean("multiPurchaseClothesService");
		mcs.multiPurchaseClothes(1, new int[] {1,2}, new int[] {1,1});
		
	}

}
