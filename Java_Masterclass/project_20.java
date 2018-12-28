/*Project 20 from Java Master Class: Digit Sum Challenge*/

public class project_20{
	public static void main(String[] args){
		
		int test1 = 125, test2 = 6, test3 = 1025, test4 = -2;
		System.out.println("The sum of " + test1 + " is " + sumDigits(test1) );
		System.out.println("The sum of " + test2 + " is " + sumDigits(test2) );
		System.out.println("The sum of " + test3 + " is " + sumDigits(test3) );
		System.out.println("The sum of " + test4 + " is " + sumDigits(test4) );
	}
	
	public static int sumDigits(int number){
		if(number < 10)
			return -1;
		
		else{
			int sum = 0;
			while(number > 0){
				sum += (number % 10);
				number = number/10;
			}
			return sum;
		}
	}
}