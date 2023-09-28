package com.example.simplejavaapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${stage}")
	private String stage;


	@GetMapping
	public String getStage() {
		return stage;
	}
}
