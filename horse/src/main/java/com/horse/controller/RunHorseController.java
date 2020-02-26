package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.RunHorseService;
import com.horse.vo.PageVO;
import com.horse.vo.RunHorseVO;
import com.horse.vo.SearchVO;

@Controller
public class RunHorseController {
	@Autowired
	private RunHorseService service;

//	@RequestMapping(value = "/runhorse")
//	public ModelAndView runhorse() {
//		ModelAndView mav = new ModelAndView();
//		List<RunHorseVO> list = service.runhorselist();
//		mav.setViewName("runhorse");
//		mav.addObject("list", list);
//		return mav;
//	}

	@RequestMapping("/runhorseSave")
	public String runhorseSave(RunHorseVO vo) {
		service.runhorseinsert(vo);
		return "redirect:runhorse";
	}

	@RequestMapping("/runhorseForm")
	public String runhorseForm() {
		return "runhorseForm";
	}

	@RequestMapping("/runhorseUpdateForm")
	public ModelAndView runhorseUpdateForm(int hnum) {
		ModelAndView mav = new ModelAndView();
		RunHorseVO vo = service.runhorseDetail(hnum);
		mav.addObject("vo", vo);
		mav.setViewName("runhorseUpdateForm");
		return mav;
	}

	@RequestMapping(value = "/runhorseUpdate")
	public String runhorseUpdate(RunHorseVO vo) {
		service.runhorseUpdate(vo);
		return "redirect:runhorse";
	}

	@RequestMapping("/runhorseDelete")
	public ModelAndView runhorseDelete(int hnum) {
		ModelAndView mav = new ModelAndView();
		service.runhorseDelete(hnum);
		mav.setViewName("redirect:runhorse");
		return mav;
	}
	
	// 문의사항 페이징
	@RequestMapping(value = "/runhorse"/* , method=RequestMethod.GET */)
	public ModelAndView list(int runhorsePage, String searchType, String searchValue) {
		PageVO pageInfo = new PageVO();
		int rowsPerpage = 10; // 한 페이지당 보여줄 라인 수
		int pagesPerBlock = 5; // 한 페이지당 보여줄 블록 수
		int currentPage = runhorsePage; // 현재 페이지
		int currentBlock = 0; // 현재 블록수
		if (currentPage % pagesPerBlock == 0) { // 현재 블록에 대한 연산
			currentBlock = currentPage / pagesPerBlock;
		} else {
			currentBlock = currentPage / pagesPerBlock + 1;
		}
		int startRow = (currentPage - 1) * rowsPerpage + 1;
		int endRow = currentPage * rowsPerpage;
		SearchVO svo = new SearchVO();
		svo.setBegin(String.valueOf(startRow));
		svo.setEnd(String.valueOf(endRow));
		svo.setSearchType(searchType);
		svo.setSearchValue(searchValue);
		// 전체 레코드 수
		int totalRows = service.runhorseCount(svo);
//				System.out.println("totalRows : "+ totalRows);
		int totalpages = 0;
		// 전체 페이지를 구하는 공식
		if (totalRows % rowsPerpage == 0) {
			totalpages = totalRows / rowsPerpage;
		} else {
			totalpages = totalRows / rowsPerpage + 1;
		}
		// 전체 블록을 구하는 공식
		int totalBlocks = 0;
		if (totalpages % pagesPerBlock == 0) {
			totalBlocks = totalpages / pagesPerBlock;
		} else {
			totalBlocks = totalpages / pagesPerBlock + 1;
		}
		// PageVO 에 setter로 값을 주입
		pageInfo.setCurrentPage(currentPage);
		pageInfo.setCurrentBlock(currentBlock);
		pageInfo.setRowsPerPage(rowsPerpage);
		pageInfo.setPagesPerBlock(pagesPerBlock);
		pageInfo.setStartRow(startRow);
		pageInfo.setEndRow(endRow);
		pageInfo.setTotalRows(totalRows);
		pageInfo.setTotalPages(totalpages);
		pageInfo.setTotalBlocks(totalBlocks);
		// --------------------------------------
		ModelAndView mav = new ModelAndView();
		mav.setViewName("runhorse");
		// Map을 Dao에 주입
		List<RunHorseVO> list = service.runhorseList(svo);
		// 페이지와 리스트값을 ModelAndView를 사용해서 값 전달
		mav.addObject("pageInfo", pageInfo);
		mav.addObject("searchType", searchType);
		mav.addObject("searchValue", searchValue);
		mav.addObject("list", list);
		return mav;
	}
}
