package com.horse.dao;

import java.util.List;

import com.horse.vo.NoticeBoardVO;
import com.horse.vo.SearchVO;

public interface NoticeBoardDao {
	
	// ����Ʈ
	public List<NoticeBoardVO> boardList();
	// �󼼺���
	public NoticeBoardVO noticeDetail(int nnum);	
	// �Է�
	public void noticeInsert(NoticeBoardVO vo);	
	// ����
	public void noticeUpdate(NoticeBoardVO vo);	
	// ����
	public int noticeDelete(int nnum);	
	// ��ȸ��
	public int noticeHit(int nhit);	
	// �������� ���̺� �Ѱ���
	public int noticeCount(SearchVO vo);
	// �������� ����Ʈ ����¡
	public List<NoticeBoardVO> noticeList(SearchVO vo);
}
