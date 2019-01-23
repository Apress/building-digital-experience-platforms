package com.dxsys.integration.integration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ABCBankingEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ABCBankingEurekaServerApplication.class, args);
	}
}