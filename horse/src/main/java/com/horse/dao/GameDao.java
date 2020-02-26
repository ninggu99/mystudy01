package com.horse.dao;

import java.util.List;

import com.horse.vo.GameVO;

public interface GameDao {

	public void gameinsert(GameVO vo);

	public List<GameVO> gamelist();

	public void gameUpdate(GameVO vo);

	public GameVO gameDetail(int gnum);

	public int gameDelete(int gnum);

}
