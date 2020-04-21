package com.psm.bootcamp.case01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PSMCase01Application {

	public static void main(String[] args) {
		SpringApplication.run(PSMCase01Application.class, args);
	}

}
