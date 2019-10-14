package com.springdem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springdem.model.User;
import com.springdem.service.UserService;
@Controller("userController")
public class UserController {
    //@Autowired
	private UserService userService;
   // @Autowired
	private User user;
	
	public void add()
	{
		//userService.add(user);
	}

}
