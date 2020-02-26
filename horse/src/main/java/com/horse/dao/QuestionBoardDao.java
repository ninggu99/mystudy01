package com.horse.dao;

import java.util.List;
import com.horse.vo.QuestionBoardVO;
import com.horse.vo.SearchVO;

public interface QuestionBoardDao {
	
	// 리스트
	public List<QuestionBoardVO> boardList();	
	// 상세보기
	public QuestionBoardVO questionDetail(int qnum);
	// 입력
	public void questionInsert(QuestionBoardVO vo);	
	// 수정
	public void questionUpdate(QuestionBoardVO vo);	
	// 삭제
	public int questionDelete(int qnum);	
	// 조회수
	public int questioinHit(int qhit);	
	// 문의사항 테이블 총갯수
	public int questionCount(SearchVO vo);
	// 문의사항 리스트 페이징
	public List<QuestionBoardVO> questionList(SearchVO vo);
}
