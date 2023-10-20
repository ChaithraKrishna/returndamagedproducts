package com.week5.codebase_Serice_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@EnableEurekaServer

@SpringBootApplication
public class CodebaseSericeRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodebaseSericeRegistryApplication.class, args);
	}

}
