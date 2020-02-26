package com.horse.dao;

import java.util.List;


import com.horse.vo.RacePlaceVO;

public interface RacePlaceDao {

	public void raceplaceinsert(RacePlaceVO vo);

	public List<RacePlaceVO> raceplacelist();

	public RacePlaceVO raceplaceDetail(int pnum);

	public void raceplaceUpdate(RacePlaceVO vo);

	public int raceplaceDelete(int pnum);
}
