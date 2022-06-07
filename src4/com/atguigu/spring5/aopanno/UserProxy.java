package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect
@Order(3)
public class UserProxy {
	
	//相同切入点抽取
	@Pointcut(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
	public void pointdemo() {
		
	}
	
	
	
	//前置通知
	@Before(value="pointdemo()")
	public void before() {
		System.out.println("before....");
	}
	

	//后置通知或返回通知， 有异常不执行
	@AfterReturning(value="pointdemo()")
	public void afterReturning() {
		System.out.println("AfterReturning....");
	}
	
	//最终通知， 有异常也要执行
	@After(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
	public void after() {
		System.out.println("after....");
	}
	
	@AfterThrowing(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
	public void afterThrowing() {
		System.out.println("@AfterThrowing....");
	}
	
	
	//环绕通知
	@Around(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕之前....");
		//被增强的方法执行
		proceedingJoinPoint.proceed();
		System.out.println("环绕之后....");

	}
	
	
	
	
	
	
	
	
}
