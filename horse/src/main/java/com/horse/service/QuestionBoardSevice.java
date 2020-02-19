package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.QuestionBoardDao;
import com.horse.vo.QuestionBoardVO;

@Service/* 해당 파일이 서비스 파일이라고 명시*/
public class QuestionBoardSevice{
	
	@Autowired
	private QuestionBoardDao dao;

	public List<QuestionBoardVO> list(){
		return dao.boardList();
	}
	
	public QuestionBoardVO questionDetail(int qnum){
		return dao.questionDetail(qnum);
	}
	
	public void questionInsert(QuestionBoardVO vo) {
		dao.questionInsert(vo);
	}
	
	public void questionUpdate(QuestionBoardVO vo) {
		dao.questionUpdate(vo);
	}
	
	public int questionDelete(int qnum) {
		return dao.questionDelete(qnum);
	}
	
	public int questionHit(int qhit) {
		return dao.questioinHit(qhit);
	}
}
