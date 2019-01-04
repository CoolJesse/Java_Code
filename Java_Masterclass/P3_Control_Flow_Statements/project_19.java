/* Project 19 from Java Master Class: The While and Do While Statements*/

public class project_19{
	public static void main(String[] args){
		
		/*
		int count =0;
		while(count != 6){
			System.out.println("Count value is " + count);
			count++;
		}
		
		for(count = 0; count < 6; count++){
			System.out.println("Count value is " + count);
		}
		
		count = 0; 
		do{
			System.out.println("Count value is " + count);
			count++;
			
			if(count > 100)
				break;
			
		}while(count != 6);
		*/
		
	/*Challenge 
	1. Create a method called isEvenNumber that takes a parameter of type int
	2. Method determines if parameter is even or odd. If even return true, otherwise return false */
	
		int number = 4;
		int finishNumber = 20;
		
		while(number <= finishNumber){
		
			number++;
			
			if(!isEvenNumber(number))
				continue; // jumps back to start of loop without executing following code.
			
			System.out.println("Even Number " + number);
		}
		
	/*Challenge 2
	Modify the code above to retain functionality but also recored number of even numbers. Break out of loop once it has found 5 even numbers. Display the total number of even numbers found at the end*/
		
		number = 4;
		finishNumber = 20;
		int counter = 0;
		
		while(number <= finishNumber){
		
			if(counter == 5)
				break;
			
			number++;
			
			if(!isEvenNumber(number))
				continue; // jumps back to start of loop without executing following code.
			
			counter++;
			System.out.println("Even Number " + number);
		}	
		
		System.out.println("Total number of even numbers is: " + counter);
	
	}
	
	public static boolean isEvenNumber(int n){
		if( (n % 2) == 0)
			return true;
		
		else
			return false;
	}
}