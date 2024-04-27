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
		entityManagerFactoryRef ="h2EnityEntityManagerFactoryBean",
		basePackages = "com.example.demo.Orderrepository",
		transactionManagerRef = "h2transactionManager")
public class h2jpaconfig {
	@Bean
	LocalContainerEntityManagerFactoryBean h2EnityEntityManagerFactoryBean(
			                    EntityManagerFactoryBuilder entityManagerFactoryBuilder,
			                    @Qualifier("h2DataSource") DataSource dataSource) {
		return entityManagerFactoryBuilder
				.dataSource(dataSource)
				.packages("com.example.demo.Orderenity")
				.build();
		
	}

	@Bean
	public PlatformTransactionManager h2transactionManager(@Qualifier("h2EnityEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean etb ) {
		
		return new JpaTransactionManager(etb.getObject());
		
		
	}
}
