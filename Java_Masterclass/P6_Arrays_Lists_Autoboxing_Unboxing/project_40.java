/** Java Master Class, Section 8: Arrays, Inbuilt Lists, Autoboxing, and Unboxing **/
/** Section 89: Autoboxing and Unboxing ********************************************/
/** Autoboxing is used to wrap primitive data types inside objects. Wrapper exist for each primitive data type ***********************************************************/

import java.util.ArrayList;

class intClass{
	private int value;
	
	public intClass(int value){
		this.value = value;
	}
	public intClass(){
		this(0);
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}
public class project_40{
	public static void main(String[] args){
		
	/** All the following are legal **/
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		
	/** This is not legal because a primitive is no a class **/
		//ArrayList<int> intArrayList = new ArrayList<int>();
		
	/** The following is legal **/
		ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
		
		intClassArrayList.add(new intClass(54));
		
	/** Using Integer wrapper to make ArrayList of type int **/
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		
		for(int i=0; i<=10 ; i++){
			intArrayList.add(Integer.valueOf(i));
		}
		for(int i=0; i<=10 ; i++){
			System.out.println("i = " + intArrayList.get(i).intValue());
		}
		
	/** Simplified version of code above **/
		for(int i=11; i<=20 ; i++){
			intArrayList.add(i);
		}
		for(int i=11; i<=20 ; i++){
			System.out.println("i = " + intArrayList.get(i) );
		}
		
	/** This is also legal, do not need to use "new" key word **/
		Integer myIntValue = 56;
		/** equivalent to Integer myIntValue = Integer.valueOf(56); **/
		
	/** This is also legal in Java **/
		int myInt = myIntValue;
		/** Equivalent to int myInt = myIntValue.intValue(); **/
		
	}
}