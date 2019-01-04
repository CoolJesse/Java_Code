/* project 15 from Java Master Class, Control Flow Statements: Day of the Week Challenge */

public class project_16{
	public static void main(String[] args){
		
		System.out.printf("Day %d of the week is ", 0);
		printDayOfTheWeek(0);
		System.out.printf("Day %d of the week is ", 1);
		printDayOfTheWeek(1);		
		System.out.printf("Day %d of the week is ", 2);
		printDayOfTheWeek(2);		
		System.out.printf("Day %d of the week is ", 3);
		printDayOfTheWeek(3);
		System.out.printf("Day %d of the week is ", 4);
		printDayOfTheWeek(4);		
		System.out.printf("Day %d of the week is ", 5);
		printDayOfTheWeek(5);
		System.out.printf("Day %d of the week is ", 6);
		printDayOfTheWeek(6);
		System.out.printf("Day %d of the week is ", 7);
		printDayOfTheWeek(7);

		
	}
	/*
	public static void printDayOfTheWeek(int day){
	
		switch(day){
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");			
				break;
			case 3:
				System.out.println("Wednesday");			
				break;
			case 4:
				System.out.println("Thursday");						
				break;
			case 5:
				System.out.println("Friday");						
				 break;
			case 6:
				System.out.println("Saturday");						
				 break;
			default:
				System.out.println("Invalid day");						
		}
	}
	*/
	public static void printDayOfTheWeek(int day){
		if(day > 6 || day < 0)
			System.out.println("Invalid day");
			
		else if(day == 0)
			System.out.println("Sunday");			
			
		else if(day == 1)
			System.out.println("Monday");			

		else if(day == 2)
			System.out.println("Tuesday");			

		else if(day == 3)
			System.out.println("Wednesday");			

		else if(day == 4)
			System.out.println("Thursday");
			
		else if(day == 5)
			System.out.println("Friday");			

		else
			System.out.println("Saturday");
			
			
	}
}