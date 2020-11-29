package com.puzza.schoolmanagement.Schoolmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan(basePackages = {"com.puzza.schoolmanagement.Conteoller", "com.puzza.schoolmanagement.Service","com.puzza.schoolmanagement.Model"})
@EntityScan("com.puzza.schoolmanagement.Model")
@EnableJpaRepositories("com.puzza.schoolmanagement.Repo")

public class SchoolmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmgmtApplication.class, args);
	}

} 
