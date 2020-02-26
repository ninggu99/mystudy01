package com.horse.dao;

import java.util.List;

import com.horse.vo.ReplyBoardVO;

public interface ReplyBoardDao {
	
	public List<ReplyBoardVO> replyList(int qnum);
	public int saveReply(ReplyBoardVO vo);
	public int updateReply(ReplyBoardVO vo);
	public int deleteReply(int onum);
}
