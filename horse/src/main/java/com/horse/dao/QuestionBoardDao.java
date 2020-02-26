package com.horse.dao;

import java.util.List;
import com.horse.vo.QuestionBoardVO;
import com.horse.vo.SearchVO;

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
	// ���ǻ��� ���̺� �Ѱ���
	public int questionCount(SearchVO vo);
	// ���ǻ��� ����Ʈ ����¡
	public List<QuestionBoardVO> questionList(SearchVO vo);
}
