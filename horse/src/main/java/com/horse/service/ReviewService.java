package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.ReviewDao;

import com.horse.vo.ReviewVO;
import com.horse.vo.SearchVO;

@Service
public class ReviewService implements ReviewDao {

	@Autowired
	private ReviewDao dao;


	@Override
	public void reviewinsert(ReviewVO vo) {
		dao.reviewinsert(vo);
	}

	@Override
	public List<ReviewVO> reviewList() {
		return dao.reviewList();
	}

	@Override
	public void reviewUpdate(ReviewVO vo) {
		dao.reviewUpdate(vo);
	}

	@Override
	public ReviewVO reviewDetail(int renum) {
		return dao.reviewDetail(renum);
	}

	@Override
	public int reviewDelete(int renum) {
		return dao.reviewDelete(renum);
	}

	@Override
	public int reviewHit(int rehit) {
		return dao.reviewHit(rehit);
	}

	@Override
	public int reviewCount(SearchVO vo) {
		return dao.reviewCount(vo);
	}

	@Override
	public List<ReviewVO> reviewListPage(SearchVO vo) {
		return dao.reviewListPage(vo);
	}
}
