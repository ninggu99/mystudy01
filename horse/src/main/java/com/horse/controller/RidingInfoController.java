package com.horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RidingInfoController {
	@RequestMapping("/ridingInfo")
	public String firstPage() {
		return "ridingInfo";
	}
}
