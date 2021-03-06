package com.cloud.card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CardConfigServerApp {

	public static void main(String[] args) {
		SpringApplication.run(CardConfigServerApp.class, args);
	}
}
