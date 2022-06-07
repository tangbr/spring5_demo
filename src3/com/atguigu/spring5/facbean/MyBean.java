package com.atguigu.spring5.facbean;

import org.springframework.beans.factory.FactoryBean;

import com.atguigu.spring5.connectiontype.Course;

public class MyBean implements FactoryBean<Course> {

	
	//定义返回bean
	@Override
	public Course getObject() throws Exception {
		Course course = new Course();
		course.setCname("abcde");
		return course;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return FactoryBean.super.isSingleton();
	}

}
