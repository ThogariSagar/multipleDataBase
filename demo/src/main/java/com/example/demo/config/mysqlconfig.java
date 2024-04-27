package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class mysqlconfig {
	@ConfigurationProperties("spring.datasource.mysql")
	@Bean
	public DataSourceProperties mysqlDataSourceProperties() {
		
		return new DataSourceProperties();
		
	}
	/*
	 * @Bean public DataSource mysqlDataSource() { DriverManagerDataSource
	 * dataSource= new DriverManagerDataSource();
	 * dataSource.setUrl(mysqlDataSourceProperties().getUrl());
	 * dataSource.setUsername(mysqlDataSourceProperties().getUsername());
	 * dataSource.setPassword(mysqlDataSourceProperties().getPassword());
	 * dataSource.setDriverClassName(mysqlDataSourceProperties().getDriverClassName(
	 * )); return dataSource;
	 * 
	 * }
	 */
	@Bean
	//@Primary
   public DataSource mysqlDataSource() {
	   
	return mysqlDataSourceProperties().initializeDataSourceBuilder().build();
	   
   }
}
