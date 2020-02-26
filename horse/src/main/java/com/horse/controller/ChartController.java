package com.horse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horse.service.ChartService;

@Controller
public class ChartController {
	@Autowired
	private ChartService service;

	@RequestMapping(value = "/chart")
	public String chartList(Model m) {
		m.addAttribute("list", service.chartList());
		return "notice";
//	}
//		ModelAndView mav = new ModelAndView();
//		ChartVO vo = service.chartList();
//		List<ChartVO> list = service.cheerupList();
//		mav.addObject("vo", vo);
//		mav.addObject("list", list);
//		mav.setViewName("chart");
//		return mav;
	}
//
//	@RequestMapping(value = "/chart")
//	public ModelAndView chartList() {
//		for i in 100:
//			int count = service.select(int);
//			if count = 0:
//				pass
//				else:
//					query():
//
//		return mav;
//	}
}
