//project_3 from Java Masterclass: primitive data types; float and double

public class project_3{
		public static void main(String[] args){
			
			//width of int is 32 bits (4 bytes)
			int myIntValue = 5;
			
			//width of float is 32 (4 bytes);
			float myFloat_0 = 5f / 3f; //must include 'f' to designate value as float
			float myFloat_1 = (float) 4.25;
			float myFloat_2 = 3.33f;
			
			//width of double is 64 bits (8 bytes)
			double myDouble_0 = 5d / 3d;
			double myDouble_1 = 4.25;
			
			System.out.printf("Float values: %f, %.2f, %f %n", myFloat_0, myFloat_1, myFloat_2);
			System.out.printf("Double values: %.14f, %f %n", myDouble_0, myDouble_1);
			
			/******************** challenge **************************/
			/* Convert a given number of pounds to kilograms */
			/* 1. Create a variable to store the number of pounds */
			/* 2. Calculate the number of Kilograms for the number above and store in a variable */
			/* 3. Print out the result */
			
			/* Notes: 1 pound is equal to 0.45359237 */
			double lbs_kilo_conv = 0.45359237d;
			
			double pounds = 145.6d;
			double kilos = lbs_kilo_conv * pounds;
			
			System.out.println("My weight is kilograms is: " + kilos);
			
			double pi = 3.141_592_7d; //can use underscores to make numbers easier to read
		}
}