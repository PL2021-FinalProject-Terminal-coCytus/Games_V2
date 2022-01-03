package game;

import java.util.Scanner;

public class RockPaperScissors extends Game{

	public RockPaperScissors(int scores, int times) {
		super(scores, times);
	}
	
	public void setScores(int win, int lose) {
		scores = win*200 - lose*10;
	}

	public void playRPS(){
		int win = 0;
		int lose = 0;
		int tie = 0;
		double winRate, loseRate, tieRate;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Game Start! Please enter paper, rock, or scissors!");
		
		while(sc.hasNext()) {
			String scan = sc.next();
			
			if(scan.equals("Q") || scan.equals("q")) {
				break;
			}
			
			double rand = Math.round(Math.random()*100.0)/100.0;
			if(rand >= 0.66) {
				System.out.println("Computer: paper");
			}else if(rand <= 0.33) {
				System.out.println("Computer: rock");
			}else {
				System.out.println("Computer: scissors");
			}
			
			if(scan.equals("paper")) {
				if(rand <= 0.33) {
					System.out.println("Result: You win!");
					addTimes();
					win++;
				}else if(rand >= 0.66) {
					System.out.println("Result: Tie!");
					tie++;
					addTimes();
				}else {
					System.out.println("Result: You lose!");
					lose++;
					addTimes();
				}
			}else if(scan.equals("rock")) {
				if(rand <= 0.33) {
					System.out.println("Result: Tie!");
					tie++;
					addTimes();
				}else if(rand >= 0.66) {
					System.out.println("Result: You lose!");
					lose++;
					addTimes();
				}else {
					System.out.println("Result: You win!");
					win++;
					addTimes();
				}
			}else if(scan.equals("scissors")){
				if(rand <= 0.33) {
					System.out.println("Result: You lose!");
					lose++;
					addTimes();
				}else if(rand >= 0.66) {
					System.out.println("Result: You win!");
					win++;
					addTimes();
				}else {
					System.out.println("Result: Tie!");
					tie++;
					addTimes();
				}
			}else if(!scan.equals("Q")){
				System.out.println("Invalid action! Please enter paper, rock, or scissors!");
			}
			
			System.out.println("Enter Q or q to quit!");
			
		}
		winRate = Math.round((win*10000.0/getTimes()))/100.0;
		loseRate = Math.round((lose*10000.0/getTimes()))/100.0;
		tieRate = Math.round((tie*10000.0/getTimes()))/100.0;
		
		setScores(win, lose);
		
		System.out.println("Your played "+getTimes()+" times.");
		System.out.println("You won "+win+" times. Winrate="+winRate+"%");
		System.out.println("You lose "+lose+" times. Loserate="+loseRate+"%");
		System.out.println("You tied "+tie+" times. Tierate="+tieRate+"%");
		System.out.println("You get " + super.getScores() + " points.");
		
	}

}