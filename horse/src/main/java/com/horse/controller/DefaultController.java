package com.horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping(value = "/")
	public String firstPage() {
		return "login";
	}
	
	@RequestMapping(value = "/home")
	public String homePage() {
		return "index";
	}
}
