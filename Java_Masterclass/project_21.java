/* Project 21 from Java Master Class: Parsing Values from a String */

public class project_21{
	public static void main(String[] args){
	/** Int ********************************************************************************/
		String numberAsString = "2018";
		System.out.println("numberAsString= " + numberAsString);
		
		int number = Integer.parseInt(numberAsString); //Integer wrapper class for primative
													  //integer type
		System.out.println("number = " + number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println("numberAsString= " + numberAsString);
		System.out.println("number = " + number);
	/***************************************************************************************/
	/** Double *****************************************************************************/
		double number_2 = Double.parseDouble(numberAsString);
		numberAsString = "2018.125";
		
		System.out.println("numberAsString = " + numberAsString);
		System.out.println("number_2 = " + number_2);
		
		numberAsString += 1;
		number_2 += 1;
		
		System.out.println("numberAsString = " + numberAsString);
		System.out.println("number_2 = " + number_2);
	/**************************************************************************************/
	}
}