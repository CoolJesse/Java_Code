//project 7 from Java Master Class: more on operators and operator precedence
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html for precedence

public class project_7{
		public static void main(String[] args){
			
			int result = 1 + 2;
			System.out.println("Result = " + result);
			
			int previousResult = result;
			
			result -= 1;
			
			System.out.println("result = result + 1.");
			System.out.println("previousResult = " + previousResult + " and previousResult = " + result);
			
			previousResult = result;
			result *= 10;
			
			System.out.println("previousResult = result. result = result * 10.");
			System.out.println("previousResult = " + previousResult + " and previousResult = " + result);
									
			previousResult = result;
			result /= 5;
									
			System.out.println("previousResult = result. result = result / 5.");
			System.out.println("previousResult = " + previousResult + " and result = " + result);
		
			previousResult = result;
			result %= 3;
			
			System.out.println("previousResult = result. result = result % 3.");
			System.out.println("previousResult = " + previousResult + " and result = " + result);
		
			result++;
			System.out.println("result++ = " + result);
			
			result --;
			System.out.println("result-- = " + result);
			
			boolean isAlien = false;
			
			if(isAlien == false)
				System.out.println("Not an alien.");
			
			int topScore = 90;
			
			int yourScore = 99;
			//int yourScore = 90;
			//int yourScore = 80;
			
/*------------------------------------------------------------------------------------------------------*/
			if(yourScore == topScore)
				System.out.println("You got the high score!");
			
			else if(yourScore > topScore)
				System.out.println("You beat the high score!");
			
			else
				System.out.println("You did not get the top score.");
/*------------------------------------------------------------------------------------------------------*/
			int secondTopScore = 81;
			
			if( (yourScore > secondTopScore) && (yourScore < 100) )
				System.out.println("Greater than second top score and less than 100.");
			
			if( (yourScore > 90) || (secondTopScore <= 90) )
				System.out.println("One of these tests is true;");
			
			int newValue = 50;
			
			if(newValue == 50)
				System.out.println("This is true.");
			
			boolean isCar = true;
			
			if(isCar)
				System.out.println("isCar is true.");
	
			boolean wasCar = isCar ? true: false; //ternary operator
			
			if(wasCar)
				System.out.println("wasCar == true.");
			
			/* Challenge
			1. Create a double variable with the value 20
			2. Create a second variable of type double with the value 80
			3. Add both numbers up and multiply by 25
			4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
			5. Write an "if" statemment that displays a message "Total was over the limit" if the remaining total (#4)is equal to 20 or less
			*/
	
			double firstVariable = 20;
			double secondVariable = 80;
			
			double result_2 = ( (firstVariable + secondVariable) * 25 );
			
			System.out.printf("%f + %f * 25 = %f\n", firstVariable, secondVariable, result_2);
			
			double remainder = (result_2 % 40);
			
			System.out.printf("%f %% 40 = %f\n", result_2, remainder); //%% to escape % with printf()
			
			if(remainder <= 20)
				System.out.println("Total was over the limit.");
		}
}
			