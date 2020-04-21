package com.psm.bootcamp.case02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PSMCase02Application {

	public static void main(String[] args) {
		SpringApplication.run(PSMCase02Application.class, args);
	}

}
