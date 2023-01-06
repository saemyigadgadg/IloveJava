package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao {
	private Score[] scores;
	private int cursor; //테이블 타입의 횡이라고 생각하면 된다.
	
	public ScoreDaoImpl(Score[] scores) {
		this.scores = scores;
	}
	
	@Override
	public void insertScore(Score score) {
		this.scores[cursor++] = score;
	}
	
	@Override
	public Score[] selectScore() {
		return this.scores;
	}
}
