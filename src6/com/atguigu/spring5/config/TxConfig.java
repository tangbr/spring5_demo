package com.atguigu.spring5.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan(basePackages="com.atguigu")
@EnableTransactionManagement
public class TxConfig {

		// 创建数据库连接池
	@Bean
	public DruidDataSource getDruidDataSource() {
		DruidDataSource dataSource =  new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///user_db");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		//到ioc 容器中根据类型找到dataSource
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		//注入dataSource
		jdbcTemplate.setDataSource(getDruidDataSource());
		return jdbcTemplate;
	}
	
	//创建事务管理器的对象
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) 
	{
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
	
}
