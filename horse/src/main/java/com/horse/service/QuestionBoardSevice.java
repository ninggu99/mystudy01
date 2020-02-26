package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.QuestionBoardDao;
import com.horse.vo.QuestionBoardVO;
import com.horse.vo.SearchVO;

@Service/* 해당 파일이 서비스 파일이라고 명시*/
public class QuestionBoardSevice{
	
	@Autowired
	private QuestionBoardDao dao;

	public List<QuestionBoardVO> list(){
		return dao.boardList();
	}
	// 상세보기
	public QuestionBoardVO questionDetail(int qnum){
		return dao.questionDetail(qnum);
	}
	// 입력
	public void questionInsert(QuestionBoardVO vo) {
		dao.questionInsert(vo);
	}
	// 수정
	public void questionUpdate(QuestionBoardVO vo) {
		dao.questionUpdate(vo);
	}
	// 삭제
	public int questionDelete(int qnum) {
		return dao.questionDelete(qnum);
	}
	// 조회수
	public int questionHit(int qhit) {
		return dao.questioinHit(qhit);
	}
	// 문의사항 테이블 총갯수
	public int questionCount(SearchVO vo) {
		return dao.questionCount(vo);
	}
	// 문의사항 리스트 페이징
	public List<QuestionBoardVO> questionList(SearchVO vo){
		return dao.questionList(vo);
	}
}
