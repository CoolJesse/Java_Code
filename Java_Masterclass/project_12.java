//Project 12 from Java Master Class: More on Methods

public class project_12{
	public static void main(String[] args){
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		/*Challenge 
		Create a method called displayHighScorePosition, it should take a player name as a parameter, and
		a 2nd parameter as a position in the high score table. You should display the player name along with a message like "managed to get into position" and the position they got and a furtherther message "on the high
		score table."
		
		Create a 2nd method called calculateHighScorePosition. It should be sent one argument only, the player score. It should return an int. The return data should be:
		1. if the score is > 1000
		2. if the score is > 500 and < 1000
		3. if the score is > 100 and < 500
		4. in all other cases 
		
		call both methods and display the result of the following: a score of 1500, 900, 400, and 50
		
		return type void
		void method is also known as a procedure
		*/
	}
	
/** methods *************************************************************************************************/
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		
		if(gameOver){
			int finalScore = score + (levelCompleted*bonus);
			finalScore += 1000;
			return finalScore;
		}
		
		else
			return -1;
	}
	
	public static void displayHighScorePosition(string name, int position){
		System.out.println("Player" + name + "managed to get into position" + position + "on the high score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore){
		if(playerScore > 1000)
		
		else if(playerScore > 500 && playerScore < 1000)
			
		else if(playerScore > 100 && playerScore < 500)
			
		else
	}
}