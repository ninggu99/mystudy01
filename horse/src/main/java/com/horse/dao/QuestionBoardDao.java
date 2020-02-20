package com.horse.dao;

import java.util.List;
import com.horse.vo.QuestionBoardVO;

public interface QuestionBoardDao {
	
	// ����Ʈ
	public List<QuestionBoardVO> boardList();	
	// �󼼺���
	public QuestionBoardVO questionDetail(int qnum);
	// �Է�
	public void questionInsert(QuestionBoardVO vo);	
	// ����
	public void questionUpdate(QuestionBoardVO vo);	
	// ����
	public int questionDelete(int qnum);	
	// ��ȸ��
	public int questioinHit(int qhit);	
}
