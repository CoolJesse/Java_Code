//project 15 from Java Master Class, Control Flow Statements: The Switch Statement

public class project_15{
	public static void main(String[] args){
		/*
		int value = 1;
		
		if(value ==1)
			System.out.println("Value was 1");
		
		else if(value == 2)
			System.out.println("Value was 2");
		
		else	
			System.out.println("Was not 1 or 2");
		
		int switchValue = 3;
		
		switch(switchValue){
			case 1:
				System.out.println("Value was 1");
				break;
				
			case 2:
				System.out.println("Value was 2");
				break;
				
			default:
				System.out.println("Was not 1 or 2");
				break;
		}
		*/
		
		/*Challenge ******
		1. Create a new switch statement using char instead of int
		2. Create a new char variable
		3. Create a switch statement testing for A, B, C, D, or E
		4. Display a message if any of these are found and then break
		5. Add a default which displays a message saying "not found"
		*/
		
		char testValue = 'G';
		switch(testValue){
			case 'A':
				System.out.println("A found");
				break;
			case 'B':
				System.out.println("B found");
				break;
			case 'C': case 'D': case 'E':
				System.out.println("was found");
				break;
			/*
			case 'D':
				System.out.println("D found");
				break;
			case 'E':
				System.out.println("E found");
				break;
			*/
			default:
				System.out.println("Not Found");
		}
		
		String month = "January";
		
		switch (month.toLowerCase){ //toLowerCase method included in String library
			case "january":
				System.out.println("Jan");
				break;
			case "february":
				System.out.println("Feb");
				break;
			default:
				System.out.println("Not Sure");
		}
	}
}