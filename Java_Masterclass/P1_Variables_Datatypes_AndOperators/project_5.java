/*project 5 from Java Masterclass: Strings and review of primative data types
Primative types are: byte, short, int, long, float, double, char, boolean*/

public class project_5{
		public static void main(String[] args){
			
			//byte
			//short
			//int
			//long
			//float
			//double
			//char
			//boolean
			
			String myString = "This is a string";
			System.out.println(myString);
			
			myString += ", now we are cooking with gas.";
			System.out.println(myString);
			
			System.out.println(myString + " also, " + "\u00A9 2015");
			
			String numberString = "250.55";
			numberString += "49.95";
			
			System.out.println("The result is: " + numberString); //appends 49.95 to string 250.55, does not add numbers
			
			String lastString = "10";
			int myInt = 50;
			lastString += myInt;
			
			System.out.println("LastString is equal to: " + lastString);
			
			double doubleNumber = 120.47;
			lastString += doubleNumber;
			System.out.println("LastString is equal to: " + lastString);
				
		}
}