package com.atguigu.webfluxdemo1.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.atguigu.webfluxdemo1.entity.User;
import com.atguigu.webfluxdemo1.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class UserServiceImpl implements UserService {
//create a map list to stroe database records
	private final Map<Integer,User> users = new HashMap<>();
	
	public UserServiceImpl() {
	//	super();
		// TODO Auto-generated constructor stub
		this.users.put(1, new User("lucy", "male", 20));
		this.users.put(2, new User("Mary", "female", 38));
		this.users.put(3, new User("Jack", "male", 50));
	}
		//根据id查询
	@Override
	public Mono<User> getUserId(int id) {
		// TODO Auto-generated method stub
		return Mono.justOrEmpty(this.users.get(id));
	}
	//查询多个用户
	@Override
	public Flux<User> getAllUser() {
		// TODO Auto-generated method stub
		return Flux.fromIterable(this.users.values());
	}

	//添加用户
	@Override
	public Mono<Void> saveUserInfo(Mono<User> userMono) {
		// TODO Auto-generated method stub
		return userMono.doOnNext(person -> {
			//put values to map list
			int id = users.size()+1;
			users.put(id, person );
			}).thenEmpty(Mono.empty());
	}
}
