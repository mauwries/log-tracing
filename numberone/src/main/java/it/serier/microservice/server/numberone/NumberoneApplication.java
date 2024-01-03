package it.serier.microservice.server.numberone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NumberoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberoneApplication.class, args);
	}

}
