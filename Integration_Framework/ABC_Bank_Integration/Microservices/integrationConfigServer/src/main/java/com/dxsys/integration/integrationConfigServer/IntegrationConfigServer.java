package com.dxsys.integration.integrationConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class IntegrationConfigServer {
	public static void main(String[] args) {
		SpringApplication.run(IntegrationConfigServer.class, args);
	}
}
