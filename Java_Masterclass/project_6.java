/*project_6 from Java Master class: operators*/

public class project_6{
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
			
			//int yourScore = 100;
			int yourScore = 90;
			//int yourScore = 80;
			
			if(yourScore == topScore)
				System.out.println("You got the high score!");
			
			else if(yourScore > topScore)
				System.out.println("You beat the high score!");
			
			else
				System.out.println("You did not get the top score.");
	
		}
}