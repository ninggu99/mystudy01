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
	
	// ����Ʈ
	@RequestMapping("/notice")
	public String question(Model m) {
		m.addAttribute("list", service.list());
		return "notice";
	}
	
	// �󼼺���
	@RequestMapping("/noticeDetail")
	public ModelAndView noticeDetail(@RequestParam("nnum") int nnum) {
		ModelAndView mav = new ModelAndView("noticeDetail");
		service.noticeHit(nnum); // ��ȸ��
		NoticeBoardVO vo = service.noticeDetail(nnum);
		mav.addObject("vo", vo);
		return mav;
	}
	
	// �۾��� ��
	@RequestMapping("/noticeForm")
	public String noticeForm() {
		return "noticeForm";
	}
	
	// �� ����
	@RequestMapping("/noticeSave")
	public String noticeSave(@ModelAttribute NoticeBoardVO vo) {
		service.noticeInsert(vo);
		return "redirect:notice";
	}
	
	// �� ���� �� 
	@RequestMapping("/noticeUpdateForm")
	public ModelAndView noticeUpdateForm(@RequestParam("nnum") int nnum) {
		ModelAndView mav = new ModelAndView();
		NoticeBoardVO vo = service.noticeDetail(nnum);
		mav.addObject("vo", vo);
		mav.setViewName("noticeUpdateForm");
		return mav;
	}
	
	// �� ����
	@RequestMapping(value = "/noticeUpdate",method = RequestMethod.POST)
	public String noticeUpdate(@ModelAttribute NoticeBoardVO vo) {
		service.noticeUpdate(vo);
		return "redirect:notice";
	}
	
	// ��  ����
	@RequestMapping("/noticeDelete")
	public ModelAndView noticeDelete(@RequestParam("nnum")int nnum) {
		ModelAndView mav = new ModelAndView();
		service.noticeDelete(nnum);
		mav.setViewName("redirect:notice");
		return mav;
	}	
}
