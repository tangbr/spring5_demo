package com.atguigu.spring5.testDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.connectiontype.Book;
import com.atguigu.spring5.connectiontype.Course;
import com.atguigu.spring5.connectiontype.Stu;
import com.atguigu.spring5.facbean.MyBean;

public class TestSpring5 {
	
	@Test
	public void testCollection1() {
		@SuppressWarnings("resource")
		ApplicationContext context =  
				new ClassPathXmlApplicationContext( "bean1.xml");
		Stu stu =  context.getBean("stu", Stu.class);
		stu.test();
	}
	
	@Test
	public void testCollection2() {
		@SuppressWarnings("resource")
		ApplicationContext context =  
				new ClassPathXmlApplicationContext( "bean2.xml");
		Book  book =  context.getBean("book", Book.class);
		book.test();
	}
	
	
	@Test
	public void testCollection3() {
		@SuppressWarnings("resource")
		ApplicationContext context =  
				new ClassPathXmlApplicationContext( "bean3.xml");
		Course course =  context.getBean("myBean", Course.class);
		System.out.println(course);
	}
	
	
	@Test
	public void testBean3() {

		ApplicationContext context =  
				new ClassPathXmlApplicationContext( "bean4.xml");
		Orders orders =  context.getBean("orders", Orders.class);
		System.out.println("第四步 获取创建bean实例对象");
		System.out.println(orders);
		
		//手动让bean实例销毁
		 ((AbstractApplicationContext) context).close();
	
	}
		
	
	

	@Test
	public void test4() {
		@SuppressWarnings("resource")
		ApplicationContext context =  
				new ClassPathXmlApplicationContext( "bean5.xml");
		Emp emp =  context.getBean("emp", Emp.class);
		System.out.println(emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
