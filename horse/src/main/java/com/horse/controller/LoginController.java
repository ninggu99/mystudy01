package com.horse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.horse.service.LoginService;
import com.horse.vo.MemberVO;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService login;

	@RequestMapping("/logincheck")
	public int logincheck(Model m, @RequestParam("mid") String mid,
			@RequestParam("mpwd") String mpwd, MemberVO vo) {
//		System.out.println("여기까지~");
		int searchid = login.searchid(mid);
		int searchpwd = login.searchpwd(vo);
		int data = searchid * searchpwd;
		return data;
	}
}
