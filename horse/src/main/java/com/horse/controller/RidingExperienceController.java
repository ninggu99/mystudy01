package com.horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RidingExperienceController {
	@RequestMapping(value = "/ridingExperience")
	public String firstPage() {
		return "ridingExperience";
	}
}
