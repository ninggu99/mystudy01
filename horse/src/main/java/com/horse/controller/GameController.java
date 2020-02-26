package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.GameService;
import com.horse.vo.GameVO;

@Controller
public class GameController {
	@Autowired
	private GameService service;

	// 寃뚯엫 由ъ뒪�듃
	@RequestMapping(value = "/game")
	public ModelAndView game() {
		ModelAndView mav = new ModelAndView();
		List<GameVO> list = service.gamelist();
		mav.setViewName("game");
		mav.addObject("list", list);

		return mav;

	}

	// 寃뚯엫 �벑濡�
	@RequestMapping("/gameSave")
	public String gameSave(GameVO vo) {
		service.gameinsert(vo);
		return "redirect:game";
	}

	// 寃뚯엫 �벑濡앺뤌
	@RequestMapping("/gameForm")
	public String gameForm() {
		return "gameForm";
	}

	@RequestMapping("/gameUpdateForm")
	public ModelAndView gameUpdateForm(int gnum) {
		ModelAndView mav = new ModelAndView();
		GameVO vo = service.gameDetail(gnum);
		mav.addObject("vo", vo);
		mav.setViewName("gameUpdateForm");
		return mav;
	}

	@RequestMapping(value = "/gameUpdate")
	public String gameUpdate(GameVO vo) {
		service.gameUpdate(vo);
		return "redirect:game";
	}

	@RequestMapping("/gameDelete")
	public ModelAndView gameDelete(int gnum) {
		ModelAndView mav = new ModelAndView();
		service.gameDelete(gnum);
		mav.setViewName("redirect:game");
		return mav;
	}

}
