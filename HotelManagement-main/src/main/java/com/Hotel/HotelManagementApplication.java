package com.Hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HotelManagementApplication {
	
	@Bean
	public RestTemplate restTeamplate() 
	{
		return new RestTemplate();
	
	}

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
	}

}
