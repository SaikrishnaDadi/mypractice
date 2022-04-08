package com.practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.practice.controller.UserController;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserController.class)
//@ComponentScan({"com.delivery.request"})
@EntityScan("com.practice.model")
@EnableJpaRepositories("com.practice.repository")
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
