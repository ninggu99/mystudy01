package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model m,String regid, String msg) {
		System.out.println("요청이오네!");
		System.out.println("regid : " + regid);
		System.out.println("msg : " + msg);
		m.addAttribute("msg","hello~안녕하세요");
		return "hello";
	}
}