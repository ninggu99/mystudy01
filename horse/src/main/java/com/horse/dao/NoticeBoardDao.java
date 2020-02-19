package com.horse.dao;

import java.util.List;

import com.horse.vo.NoticeBoardVO;

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
}
