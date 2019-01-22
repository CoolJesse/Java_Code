/** Project 36 from Java Master Class, Arrays, Lists...: Array Challenge **/

/** Challenge ***************************************************************************
1. Create a program using arrays that sorts a list of integers in descending order
2. Program should read numbers from user to enter in to array to be sorted
3. Implement the following methods: getIntegers, printArray, and sortIntegers
	A. getIntegers returns an array of entered integers from keyboard
	B. printArray prints out the contents of an array passed as parameter
	C. sortIntegers should sort the array and return a new array containing the sorted numbers
****************************************************************************************/
import java.util.Scanner;

public class project_36{
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[] myIntArray = getIntegers(5);
		printArray(myIntArray);
		
		int[] mySortedArray = sortIntegers(myIntArray);
		printArray(mySortedArray);
		
	}
/** Methods ***************************************************************************/
	/** getIntegers() **************************************************************/
	public static int[] getIntegers(int sizeOfArray){
		
		int[] numToSort = new int[sizeOfArray];
		
		System.out.println("Please enter " + sizeOfArray + " integers to sort.");
		
		for(int i=0; i < sizeOfArray; i++){
			numToSort[i] = scanner.nextInt();	
		}
		return numToSort;
	}
	/** printArray() ****************************************************************/
	public static void printArray(int[] array){
		int i=0;
		System.out.printf("array[] = {");
		for(; i< (array.length - 1); i++){
			System.out.printf("%d, ", array[i]);
		}
		System.out.println(array[i] + "}");
	}
	/** sortIntegers() using bubble sort ****************************************/
	public static int[] sortIntegers(int[] array){

		/** Brute force bubble sort **/
		int[] sortedArray = array;
		int temp;
		for(int i=0; i<array.length; i++){
			for(int j=i; j < array.length; j++){
				if(array[j] < array[i]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return sortedArray;	
	}
	/** Merge sort algorithms *********************************************************/
	/** sort() divides array and calls itself recursively on each half, calling merge() to merge the sorted halves ******************************************************/
	public static void sort(int[] arr, int left, int right){
		
		if(left < right){
		
			/* find middle ""pivot" point */
			int middle = (right + left)/2;
			
			/* Sort first and second halves */
			sort(arr, left, middle);
			sort(arr, middle +1, right);
			
			/* merge the sorted halves */
			merge(arr, left, middle, right);
		}
		else
			;/* do nothing because we have divided down to atomic level */
	}
	/** merge two subarrays arr[left...m] and arr[m+1...right] **********************/	
	public static void merge(int[] arr, int left, int middle, int right){
	
		/* find size of two subarrays to be merged */
		int size_1 = middle - left + 1;
		int size_2 = right - middle;
		
		/* create temp arrays to hold subarrays */
		int[] Left = new int[size_1];
		int[] Right = new int[size_2];
		
		/* copy data to temp arrays */
		for(int i=0; i < size_1; i++)
			Left[i] = arr[left + i];
			
		for(int i=0; i < size_2; i++)
			Right[i] = arr[(middle+1) + i];
		
		/* MERGE THE TEMP ARRAYS ***********************/
		int i=0, j=0, k = left;
		
		while(i < size_1 && j < size_2){
			if(Left[i] <= Right[j]){
				arr[k] = Left[i];
				i++;
			}
			
			else{
				arr[k] = Right[j];
				j++;
			}
			k++;
		}
		
		/* Merge remaining elements of Left[], if any */
		while(i < size_1){
			arr[k] = Left[i];
			i++;
			k++;
		}
		
		/* Merge remaining elements of Left[], if any */
		while(j < size_2){
			arr[k] = Right[j];
			j++;
			k++;
		}		
	}
/** End of Merge Sort Algorithm ********************************************************/
}