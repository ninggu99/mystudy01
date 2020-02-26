package com.horse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.LoginDao;
import com.horse.vo.MemberVO;

@Service/* �ش� ������ ���� �����̶�� ���*/
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
