package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.ReviewService;

import com.horse.vo.ReviewVO;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService service;

	// 리뷰 리스트
	@RequestMapping(value = "/review")
	public ModelAndView review() {
		ModelAndView mav = new ModelAndView();
		List<ReviewVO> rlist = service.reviewList();
		mav.setViewName("review");
		mav.addObject("rlist", rlist);

		return mav;

	}

	// 리뷰 등록
	@RequestMapping("/reviewSave")
	public String reviewSave(ReviewVO vo) {
		service.reviewinsert(vo);
		return "redirect:review";
	}

	// 리뷰등록폼
	@RequestMapping("/reviewForm")
	public String noticeForm() {
		return "reviewForm";
	}

	// 리뷰 업데이트 폼
	@RequestMapping("/reviewUpdateForm")
	public ModelAndView reviewUpdateForm(int renum) {
		ModelAndView mav = new ModelAndView();
		ReviewVO vo = service.reviewDetail(renum);
		mav.addObject("vo", vo);
		mav.setViewName("reviewUpdateForm");
		return mav;
	}

	@RequestMapping(value = "/reviewUpdate")
	public String reviewUpdate(ReviewVO vo) {
		service.reviewUpdate(vo);
		return "redirect:review";
	}

	@RequestMapping("/reviewDelete")
	public ModelAndView noticeDelete(int renum) {
		ModelAndView mav = new ModelAndView();
		service.reviewDelete(renum);
		mav.setViewName("redirect:review");
		return mav;
	}

}
