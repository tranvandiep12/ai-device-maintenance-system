package com.example.device_maintenance_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController extends ApiV1Controller {

	@GetMapping("/hello")
	public String hello() {
		return "hello diep lien tu";
	}
}
