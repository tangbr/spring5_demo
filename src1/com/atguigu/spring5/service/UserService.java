package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

public class UserService {

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
	
	
	public void add() {
		// TODO Auto-generated constructor stub
		System.out.println("service add............");
		userDao.update();
		
		/*
		 * UserDao userDao = new UserDaoImpl(); userDao.update();
		 */
	}

}
