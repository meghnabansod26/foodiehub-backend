package com.meghna.foodiehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodieHubApplication {


	public static void main(String[] args) {
		System.out.println(
				"OPENAI_API_KEY loaded: " +
						(System.getenv("OPENAI_API_KEY") != null)
		);


		SpringApplication.run(FoodieHubApplication.class, args);
	}

}
