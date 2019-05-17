package Packages_Challenge;

import mylibrary.Series;

/* File structure: C:\Users\jessetolson\Documents\computer_stuff\Java_Code\Java_Masterclass\P9_Packages_Static_And_Final_Keywords\
	|- Packages_Challenge/
	|- mylibrary.jar
		|- mylibrary.Series.class

	- To compile: $ javac -cp '.;../mylibrary.jar' Main.java
	- To execute: $ java -cp '.;..;../mylibrary.jar' Packages_Challenge.Main
*/

public class Main{
	public static void main(String[] args){
		
		int testValue = 50;
		
		System.out.println("Testing nSum function with value " + testValue + ": " + Series.nSum(testValue));
		
		System.out.println("Testing factorial function with value " + testValue + ": " + Series.factorial(testValue));		
		
		System.out.println("Testing fibonacci function with value " + testValue + ": " + Series.fibonacci(testValue));	
		
	}
}