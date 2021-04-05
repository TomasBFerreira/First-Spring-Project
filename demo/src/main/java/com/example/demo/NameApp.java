package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class NameApp {
	
	@GetMapping("/hello/{id}")
	@ResponseBody
	public String getNameById(@PathVariable String id) {
	    return "Hello, " + id;
	}
}
