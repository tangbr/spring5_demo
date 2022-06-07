package com.atguigu.webfluxdemo1.service;

import com.atguigu.webfluxdemo1.entity.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//  user operation interface
public interface UserService {
	// search by id
	Mono<User> getUserId(int id);

	
	//  search all users
	Flux<User> getAllUser();
	

	//add one user
	Mono<Void> saveUserInfo(Mono<User> user);
}
