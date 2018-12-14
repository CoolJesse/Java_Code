//Project 11 from Java Master Class: Methods

public class project_11{
	public static void main(String[] args){
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		int finalScore = 0;
		
		finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
		
		finalScore = calculateScore(true, 1000, 8, 200);
		
	}
	
/** method *************************************************************************************************/
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		
		if(gameOver){
			int finalScore = score + (levelCompleted*bonus);
			finalScore += 1000;
			System.out.println("Your final score is " + finalScore);
			return finalScore;
		}
		
		else
			return -1;
	}
}