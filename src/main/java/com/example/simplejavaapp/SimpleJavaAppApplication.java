package com.example.simplejavaapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class SimpleJavaAppApplication {

	@Value("${stage}")
	private String stage;

	public static void main(String[] args) {
		SpringApplication.run(SimpleJavaAppApplication.class, args);
	}

	@Bean
	public String stage() {
		log.info("=====================================STAGE:{}", stage);
		return stage;
	}
}
