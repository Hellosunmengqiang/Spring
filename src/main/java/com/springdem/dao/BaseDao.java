package com.springdem.dao;

public class BaseDao<T> {
	
    public void add(T t)
    {
    	System.out.println("BaseDao里面进行数据库的操作。。。。"+t);
    }
}
