/* Project 24 from Java Master Class: Minimum Maximum Challenge*/

/*
	1. Read the numbers from the console entered by the user and print the minimum and maximum numbers the user has entered.
	2. Before the user enters the number print the message "Enter number."
	3.If the user enters and invalid number, break out of the loop and print the minimum and maximum number.
*/
import java.util.Scanner;

public class project_24{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will find the minimum and maximum of any integers entered. To quit program enter any letter.");
		
		int min = 0, max = 0, input = 0;
		boolean validEntry = false;
		
		System.out.println("Enter number");
		if( scanner.hasNextInt() ){
			validEntry = true;
			input = scanner.nextInt();
			min = input;
			max = input;
		}
		
		while(validEntry){
			
			System.out.println("Enter number");
			
			if( !scanner.hasNextInt() )
				break;
			
			input = scanner.nextInt();
			
			if(input < min)
				min = input;
			
			else if(input > max)
				max = input;
			
			else
				;
			
			scanner.nextLine();
			//System.out.println("The minimum is: " + min + " The maximum is: " + max);
		}
		
		System.out.println("The minimum is: " + min + " and the max is: " + max);
		scanner.close();
	}
}