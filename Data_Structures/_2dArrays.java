/** practice with 2D Arrays *********************************************************/
//import java.util.Array;

public class _2dArrays{
	
	public static int ROW_SIZE = 3;
	public static int COLUMN_SIZE =10;
	
	public static void main(String[] args){
		
/** 1 dimensional array of Person objects ********************************************/
	/** Declare 1 dimensional array of Person objects **/
		Person[] people_1 = new Person[COLUMN_SIZE];
		
	/** Must initialize every object in array **/
		for(int i=0; i<COLUMN_SIZE; i++){
			people_1[i] = new Person();
		}
	/** Print contents of 1 dimensional array or Person objects **/
		System.out.println("1 Dimensional Array:");
		for(int i=0; i<COLUMN_SIZE; i++){
			System.out.println( "people_1[" + i + "] = " + people_1[i].printInfo() );
		}
		System.out.print("\n");
/*************************************************************************************/
/** 2 dimensional array of Person objects ********************************************/
	/** Declare 2 dimensional array **/
		Person[][] people_2 = new Person[ROW_SIZE][COLUMN_SIZE];
		
	/** Initialize every element of array of Person objects **/
		for(int i=0; i<ROW_SIZE; i++){
			//people_2[i] = new Person[COLUMN_SIZE];
			for(int j=0; j<COLUMN_SIZE; j++){
				if(i==0)
					people_2[i][j] = new Person("Man", 0, 'm');
				else if(i==1)
					people_2[i][j] = new Person("Woman", 0, 'w');
				else
					people_2[i][j] = new Person("Non-binary", 0, 'z');				
			}
		}
	/** Print contents of 2 dimensional Person array **/
		System.out.println("2 Dimensional Array:");	
		for(int i=0; i<ROW_SIZE; i++){
			for(int j=0; j<COLUMN_SIZE; j++){
				System.out.println( "people_2[" + i +"][" + j +"] = " + people_2[i][j].printInfo() );
			}
		}
		System.out.print("\n");
/*************************************************************************************/
/** 2 dimensional dynamic array of Person objects ***********************************/

	/** Declare 2 dimensional array but only declare number of rows **/
		Person[][] people_3 = new Person[ROW_SIZE][];
		
	/** Declare the size of each column, made different sizes for practice **/
		for(int i=0; i<ROW_SIZE; i++){
			int column_size = (i*ROW_SIZE + ROW_SIZE);
			people_3[i] = new Person[column_size];
		}
		
	/** Initialize every Person object in 2 dimensional Person array **/
		for(int i=0; i<ROW_SIZE; i++){
			for(int j=0; j < people_3[i].length; j++){
				people_3[i][j] = new Person();
			}
		}
	/** Print contents of 2 dimensional Person array **/
		System.out.println("2 Dimensional Dynamic Array:");	
		for(int i=0; i<ROW_SIZE; i++){
			for(int j=0; j<people_3[i].length; j++){
				System.out.println( "people_3[" + i +"][" + j +"] = " + people_3[i][j].printInfo() );
			}
		}
		System.out.print("\n");
	}
	
}