package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.QuestionBoardSevice;
import com.horse.vo.PageVO;
import com.horse.vo.QuestionBoardVO;
import com.horse.vo.ReplyBoardVO;
import com.horse.vo.SearchVO;


@Controller 
public class QuestionBoardController {

	@Autowired 
	private QuestionBoardSevice serivce;

	
//	@RequestMapping("/question")
//	public String question(Model m) {
//		m.addAttribute("list", serivce.list());
//		return "question";
//	}

	
	// 문의사항 상세보기
	@RequestMapping(value = "/questionDetail", method = RequestMethod.GET)
	public ModelAndView questionDetail(@RequestParam("qnum") int qnum, Model m) {
		ModelAndView mav = new ModelAndView("questionDetail");
		serivce.questionHit(qnum); 
		QuestionBoardVO vo = serivce.questionDetail(qnum);

		m.addAttribute("ReplyBoardVO",new ReplyBoardVO());
		mav.addObject("vo",vo);
		return mav;
	}
	// 문의사항 작성폼
	@RequestMapping("/questionForm")
	public String questionForm() {
		return "questionForm";
	}

	// 문의사항 글 저장
	@RequestMapping("/questionSave")
	public String questionSave(@ModelAttribute QuestionBoardVO vo) {
		serivce.questionInsert(vo);
		return "redirect:question";
	}

	// 문의사항 글 수정 폼
	@RequestMapping("/questionUpdateForm")
	public ModelAndView questionUpdateForm(@RequestParam("qnum") int qnum) {
		ModelAndView mav = new ModelAndView();
		QuestionBoardVO vo = serivce.questionDetail(qnum);
		mav.addObject("vo", vo);
		mav.setViewName("questionUpdateForm");
		return mav;
	}

	// 문의사항 글 수정
	@RequestMapping(value = "/questionUpdate",method = RequestMethod.POST)
	public String questionUpdate(@ModelAttribute QuestionBoardVO vo) {
		serivce.questionUpdate(vo);
		return "redirect:question";
	}

	// 문의사항 글 삭제
	@RequestMapping("/questionDelete")
	public ModelAndView questionDelete(@RequestParam("qnum")int qnum) {
		ModelAndView mav = new ModelAndView();
		serivce.questionDelete(qnum);
		mav.setViewName("redirect:question");
		return mav;
	}
	
	// 문의사항 페이징
	@RequestMapping(value = "/question"/* , method=RequestMethod.GET */)
	public ModelAndView list(int questionPage, String searchType, String searchValue) {
		PageVO pageInfo = new PageVO();
		int rowsPerpage = 10;	// 한 페이지당 보여줄 라인 수
		int pagesPerBlock = 5; 	// 한 페이지당 보여줄 블록 수
		int currentPage = questionPage;	// 현재 페이지
		int currentBlock = 0;	// 현재 블록수
		if(currentPage % pagesPerBlock == 0) {	// 현재 블록에 대한 연산
			currentBlock = currentPage / pagesPerBlock;
		}else {
			currentBlock = currentPage / pagesPerBlock + 1;
		}
		int startRow =(currentPage - 1) * rowsPerpage + 1;
		int endRow = currentPage * rowsPerpage;
		SearchVO svo = new SearchVO();
		svo.setBegin(String.valueOf(startRow));
		svo.setEnd(String.valueOf(endRow));
		svo.setSearchType(searchType);
		svo.setSearchValue(searchValue);
		// 전체 레코드 수
		int totalRows = serivce.questionCount(svo);
//		System.out.println("totalRows : "+ totalRows);
		int totalpages = 0;
		// 전체 페이지를 구하는 공식
		if(totalRows % rowsPerpage == 0) {
			totalpages = totalRows / rowsPerpage;
		}else {
			totalpages = totalRows / rowsPerpage + 1;
		}
		// 전체 블록을 구하는 공식
		int  totalBlocks = 0;
		if(totalpages % pagesPerBlock == 0) {
			totalBlocks = totalpages / pagesPerBlock;
		}else {
			totalBlocks = totalpages / pagesPerBlock + 1;
		}
		//PageVO 에 setter로 값을 주입
		pageInfo.setCurrentPage(currentPage);
		pageInfo.setCurrentBlock(currentBlock);
		pageInfo.setRowsPerPage(rowsPerpage);
		pageInfo.setPagesPerBlock(pagesPerBlock);
		pageInfo.setStartRow(startRow);
		pageInfo.setEndRow(endRow);
		pageInfo.setTotalRows(totalRows);
		pageInfo.setTotalPages(totalpages);
		pageInfo.setTotalBlocks(totalBlocks);
		//--------------------------------------
		ModelAndView mav = new ModelAndView();
		mav.setViewName("question");
		//Map을 Dao에 주입
		List<QuestionBoardVO> list = serivce.questionList(svo);
		// 페이지와 리스트값을 ModelAndView를 사용해서 값 전달
		mav.addObject("pageInfo", pageInfo);
		mav.addObject("searchType", searchType);
		mav.addObject("searchValue", searchValue);
		mav.addObject("list", list);
		return mav;
	}
}