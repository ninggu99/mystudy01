package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.GameDao;
import com.horse.vo.GameVO;

@Service
public class GameService implements GameDao {

	@Autowired
	private GameDao dao;

	@Override
	public void gameinsert(GameVO vo) {
		dao.gameinsert(vo);
	}

	@Override
	public List<GameVO> gamelist(){
		return dao.gamelist();

	}

	@Override
	public void gameUpdate(GameVO vo) {
		dao.gameUpdate(vo);
	}

	@Override
	public GameVO gameDetail(int gnum) {
		return dao.gameDetail(gnum);
	}

	@Override
	public int gameDelete(int gnum) {
		return dao.gameDelete(gnum);
	}



}
