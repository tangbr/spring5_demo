package com.atguigu.webfluxdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.webfluxdemo1.entity.User;
import com.atguigu.webfluxdemo1.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {
	
	//注入service
	@Autowired
	private UserService userService;
	
	//id 查询
	@GetMapping("/user/{id}")
	public Mono<User> getUserId(@PathVariable int id) {
		return userService.getUserId(id);
	}
	
	//查询所有
	@GetMapping("/user")
	public Flux<User> getUser(){
		return userService.getAllUser();
	}
	
	
	//添加
	@PostMapping("/saveuser")
	public Mono<Void> saveUser(@RequestBody User user){
		Mono<User> userMono =  Mono.just(user);
		return userService.saveUserInfo(userMono);
	}
	
}












