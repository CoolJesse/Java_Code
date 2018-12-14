//Project 10 from Java Master Class: Code Blocks and The If Then Else Control Statement

public class project_10{
	public static void main(String[] args){
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		/*
		if(score == 5000)
			System.out.println("Your score was 5000!");
		
		else if(score < 5000){
			System.out.println("Your score was less than 5000!");
			System.out.println("This was executed!");
		}
		
		else
			System.out.println("Your score was more than 5000!")
		*/
		
		if(gameOver){
			int finalScore = score + (levelCompleted*bonus);
			System.out.println("Your final score is " + finalScore);
		}
		
		score = 1000;
		levelCompleted = 8;
		bonus = 200;
		
		if(gameOver){
			int finalScore = score + (levelCompleted*bonus);
			System.out.println("Your final score is " + finalScore);
		}
		/* Challenge
		1. Print out a second score on the screen with the following 
		2. score set to 1000
		3. levelCompleted set to 8
		4. bonus set to 200
		5. But make sure the first printout above still displays as well
		*/
	}
} 