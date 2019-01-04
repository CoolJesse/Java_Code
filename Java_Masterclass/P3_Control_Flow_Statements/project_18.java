/* Project 18 from Java Master Class: Sum 3 and 5 Challenge*/

public class project_18{
	public static void main(String[] args){
		
		/* Challenge 
		1. Create a for statement using a range of numbers from 1 to 1000 inclusive
		2. Sum all the numbers that can be divided with both 3 and also with 5
		3. For those numbers that met the above conditions, print out the numbers
		4. Break out of the loop once you find 5 numbers that met the above conditions
		5. After breaking out of the loop print the sum of the numbers that me the above conditions
		
		note: type all code in main method
		*/
		
		int sum =0;
		for(int i=1, counter =0; i <= 1000 && counter < 5; i++){
			if( (i % 3 == 0) && (i % 5 == 0) ){
				sum += i;
				counter++;
				System.out.println(i + " is divisible by both 3 and 5.");
			}
		}
		
		System.out.println("The sum of all numbers between 1 and 1000, inclusive, that are divisible by both 3 and 5 is " + sum);
	}
}