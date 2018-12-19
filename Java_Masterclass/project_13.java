/*project 13 from Java Master Class: Method Overloading*/

public class project_13{
	public static void main(String[] args){
		/*
		int newScore = calculateScore("Jesse", 500);
		System.out.println("New score is " + newScore);
		
		calculateScore(75);
		calculateScore();
		*/
		
		System.out.println("2 feet 8 inches: " + calcFeetAndInchesToCentimeters(2, 8) );
		System.out.println("24 inches: " + calcFeetAndInchesToCentimeters(24) );
		System.out.println("-4 inches: " + calcFeetAndInchesToCentimeters(-4) );
		System.out.println("20 feet 6 inches: " + calcFeetAndInchesToCentimeters(20, 6) );
		
		/** Challenge ************************************************************************
		1. Create a method called calcFeetAndInchesToCentimeters
		2. Must have two parameters, feet as first and inches as second.
		3. Validate first parameter feet is >= 0 and second parameter inches >= 0 && <= 12.
		Return -1 if either of these tests fail.
		4. Calculate how many centimeters compromise the feet and inches passed to this method and return that value.
		
		5. Create a second method of the same name but with only one parameter, inches
		6. Validate the parameter is >=0. Return -1 if it is not
		7.Calculate how many feet are in the inches and then call the two parameter method to
		calculate the centimeters
		**************************************************************************************/
		
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
		// cm = ft/0.032808
		
		if(feet < 0 || inches < 0 || inches > 12)
			return -1;
		
		else{
			feet += (inches/12);
			double centimeters = feet/0.032808;
		
			return centimeters;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches){
		if(inches < 0)
			return -1;
		
		else{
			int feet = inches/12;
			inches %= 12;
			
			double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
			return centimeters;
		}
	}
	public static int calculateScore(String playerName, int score){
		System.out.println("Player " + playerName + " scored " + score + " points.");
		return score*1000;
	}
	
	public static int calculateScore(int score){
		System.out.println("Unnamed player scored " + score + " points.");
		return score*1000;
	}
	
	public static int calculateScore(){
		System.out.println("No player name, no player score.");
		return 0;
	}
}