package com.atguigu.spring5.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.atguigu.spring5.config.TxConfig;
import com.atguigu.spring5.service.UserService;

public class TestBook {

	@Test
	public void testAccount () {
		@SuppressWarnings("resource")
		ApplicationContext context	=
				new ClassPathXmlApplicationContext("bean1.xml");
		UserService userService = context.getBean("userService", UserService.class);
		userService.accountMoney();
	}
	
	@Test
	public void testAccount2() {
		@SuppressWarnings("resource")
		ApplicationContext context	=
				new ClassPathXmlApplicationContext("bean2.xml");
		UserService userService = context.getBean("userService", UserService.class);
		userService.accountMoney();
	}
	
	
	//全注解
	@Test
	public void testAccount3() {
		
		@SuppressWarnings("resource")
		ApplicationContext context	=
				new AnnotationConfigApplicationContext(TxConfig.class);
//				new ClassPathXmlApplicationContext("bean2.xml");
		UserService userService = context.getBean("userService", UserService.class);
		userService.accountMoney();
	}
	//函数式风格创建对象，交给spring进行管理
	@Test
	public void testGenericApplicationContext() {
		//1 创建GenericApplicationContext对象
		GenericApplicationContext context = new GenericApplicationContext();
		//2 调用context方法，对象注册
		context.refresh();
		context.registerBean(User.class, () -> new User());
		//or	context.registerBean("user1",User.class, () -> new User());
		//3 获取在spring 注册的对象
		User user = (User)context.getBean("com.atguigu.spring5.test.User");
		//or  User user = (User)context.getBean("user1");
		System.out.println(user);
		
	}
		
}
