/** Project 38 from Java Master Class, Arrays, Lists...: Array: Reverse Array **********/

/** Challenge ****************************************************************************
1. Write a method called reverse(int[] array). The method should not return a value. In other words the method is allowed to modify the array parameter.
2. In main() test the reverse() method and print the array both reversed and non-reversed.
3. To reverse the array you have to swap the elements, so that the first element is swapped with the last element and so on.
*****************************************************************************************/
import java.util.Arrays;

public class project_38{
	public static void main(String[] args){
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("Initial array[] = " + Arrays.toString(array) );
		reverse(array);
		System.out.println("Reversed array[] = " + Arrays.toString(array) );
	}
/** methods ***************************************************************************/
	public static void reverse(int[] array){
		int middle = array.length/2;
		int temp;
		
		for(int i=0, j=(array.length-1); i < j; i++, j--){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
/**************************************************************************************/
}
