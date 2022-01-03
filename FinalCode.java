package game;

import java.util.Scanner;

public class FinalCode extends Game{
	
	public FinalCode(int scores, int times) {
		super(scores, times);
	}
	
	public void playFinalCode(){
		
		int L = 1,H = 1000;
		int key = (int)(Math.random()*999+1);
		int guess = 0;
				
	    Scanner scan = new Scanner(System.in);
		System.out.println("Final Code Game Start!");
		
		do{
		 addTimes();
	     System.out.println("Range:"+L+"~"+H);
	     System.out.print("Please enter a number: ");
	     guess = scan.nextInt();
	     
	     if(guess > key) {
	    	 H = guess;
	     }else {
	    	 L = guess;
	     }
		}
		
		while(key != guess);
		
		super.setScores(getTimes());
		
		System.out.println("Bingo! You tried "+getTimes()+" times. You get " + super.getScores() + " points.");
	}
	
}