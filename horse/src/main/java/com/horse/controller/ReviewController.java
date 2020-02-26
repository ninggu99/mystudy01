package com.horse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.horse.service.ReviewService;
import com.horse.vo.PageVO;
import com.horse.vo.ReviewVO;
import com.horse.vo.SearchVO;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService service;

//	@RequestMapping(value = "/review")
//	public ModelAndView review() {
//		ModelAndView mav = new ModelAndView();
//		List<ReviewVO> rlist = service.reviewList();
//		mav.setViewName("review");
//		mav.addObject("rlist", rlist);
//		return mav;
//	}

	@RequestMapping("/reviewSave")
	public String reviewSave(ReviewVO vo) {
		service.reviewinsert(vo);
		return "redirect:review";
	}

	@RequestMapping("/reviewForm")
	public String reviewForm() {
		return "reviewForm";
	}

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
	
	// ���� ����¡
	@RequestMapping(value = "/review"/* , method=RequestMethod.GET */)
	public ModelAndView list(int reviewPage, String searchType, String searchValue) {
		PageVO pageInfo = new PageVO();
		int rowsPerpage = 10; // �� �������� ������ ���� ��
		int pagesPerBlock = 5; // �� �������� ������ ��� ��
		int currentPage = reviewPage; // ���� ������
		int currentBlock = 0; // ���� ��ϼ�
		if (currentPage % pagesPerBlock == 0) { // ���� ��Ͽ� ���� ����
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
		// ��ü ���ڵ� ��
		int totalRows = service.reviewCount(svo);
//			System.out.println("totalRows : "+ totalRows);
		int totalpages = 0;
		// ��ü �������� ���ϴ� ����
		if (totalRows % rowsPerpage == 0) {
			totalpages = totalRows / rowsPerpage;
		} else {
			totalpages = totalRows / rowsPerpage + 1;
		}
		// ��ü ����� ���ϴ� ����
		int totalBlocks = 0;
		if (totalpages % pagesPerBlock == 0) {
			totalBlocks = totalpages / pagesPerBlock;
		} else {
			totalBlocks = totalpages / pagesPerBlock + 1;
		}
		// PageVO �� setter�� ���� ����
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
		mav.setViewName("review");
		// Map�� Dao�� ����
		List<ReviewVO> list = service.reviewListPage(svo);
		// �������� ����Ʈ���� ModelAndView�� ����ؼ� �� ����
		mav.addObject("pageInfo", pageInfo);
		mav.addObject("searchType", searchType);
		mav.addObject("searchValue", searchValue);
		mav.addObject("list", list);
		return mav;
	}

}
