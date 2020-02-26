package com.horse.dao;

import java.util.List;

import com.horse.vo.ReviewVO;
import com.horse.vo.SearchVO;

public interface ReviewDao {

	public ReviewVO reviewDetail(int renum);

	public void reviewinsert(ReviewVO vo);

	public List<ReviewVO> reviewList();

	public void reviewUpdate(ReviewVO vo);

	public int reviewDelete(int renum);

	public int reviewHit(int rehit);

	// ���� ���̺� �Ѱ���
	public int reviewCount(SearchVO vo);
	// ���� ����Ʈ ����¡
	public List<ReviewVO> reviewListPage(SearchVO vo);

}
