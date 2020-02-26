package com.horse.dao;

import com.horse.vo.MemberVO;

public interface LoginDao {
	
	// search id
	public int searchId(String mid);
	// search pwd
	public int searchPwd(MemberVO vo);
}
