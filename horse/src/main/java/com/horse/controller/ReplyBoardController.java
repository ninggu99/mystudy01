package com.horse.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.horse.service.ReplyBoardService;
import com.horse.vo.ReplyBoardVO;

@RestController
@RequestMapping("/reply")
public class ReplyBoardController {

	@Autowired
	private ReplyBoardService service;

	// ¸®½ºÆ®
	@RequestMapping(value = "/replyList", method = RequestMethod.POST)
	public List<ReplyBoardVO> replyList1(@RequestParam("qnum") int qnum) {
		return service.replyList(qnum);
	}

	// ´ñ±Û µî·Ï
	@RequestMapping(value = "/saveReply", method = RequestMethod.POST)
	public Map<String, Object> saveReply(@RequestBody ReplyBoardVO replyBoardVO) {
		Map<String, Object> result = new HashMap<>();
		try {
			service.saveReply(replyBoardVO);
			result.put("status", "OK");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "False");
		}
		return result;
	}

	// ´ñ±Û ¼öÁ¤
	@RequestMapping(value = "/updateReply", method = RequestMethod.POST)
	public Map<String, Object> updateReply(@RequestBody ReplyBoardVO replyBoardVO) {
		Map<String, Object> result = new HashMap<>();
		try {
			service.updateReply(replyBoardVO);
			result.put("status", "OK");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "False");
		}
		return result;
	}

	// ´ñ±Û »èÁ¦
	@RequestMapping(value = "/deleteReply")
	public Map<String, Object> deleteReply(@RequestParam("onum") int onum) {
		Map<String, Object> result = new HashMap<>();
			try {
				service.deleteReply(onum);
				result.put("status", "OK");
			} catch (Exception e) {
				e.printStackTrace();
				result.put("status", "False");
			}
		return result;
	}
}
