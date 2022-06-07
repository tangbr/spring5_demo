package com.atguigu.spring5.testmo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring5.bean.Emp;

import com.atguigu.spring5.service.UserService;

public class TestBean {

    @Test
    public void testAdd() {
//1. 加载spring 配置文件
        @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext ("bean2.xml");
        // 2 .   获取配置创建的对象
        UserService userService = context.getBean("userService",UserService.class);
    System.out.println(userService);
    userService.add();

    }

    @Test
    public void testbean2() {
//1. 加载spring 配置文件
        @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext ("bean3.xml");
        // 2 .   获取配置创建的对象
        Emp emp = context.getBean("emp",Emp.class);
  System.out.println(emp);
    emp.add();

    }


@Test
public void testbean4() {
//1. 加载spring 配置文件
    @SuppressWarnings("resource")
ApplicationContext context = new ClassPathXmlApplicationContext ("bean4.xml");
    // 2 .   获取配置创建的对象
    Emp emp = context.getBean("emp",Emp.class);
System.out.println(emp);
emp.add();
}


@Test
public void testbean5() {
//1. 加载spring 配置文件
    @SuppressWarnings("resource")
ApplicationContext context = new ClassPathXmlApplicationContext ("bean5.xml");
    // 2 .   获取配置创建的对象
    Emp emp = context.getBean("emp",Emp.class);
System.out.println(emp);
emp.add();
}
}
