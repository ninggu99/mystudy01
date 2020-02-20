package com.horse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.QuestionBoardSevice;
import com.horse.vo.QuestionBoardVO;
import com.horse.vo.ReplyBoardVO;


@Controller /* �ش� ������ ��Ʈ�� �����̶�� ���*/
public class QuestionBoardController {
	
	@Autowired /* �ڵ����� ���� �����ִ� ������ ��Ʈ�ѿ��� ���񽺸� ã���� ���*/
	private QuestionBoardSevice serivce;
	
	// ����Ʈ
	@RequestMapping("/question")
	public String question(Model m) {
		m.addAttribute("list", serivce.list());
		return "question";
	}
	
	// �󼼺���
	@RequestMapping(value = "/questionDetail", method = RequestMethod.GET)
	public ModelAndView questionDetail(@RequestParam("qnum") int qnum, Model m) {
		ModelAndView mav = new ModelAndView("questionDetail");
		serivce.questionHit(qnum); // ��ȸ��
		QuestionBoardVO vo = serivce.questionDetail(qnum);
		
		m.addAttribute("ReplyBoardVO",new ReplyBoardVO());
		mav.addObject("vo",vo);
		return mav;
	}
	// �۾��� ��
	@RequestMapping("/questionForm")
	public String questionForm() {
		return "questionForm";
	}
	
	// �۾��� ����
	@RequestMapping("/questionSave")
	public String questionSave(@ModelAttribute QuestionBoardVO vo) {
		serivce.questionInsert(vo);
		return "redirect:question";
	}
	
	// �� ���� �� 
	@RequestMapping("/questionUpdateForm")
	public ModelAndView questionUpdateForm(@RequestParam("qnum") int qnum) {
		ModelAndView mav = new ModelAndView();
		QuestionBoardVO vo = serivce.questionDetail(qnum);
		mav.addObject("vo", vo);
		mav.setViewName("questionUpdateForm");
		return mav;
	}

	// �� ����
	@RequestMapping(value = "/questionUpdate",method = RequestMethod.POST)
	public String questionUpdate(@ModelAttribute QuestionBoardVO vo) {
		serivce.questionUpdate(vo);
		return "redirect:question";
	}
	
	// ��  ����
	@RequestMapping("/questionDelete")
	public ModelAndView questionDelete(@RequestParam("qnum")int qnum) {
		ModelAndView mav = new ModelAndView();
		serivce.questionDelete(qnum);
		mav.setViewName("redirect:question");
		return mav;
	}
}