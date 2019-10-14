package com.springdem.dao;

import org.springframework.stereotype.Repository;

import com.springdem.model2.Authority;

@Repository("AuthorityDao")
public class AuthorityDaoImpl extends BaseDao<Authority> implements AuthorityDao {

	/*@Override
	public void add(Authority authority) {
	
        System.out.println("AuthorityDaoImpl里的add方法!");
	}*/

}
