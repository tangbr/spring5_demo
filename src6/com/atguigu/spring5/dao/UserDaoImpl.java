package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//Lucy 转账100 给Mary
	//少钱
	@Override
	public void reduceMoney() {
		// TODO Auto-generated method stub
		String sql = "update t_account set money=money-? where username=?";
		jdbcTemplate.update(sql,100,"lucy");
	}

	//多钱
	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
		String sql = "update t_account set money=money+? where username=?";
		jdbcTemplate.update(sql,100,"mary");
	}

}
