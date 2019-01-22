/* Project 35 from Java Master Class; Arrays, Java inbuilt Lists, AutoBoxing, and Unboxing: Arrays*/
import java.util.Scanner;

public class project_35{
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	
		int[] myIntegers = getIntegers(5);
		printArray(myIntegers);
		System.out.println("The average value for the array is: " + getAverage(myIntegers) );
	
		/*************************************************************************
		int[] myIntArray = new int[10];
		myIntArray[0] = 50;
		
		double[] myDoubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
		
		System.out.println(myIntArray[5]);
		
		for(int i=0; i < myIntArray.length; i++){
			myIntArray[i] = i;
		}		
		
		printArray(myIntArray);
		
		for(int i=0; i < myDoubleArray.length; i++){
			System.out.println("Element " + i + ": " + myDoubleArray[i]);
		}
	**********************************************************************************/
	}
	public static void printArray(int[] array){
		for(int i=0; i < array.length; i++){
			System.out.println("Element " + i + ": " + array[i]);
		}	
	}
	public static int[] getIntegers(int numOfElements){
		System.out.println("Enter " + numOfElements + " integer values. \r");
		int[] values = new int[numOfElements];
		
		for(int i=0; i<numOfElements; i++){
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	public static double getAverage(int[] array){
		int sum = 0;
		for(int i=0; i < array.length; i++)
			sum += array[i];
		
		return (double)sum / (double)array.length;
	}
}