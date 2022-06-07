package com.atguigu.spring5;

public class UserDaoImpl implements UserDao {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("add方法执行了。。。。。。");
		return a+b;
	}

	@Override
	public String update(String id) {
		// TODO Auto-generated method stub
		System.out.println("update方法执行了。。。。。。");
		return id;
	}

}
