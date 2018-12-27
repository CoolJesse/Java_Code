/* Project 17 from Java Master Class: The for statement*/

public class project_17{
	public static void main(String[] args){
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0) );
		/*
		for(int i=0; i < 5; i++){
			System.out.println("Loop " + i + " hello");
		}
		*/
		
		/*Challenge 1
		1. Using the for statement, call the calculateInterest method wiht the amount of 10,000
		with an interestRate of 2,3,4,5,6,7, and 8 percent
		2. Print the results
		*/
		
		/*
		for(int i=2; i < 9; i++){
			System.out.println("The interest of 10,000 at an interest rate of " + i + "% = " + 
			String.format( "%.2f", calculateInterest(10000, i) ) );
		}
		*/
		
		/*Challenge 2
		Modify the code above to to do the same thing but start at 8% and work down to 2%
		*/
		
		/*
		for(int i=8; i > 1; i--){
			System.out.println("The interest of 10,000 at an interest rate of " + i + "% = " + 
			String.format( "%.2f", calculateInterest(10000, i) ) );
		}
		*/
		/*Challenge 3 
		1. Create a for statement using any range of numbers 
		2. Determine if the number is a prime number using the isPrime method
		3. If it is a prime number, pring it out AND increment a count fo the number of prime numbers found
		4. If that count is 3 exit the for loop
		5. hint: the the break statement to exit
		*/
		
		for(int i = 25, primeCount = 0; i > 1 && primeCount < 3; i-- ){
			if( isPrime(i) ){
				primeCount++;
				System.out.println("Prime number found: " + i);
			}
		}
	}
	
	public static double calculateInterest(double amount, double interestRate){
		return(amount * (interestRate/100) );
	}
	
	public static boolean isPrime(int n){
		if(n == 1)
			return false;
		
		for(int i=2; i <= (long) Math.sqrt(n); i++){
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}