package com.efrozza.pocfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PocFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocFeignClientApplication.class, args);
	}

}
