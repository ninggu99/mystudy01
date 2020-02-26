package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.QuestionBoardDao;
import com.horse.vo.QuestionBoardVO;
import com.horse.vo.SearchVO;

@Service/* �ش� ������ ���� �����̶�� ���*/
public class QuestionBoardSevice{
	
	@Autowired
	private QuestionBoardDao dao;

	public List<QuestionBoardVO> list(){
		return dao.boardList();
	}
	// �󼼺���
	public QuestionBoardVO questionDetail(int qnum){
		return dao.questionDetail(qnum);
	}
	// �Է�
	public void questionInsert(QuestionBoardVO vo) {
		dao.questionInsert(vo);
	}
	// ����
	public void questionUpdate(QuestionBoardVO vo) {
		dao.questionUpdate(vo);
	}
	// ����
	public int questionDelete(int qnum) {
		return dao.questionDelete(qnum);
	}
	// ��ȸ��
	public int questionHit(int qhit) {
		return dao.questioinHit(qhit);
	}
	// ���ǻ��� ���̺� �Ѱ���
	public int questionCount(SearchVO vo) {
		return dao.questionCount(vo);
	}
	// ���ǻ��� ����Ʈ ����¡
	public List<QuestionBoardVO> questionList(SearchVO vo){
		return dao.questionList(vo);
	}
}
