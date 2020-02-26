package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.RacePlaceDao;
import com.horse.vo.RacePlaceVO;

@Service
public class RacePlaceService implements RacePlaceDao {

	@Autowired
	private RacePlaceDao dao;

	@Override
	public RacePlaceVO raceplaceDetail(int pnum) {
		return dao.raceplaceDetail(pnum);
	}

	@Override
	public void raceplaceinsert(RacePlaceVO vo) {
		dao.raceplaceinsert(vo);
	}

	@Override
	public List<RacePlaceVO> raceplacelist() {
		return dao.raceplacelist();
	}
	@Override
	public void raceplaceUpdate(RacePlaceVO vo) {
		dao.raceplaceUpdate(vo);
	}
	@Override
	public int raceplaceDelete(int pnum) {
		return dao.raceplaceDelete(pnum);
	}
}
