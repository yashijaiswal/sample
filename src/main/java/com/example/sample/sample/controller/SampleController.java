package com.example.sample.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {

	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Application is Up and Running";
	}
}
