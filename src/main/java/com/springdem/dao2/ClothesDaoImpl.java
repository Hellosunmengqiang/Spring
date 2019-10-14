package com.springdem.dao2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("clothesDao")
public class ClothesDaoImpl implements ClothesDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public double getPrice(int id) {
		String sql="select price from clothes where id=?";
		
		return jdbcTemplate.queryForObject(sql, double.class,id);
	}

	@Override
	public int getInventory(int id) {
		String sql="select inventory from clothes where id=?";
		
		return jdbcTemplate.queryForObject(sql, Integer.class,id);
	}

	@Override
	public void updateInventory(int cid, int amount) {
		if(getInventory(cid)<amount)
		{
			throw new RuntimeException("衣服库存不足！");
		}
		String sql="update clothes set inventory=inventory-? where id=?";
		
		jdbcTemplate.update(sql,amount,cid);
		
	}

}
