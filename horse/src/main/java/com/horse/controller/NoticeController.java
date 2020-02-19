package com.horse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.NoticeBoardService;
import com.horse.vo.NoticeBoardVO;
import com.horse.vo.QuestionBoardVO;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeBoardService service;
	
	// 리스트
	@RequestMapping("/notice")
	public String question(Model m) {
		m.addAttribute("list", service.list());
		return "notice";
	}
	
	// 상세보기
	@RequestMapping("/noticeDetail")
	public ModelAndView noticeDetail(@RequestParam("nnum") int nnum) {
		ModelAndView mav = new ModelAndView("noticeDetail");
		service.noticeHit(nnum); // 조회수
		NoticeBoardVO vo = service.noticeDetail(nnum);
		mav.addObject("vo", vo);
		return mav;
	}
	
	// 글쓰기 폼
	@RequestMapping("/noticeForm")
	public String noticeForm() {
		return "noticeForm";
	}
	
	// 글 저장
	@RequestMapping("/noticeSave")
	public String noticeSave(@ModelAttribute NoticeBoardVO vo) {
		service.noticeInsert(vo);
		return "redirect:notice";
	}
	
	// 글 수정 폼 
	@RequestMapping("/noticeUpdateForm")
	public ModelAndView noticeUpdateForm(@RequestParam("nnum") int nnum) {
		ModelAndView mav = new ModelAndView();
		NoticeBoardVO vo = service.noticeDetail(nnum);
		mav.addObject("vo", vo);
		mav.setViewName("noticeUpdateForm");
		return mav;
	}
	
	// 글 수정
	@RequestMapping(value = "/noticeUpdate",method = RequestMethod.POST)
	public String noticeUpdate(@ModelAttribute NoticeBoardVO vo) {
		service.noticeUpdate(vo);
		return "redirect:notice";
	}
	
	// 글  삭제
	@RequestMapping("/noticeDelete")
	public ModelAndView noticeDelete(@RequestParam("nnum")int nnum) {
		ModelAndView mav = new ModelAndView();
		service.noticeDelete(nnum);
		mav.setViewName("redirect:notice");
		return mav;
	}	
}
