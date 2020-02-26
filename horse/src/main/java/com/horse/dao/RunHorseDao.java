package com.horse.dao;

import java.util.List;

import com.horse.vo.RunHorseVO;
import com.horse.vo.SearchVO;

public interface RunHorseDao {

	public List<RunHorseVO> runhorselist();

	public void runhorseinsert(RunHorseVO vo);

	public void runhorseUpdate(RunHorseVO vo);

	public RunHorseVO runhorseDetail(int hnum);

	public int runhorseDelete(int hnum);

	// �渶 ���̺� �Ѱ���
	public int runhorseCount(SearchVO vo);
	// �渶 ����Ʈ ����¡
	public List<RunHorseVO> runhorseList(SearchVO vo);
}
