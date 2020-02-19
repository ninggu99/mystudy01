package com.horse.dao;

import java.util.List;
import com.horse.vo.QuestionBoardVO;

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
}
