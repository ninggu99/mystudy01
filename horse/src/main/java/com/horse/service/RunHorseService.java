package com.horse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.dao.RunHorseDao;
import com.horse.vo.RunHorseVO;
import com.horse.vo.SearchVO;

@Service
public class RunHorseService implements RunHorseDao {
	@Autowired
	private RunHorseDao dao;


	@Override
	public void runhorseinsert(RunHorseVO vo) {
		dao.runhorseinsert(vo);
	}

	@Override
	public List<RunHorseVO> runhorselist() {
		return dao.runhorselist();
	}
	@Override
	public void runhorseUpdate(RunHorseVO vo) {
		dao.runhorseUpdate(vo);
	}

	@Override
	public RunHorseVO runhorseDetail(int hnum) {
		return dao.runhorseDetail(hnum);
	}

	@Override
	public int runhorseDelete(int hnum) {
		return dao.runhorseDelete(hnum);
	}

	@Override
	public int runhorseCount(SearchVO vo) {
		return dao.runhorseCount(vo);
	}

	@Override
	public List<RunHorseVO> runhorseList(SearchVO vo) {
		return dao.runhorseList(vo);
	}

}
