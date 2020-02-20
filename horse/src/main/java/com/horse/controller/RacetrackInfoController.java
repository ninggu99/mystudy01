package com.horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RacetrackInfoController {
	@RequestMapping(value = "/racetrackInfo")
	public String firstPage() {
		return "racetrackInfo";
	}
}
