package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.ChartDao;
import com.horse.vo.ChartVO;

@Service
public class ChartService implements ChartDao {
	@Autowired
	private ChartDao dao;

	@Override
	public ChartVO chartList() {
		return dao.chartList();
	}

	@Override
	public List<ChartVO> cheerupList(){
		List<ChartVO>list = dao.cheerupList();
		return list;

	}
}
