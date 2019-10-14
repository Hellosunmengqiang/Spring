package com.springdem.dao2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("usersDao")
public class UsersDaoImpl implements UsersDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public double getBalance(int uid) {
		String sql="select balance from users2 where id=?";
		return jdbcTemplate.queryForObject(sql, double.class,uid);//查询余额
	}

	@Override
	public void updateBalance(int uid, double amount) {
		if(getBalance(uid)<amount)
		{
			throw new RuntimeException("余额不足！");
		}
		String sql="update users2 set balance=balance-? where id=?";
		jdbcTemplate.update(sql,amount,uid);
		
	}

}
