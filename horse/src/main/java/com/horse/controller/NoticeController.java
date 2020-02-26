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

	// ����Ʈ
//	@RequestMapping("/notice")
//	public String question(Model m) {
//		m.addAttribute("list", service.list());
//		return "notice";
//	}

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
	
	// �������� ����¡
		@RequestMapping(value = "/notice"/* , method=RequestMethod.GET */)
		public ModelAndView list(int noticePage, String searchType, String searchValue) {
			PageVO pageInfo = new PageVO();
			int rowsPerpage = 10;	// �� �������� ������ ���� ��
			int pagesPerBlock = 5; 	// �� �������� ������ ��� ��
			int currentPage = noticePage;	// ���� ������
			int currentBlock = 0;	// ���� ��ϼ�
			if(currentPage % pagesPerBlock == 0) {	// ���� ��Ͽ� ���� ����
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
			// ��ü ���ڵ� ��
			int totalRows = service.noticeCount(svo);
//			System.out.println("totalRows : "+ totalRows);
			int totalpages = 0;
			// ��ü �������� ���ϴ� ����
			if(totalRows % rowsPerpage == 0) {
				totalpages = totalRows / rowsPerpage;
			}else {
				totalpages = totalRows / rowsPerpage + 1;
			}
			// ��ü ����� ���ϴ� ����
			int  totalBlocks = 0;
			if(totalpages % pagesPerBlock == 0) {
				totalBlocks = totalpages / pagesPerBlock;
			}else {
				totalBlocks = totalpages / pagesPerBlock + 1;
			}
			//PageVO �� setter�� ���� ����
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
			//Map�� Dao�� ����
			List<NoticeBoardVO> list = service.noticeList(svo);
			// �������� ����Ʈ���� ModelAndView�� ����ؼ� �� ����
			mav.addObject("pageInfo", pageInfo);
			mav.addObject("searchType", searchType);
			mav.addObject("searchValue", searchValue);
			mav.addObject("list", list);
			return mav;
		}
}
