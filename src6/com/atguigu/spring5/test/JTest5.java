package com.atguigu.spring5.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.atguigu.spring5.service.UserService;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classPath:bean1.xml")

@SpringJUnitConfig(locations="classpath:bean1.xml")  //可以替代上面两个注解
public class JTest5 {

	@Autowired
	private UserService userService;
	
	@Test
	public void test1() {
		userService.accountMoney();
	}
}
