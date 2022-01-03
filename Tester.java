package game;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		GuessTheNumber g = new GuessTheNumber(1000, 0);
		FinalCode f = new FinalCode(1000, 0);
		RockPaperScissors r = new RockPaperScissors(1000, 0);
		
		System.out.println("Enter 1 to play Guess The Number.");
		System.out.println("Enter 2 to play Final Code.");
		System.out.println("Enter 3 to play Rock, Paper, Scissors.");
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		switch(s) {
			case 1:
				g.playGuessTheNumber();
				break;
			case 2:
				f.playFinalCode();
				break;
			case 3:
				r.playRPS();
				break;
		}
		sc.close();
	}

}
