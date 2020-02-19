package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.ReplyBoardDao;
import com.horse.vo.ReplyBoardVO;

@Service
public class ReplyBoardService {

	@Autowired
	private ReplyBoardDao dao;
	
	public List<ReplyBoardVO> replyList(int qnum){
		return dao.replyList(qnum);
	}
	
	public int saveReply(ReplyBoardVO vo) {
		return dao.saveReply(vo);
	}
	
	public int updateReply(ReplyBoardVO vo) {
		return dao.updateReply(vo);
	}
	
	public int deleteReply(int onum) {
		return dao.deleteReply(onum);
	}
}
