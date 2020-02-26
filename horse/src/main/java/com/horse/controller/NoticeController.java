package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.NoticeBoardService;
import com.horse.vo.NoticeBoardVO;
import com.horse.vo.PageVO;
import com.horse.vo.SearchVO;


@Controller
public class NoticeController {

	@Autowired
	private NoticeBoardService service;

	// 리스트
//	@RequestMapping("/notice")
//	public String question(Model m) {
//		m.addAttribute("list", service.list());
//		return "notice";
//	}

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
	
	// 공지사항 페이징
		@RequestMapping(value = "/notice"/* , method=RequestMethod.GET */)
		public ModelAndView list(int noticePage, String searchType, String searchValue) {
			PageVO pageInfo = new PageVO();
			int rowsPerpage = 10;	// 한 페이지당 보여줄 라인 수
			int pagesPerBlock = 5; 	// 한 페이지당 보여줄 블록 수
			int currentPage = noticePage;	// 현재 페이지
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
			int totalRows = service.noticeCount(svo);
//			System.out.println("totalRows : "+ totalRows);
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
			mav.setViewName("notice");
			//Map을 Dao에 주입
			List<NoticeBoardVO> list = service.noticeList(svo);
			// 페이지와 리스트값을 ModelAndView를 사용해서 값 전달
			mav.addObject("pageInfo", pageInfo);
			mav.addObject("searchType", searchType);
			mav.addObject("searchValue", searchValue);
			mav.addObject("list", list);
			return mav;
		}
}
