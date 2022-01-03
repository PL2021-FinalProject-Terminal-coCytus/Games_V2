package game;

public class Game {
	protected int scores;
	private int times;
	
	public Game(int scores, int times) {
		this.scores = scores;
		this.times = times;
	}
	
	public int getScores() {
		return scores;
	}
	
	public int getTimes() {
		return times;
	}
	
	public void setScores(int time) {
		scores = 1000-time*10;
	}
	
	public void addTimes() {
		times++;
	}
	
	
}
