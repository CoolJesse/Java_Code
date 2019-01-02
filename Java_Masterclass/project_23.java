/*Project 23 from Java Master Class: Reading User Input Challenge*/

/*Challenge
1. Read 10 numbers from the console entered by the user and print the sum of those numbers
2. Create Scanner to do this
3. Use the hasNextInt() method from the scanner to check if the user has entered an int value
4. If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have 10 numbers
5. Use nextInt() method to get the numbers
6. Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1,2,3,4, etc

Hints: use a while loop, use a counter variable, close scanner after you don't need it anymore, create a project named ReadingUserInputChallenge
*/
import java.util.Scanner;

public class project_23{
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers to sum.");
		int sum = 0;
		
		for(int i=0; i < 10;){
			System.out.println("Enter number #" + (i+1) + ":");
			
			if(myScanner.hasNextInt()){
				sum += myScanner.nextInt();
				myScanner.nextLine();
				i++;
			}
			
			else{
				System.out.println("Invalid Number.");
				myScanner.nextLine();
			}
		}
		
		System.out.println("The sum of all 10 numbers is: " + sum);
		
	}
}