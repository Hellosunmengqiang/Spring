package com.springdem.aop;

import org.springframework.stereotype.Component;

@Component("aopTest")
public class AopTestImpl implements AopTest {

	@Override
	public int add(int i, int j) {
		int res=i+j;
		return res;
	}

	@Override
	public int sub(int i, int j) {
		int res=i-j;
		return res;
	}

	@Override
	public int div(int i, int j) {
		int res=i/j;
		return res;
	}

}
