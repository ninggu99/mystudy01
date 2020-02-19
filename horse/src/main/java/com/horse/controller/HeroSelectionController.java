package com.horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeroSelectionController {

	@RequestMapping(value = "/heroSelection")
	public String firstPage() {
		return "heroSelection";
	}
}
