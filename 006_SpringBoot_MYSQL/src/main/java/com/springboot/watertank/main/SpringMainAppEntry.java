package com.springboot.watertank.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.watertank.controller"})
@EnableJpaRepositories(basePackages= {"com.springboot.watertank.repository"})
@EntityScan(basePackages= {"com.springboot.watertank.entity"})
public class SpringMainAppEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringMainAppEntry.class, args);
	}

}
