package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TBoardDao;
import com.example.demo.vo.TBoardVO;

@Service
public class TBoardService {
	@Autowired
	private TBoardDao dao;

	public List<TBoardVO> getList() {
		return dao.getTBoardList();
	}
}
