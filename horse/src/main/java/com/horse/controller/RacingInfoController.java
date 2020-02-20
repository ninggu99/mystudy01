package com.horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RacingInfoController {
	@RequestMapping(value = "/racingInfo")
	public String firstPage() {
		return "racingInfo";
	}
}
