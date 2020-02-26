package com.horse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.LoginDao;
import com.horse.vo.MemberVO;

@Service/* 해당 파일이 서비스 파일이라고 명시*/
public class LoginService{
	
	@Autowired
	private LoginDao dao;
	
	public int searchid(String mid){
		return dao.searchId(mid);
	}
	
	public int searchpwd(MemberVO vo){
		return dao.searchPwd(vo);
	}
}
