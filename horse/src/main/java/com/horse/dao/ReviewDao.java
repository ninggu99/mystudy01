package com.horse.dao;

import java.util.List;

import com.horse.vo.ReviewVO;

public interface ReviewDao {

	public ReviewVO reviewDetail(int renum);

	public void reviewinsert(ReviewVO vo);

	public List<ReviewVO> reviewList();

	public void reviewUpdate(ReviewVO vo);

	public int reviewDelete(int renum);

	public int reviewHit(int rehit);

	public int reviewTotalCount();

}
