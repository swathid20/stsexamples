package com.springboot.mysql.work;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.annotation.DirtiesContext;
/*import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;*/


/*@ComponentScan(basePackages= {"com.springboot.mysql.controller"})
@EnableJpaRepositories(basePackages= {"com.springboot.mysql.repository"})
@EntityScan(basePackages= {"com.springboot.mysql.entity"})*/
@SpringBootApplication
@DirtiesContext
public class MainAppEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainAppEntry.class, args);
	}

}