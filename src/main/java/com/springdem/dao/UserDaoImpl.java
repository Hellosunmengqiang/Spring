package com.springdem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.springdem.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDao<User> implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public User get(int id) {
	String sql="select id,username,password from users where id=?";
	RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
	
		return jdbcTemplate.queryForObject(sql, rowMapper,id);
	}
	

	/*public void add(User user) {
		
      String sql2="insert into users(username,password) values(:username,:password)";
      SqlParameterSource paramSource=new BeanPropertySqlParameterSource(user);
      namedParameterJdbcTemplate.update(sql2, paramSource);
	}*/

}
