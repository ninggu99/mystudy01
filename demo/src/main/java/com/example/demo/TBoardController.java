package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.TBoardService;

@Controller
public class TBoardController {
	@Autowired
	private TBoardService service;
	
	@RequestMapping("/getList")
	public String getTBoardList(Model m) {
		m.addAttribute("list",service.getList());
		return "tlist";
	}
}
