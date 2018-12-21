/* Project 12 from Java Master Class; Expressions, Statements, Code Blocks, Methods, and more: More on Methods */

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
		
		String person1 = "Big Foot", person2 = "Yeti", person3 = "El Chupacabra", person4 = "Ancient Alien";
		
		displayHighScorePosition(person1, calculateHighScorePosition(1500) );
		displayHighScorePosition(person2, calculateHighScorePosition(900) );
		displayHighScorePosition(person3, calculateHighScorePosition(400) );
		displayHighScorePosition(person4, calculateHighScorePosition(50) );
		
		displayHighScorePosition("1000", calculateHighScorePosition(1000) );
		displayHighScorePosition("999", calculateHighScorePosition(999) );
		displayHighScorePosition("500", calculateHighScorePosition(500) );
		displayHighScorePosition("499", calculateHighScorePosition(499) );
		displayHighScorePosition("100", calculateHighScorePosition(100) );
		displayHighScorePosition("99", calculateHighScorePosition(99) );
		
		
		/*Challenge 
		Create a method called displayHighScorePosition, it should take a player name as a parameter, and
		a 2nd parameter as a position in the high score table. You should display the player name along with a message like "managed to get into position" and the position they got and a furtherther message "on the high score table."
		
		Create a 2nd method called calculateHighScorePosition. It should be sent one argument only, the player score. It should return an int. The return data should be:
		return 1 if the score is > 1000
		return 2 if the score is > 500 and < 1000
		return 3 if the score is > 100 and < 500
		return 4 in all other cases 
		
		call both methods and display the result of the following: a score of 1500, 900, 400, and 50
		
		return type for displayHighScore is void
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
	
	public static void displayHighScorePosition(String name, int position){
		System.out.println("Player " + name + " managed to get into position " + position + " on the high score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore){
		if(playerScore >= 1000)
			return 1;
		
		else if(playerScore >= 500)
			return 2;
			
		else if(playerScore >= 100)
			return 3;
		
		else
			return 4;
	}
}