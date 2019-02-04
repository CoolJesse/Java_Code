/** Project 37 from Java Master Class, Arrays, Lists...: Array: Find Min Challenge **/

/** Challenge ***************************************************************************
1. Write a method called readIntegers() with a parameter called "count" that represents how many integers a user must enter. This method needs to read from the console until all the numbers are entered and then return an array containing all the numbers. Assume user will only enter integers, never letters
2. Write a method findMin() with an array as a parameter. This method must return the minimum value in the array.
3. In the main method read the count from the console and call the methods readIntegers() with the count as the parameter. Then call the findMin() method passing the array returned by readIntegers().
4. Print minimum element in array
****************************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class project_37{
	/** create global scanner so readIntegers() can access it to read console input **/
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.printf("Please enter the number of elements you would like the array to contain-> ");
		
		int count = scanner.nextInt();
		scanner.nextLine(); //to handle user pressing enter key
		
		int[] array = readIntegers(count);
		int minValue = findMin(array);
		
		System.out.println("int[] array = " + Arrays.toString(array) );
		System.out.println("Minimum value = " + minValue);
		
		scanner.close();
	}
/** Methods ***************************************************************************/
	/** readIntegers() ***********************************************************/
	public static int[] readIntegers(int count){
		
		System.out.println("Please enter " + count + " integers.");
		int[] array = new int[count];
		
		for(int i=0; i<count; i++){
			array[i] = scanner.nextInt();
			scanner.nextLine(); //make sure we handle enter key being pressed
		}
		return array;
	}
	/** findMin() ****************************************************************/
	public static int findMin(int[] array){
		
		int min = array[0];
		for(int i=0; i < array.length; i++){
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}