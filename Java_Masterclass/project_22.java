/*Project 22 from Java Master Class: Reading User Input*/
import java.util.Scanner;

public class project_22{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth");
		
		boolean hasNextInt = scanner.hasNextInt(); //checks user entered int value
		
		if(hasNextInt){
			int yearOfBirth = scanner.nextInt(); //scanner has built in method to convert string/int
			scanner.nextLine(); //after reading # with scanner must call nextline to avoid error
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			
			int age = 2018 - yearOfBirth;
			
			if(age >= 0 && age <= 120)
				System.out.println("Your age is " + age + " years old");
			else{
				System.out.println("Invalid year of birth");
			}
			
			System.out.println("Your name is " + name);	
		}
		
		else{
			System.out.println("Unable to parse year of birth.");
		}
		scanner.close();
	}
}