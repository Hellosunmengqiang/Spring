package com.springdem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdem.dao.AuthorityDao;
import com.springdem.dao.BaseDao;
import com.springdem.model2.Authority;
@Service("authorityService")
public class AuthorityServiceImpl extends BaseService<Authority> implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;
	
	@Override
	public void add(Authority authority) {
	    
	  baseDao.add(authority); 
     System.out.println(baseDao);
	}

}
