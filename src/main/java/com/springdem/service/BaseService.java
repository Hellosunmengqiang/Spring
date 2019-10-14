package com.springdem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springdem.dao.BaseDao;

public class BaseService<T> {
	
	@Autowired
	public BaseDao<T> baseDao;
		
	public void add() {
		System.out.println("BaseService里的add方法"+baseDao);
	}

}
