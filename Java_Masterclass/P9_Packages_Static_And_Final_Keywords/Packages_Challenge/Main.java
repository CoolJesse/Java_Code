import mylibrary.Series;
//import P9_Packages_Static_And_Final_Keywords.MyLibrary;

public class Main{
	public static void main(String[] args){
		
		int testValue = 50;
		
		System.out.println("Testing nSum function with value " + testValue + ": " + Series.nSum(testValue));
		
		System.out.println("Testing factorial function with value " + testValue + ": " + Series.factorial(testValue));		
		
		System.out.println("Testing fibonacci function with value " + testValue + ": " + Series.fibonacci(testValue));		
	}
}