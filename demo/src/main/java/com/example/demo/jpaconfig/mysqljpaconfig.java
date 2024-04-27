package com.example.demo.jpaconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
		entityManagerFactoryRef ="mysqlEnityEntityManagerFactoryBean",
		basePackages = "com.example.demo.repository",
		transactionManagerRef = "mysqltransactionManager"
		)
       
     
public class mysqljpaconfig {
	@Bean
	LocalContainerEntityManagerFactoryBean mysqlEnityEntityManagerFactoryBean(
			                    EntityManagerFactoryBuilder entityManagerFactoryBuilder,
			                    @Qualifier("mysqlDataSource") DataSource dataSource) {
		return entityManagerFactoryBuilder
				.dataSource(dataSource)
				.packages("com.example.demo.enity")
				.build();
		
	}
	@Bean
	public PlatformTransactionManager mysqltransactionManager(@Qualifier("mysqlEnityEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean etb ) {
		
		return new JpaTransactionManager(etb.getObject());
		
		
	}

}
