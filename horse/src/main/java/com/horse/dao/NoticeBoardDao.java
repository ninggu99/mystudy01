package com.horse.dao;

import java.util.List;

import com.horse.vo.NoticeBoardVO;
import com.horse.vo.SearchVO;

public interface NoticeBoardDao {
	
	// 리스트
	public List<NoticeBoardVO> boardList();
	// 상세보기
	public NoticeBoardVO noticeDetail(int nnum);	
	// 입력
	public void noticeInsert(NoticeBoardVO vo);	
	// 수정
	public void noticeUpdate(NoticeBoardVO vo);	
	// 삭제
	public int noticeDelete(int nnum);	
	// 조회수
	public int noticeHit(int nhit);	
	// 공지사항 테이블 총갯수
	public int noticeCount(SearchVO vo);
	// 공지사항 리스트 페이징
	public List<NoticeBoardVO> noticeList(SearchVO vo);
}
