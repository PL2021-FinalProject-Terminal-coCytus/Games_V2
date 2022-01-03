package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuessTheNumber extends Game {
	
	public GuessTheNumber(int scores, int times) {
		super(scores, times);
	}

	public void playGuessTheNumber(){
		System.out.println("Game Start");
		System.out.print("Decide digit: ");
		
		Scanner digitScanner = new Scanner(System.in);
		int digit = digitScanner.nextInt();
		
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> tries = new ArrayList<String>();
		ArrayList<String> ans2 = new ArrayList<String>();
		
		for(int i=0 ; i<digit ; i++) {
			int num = (int)(Math.random()*10);
			String answer = Integer.toString(num);
			ans.add(answer);
			ans2.add(answer);
		}
		
		System.out.print("Please enter a "+digit+"-digit number:");
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			addTimes();
			int A=0,B=0;
			boolean check[] = new boolean[digit];
			Arrays.fill(check, false);
			
			String guess = sc.next();
			
			for(int i=0 ; i<digit ; i++) {
				char c = guess.charAt(i);
				String s =Character.toString(c);
				tries.add(s);
			}

			for(int i=0 ; i<digit ; i++){
				if(tries.get(i).equals((ans.get(i)))){
					A++;
					check[i]=true;
					ans.set(i, "A");
				}
			}
			
			for(int i=0 ; i<digit ; i++){
				for(int j=0 ; j<digit ; j++){
					if(!check[i] && tries.get(i).equals(ans.get(j))){
						B++;
						check[i]=true;
						for(int k=i+1 ; k<digit ; k++) {
							if(tries.get(k).equals(tries.get(i))) {
								B--;
							}
						}
						break;
					}
				}
			}
			
			if(A==digit){
				super.setScores(getTimes());
				System.out.println("Bingo! You tried "+getTimes()+" times. You get " + super.getScores() + " points.");
				sc.close();
				break;
			}else{
				System.out.println("Result: "+A+"A"+B+"B");
				System.out.print("Guess again:");
				tries.clear();
				for(int i=0; i<digit; i++) {
					ans.set(i, ans2.get(i));
				}
					
			}
		}

	}
}