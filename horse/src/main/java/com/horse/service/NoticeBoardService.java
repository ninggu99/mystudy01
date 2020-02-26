package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.NoticeBoardDao;
import com.horse.vo.NoticeBoardVO;
import com.horse.vo.SearchVO;

@Service/* 해당 파일이 서비스 파일이라고 명시*/
public class NoticeBoardService{
	
	@Autowired
	private NoticeBoardDao dao;
	
	public List<NoticeBoardVO> list(){
		return dao.boardList();
	}
	
	public NoticeBoardVO noticeDetail(int nnum) {
		return dao.noticeDetail(nnum);
	}
	
	public void noticeInsert(NoticeBoardVO vo) {
		dao.noticeInsert(vo);
	}
	
	public void noticeUpdate(NoticeBoardVO vo) {
		dao.noticeUpdate(vo);
	}
	
	public int noticeDelete(int nnum) {
		return dao.noticeDelete(nnum);
	}
	
	public int noticeHit(int nhit) {
		return dao.noticeHit(nhit);
	}
	// 문의사항 테이블 총갯수
	public int noticeCount(SearchVO vo) {
		return dao.noticeCount(vo);
	}
	// 문의사항 리스트 페이징
	public List<NoticeBoardVO> noticeList(SearchVO vo){
		return dao.noticeList(vo);
	}
}
