package com.example.week1_exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloIndex {
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "location") String location,
			@RequestParam(name = "firstname") String firstName) {
		return "Welcome to the " + location + " " + firstName + "!";
	}

}
