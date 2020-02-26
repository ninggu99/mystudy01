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

	// ¸®ºä Å×ÀÌºí ÃÑ°¹¼ö
	public int reviewCount(SearchVO vo);
	// ¸®ºä ¸®½ºÆ® ÆäÀÌÂ¡
	public List<ReviewVO> reviewListPage(SearchVO vo);

}
