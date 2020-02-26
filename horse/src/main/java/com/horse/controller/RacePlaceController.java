package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.RacePlaceService;
import com.horse.vo.RacePlaceVO;

@Controller
public class RacePlaceController {
	@Autowired
	private RacePlaceService service;

	@RequestMapping(value = "/raceplace")
	public ModelAndView raceplace() {
		ModelAndView mav = new ModelAndView();
		List<RacePlaceVO> list = service.raceplacelist();
		mav.setViewName("raceplace");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/raceplaceSave")
	public String raceplaceSave(RacePlaceVO vo) {
		service.raceplaceinsert(vo);
		return "redirect:raceplace";
	}

	@RequestMapping("/raceplaceForm")
	public String raceplaceForm() {
		return "raceplaceForm";
	}

	@RequestMapping("/raceplaceUpdateForm")
	public ModelAndView raceplaceUpdateForm(int pnum) {
		ModelAndView mav = new ModelAndView();
		RacePlaceVO vo = service.raceplaceDetail(pnum);
		mav.addObject("vo", vo);
		mav.setViewName("raceplaceUpdateForm");
		return mav;
	}

	@RequestMapping(value = "/raceplaceUpdate")
	public String raceplaceUpdate(RacePlaceVO vo) {
		service.raceplaceUpdate(vo);
		return "redirect:raceplace";
	}

	@RequestMapping("/raceplaceDelete")
	public ModelAndView raceplaceDelete(int pnum) {
		ModelAndView mav = new ModelAndView();
		service.raceplaceDelete(pnum);
		mav.setViewName("redirect:raceplace");
		return mav;
	}
	
	
}
