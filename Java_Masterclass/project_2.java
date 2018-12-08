//project_2 from Java Programming Masterclass
//To view java exit code in bash type; java project_2 && echo "Exit code: $?" 

public class project_2{
		public static void main(String[] args){
			
			//int has a width of 32 bits
			int myMinInt= -2_147_483_648; //smallest integer possible Java allows use of underscores with integers
			int myMaxInt= 2_147_483_647; //largest integer possible
			int myIntTotal= (myMinInt/2);
			
			System.out.printf("myMinValue: %d\n", myMinInt);
			System.out.printf("myMaxValue: %d\n", myMaxInt);
			
			System.out.printf("myIntTotal: %d\n", myIntTotal);
			
			//byte has a width of 8 bits
			byte myMinByte= -128; //-128 to 127
			byte myMaxByte= 127;
			byte myByteTotal= (byte)(myMinByte/2); //must cast to byte, default type in java is int
			
			System.out.printf("myByteTotal: %d\n", myByteTotal);
			
			//short has a width of 16 bits
			short myMinShort= -32768;
			short myMaxShort= 32767;
			short myShortTotal= (short)(myMinShort/2); //must cast to short, default type in java is int
			
			System.out.printf("myShortTotal: %d\n", myShortTotal);
			
			//width of 64 bits
			long myMinLong= -9_223_372_036_854_775_808L; //must add L to end of value to indicate "long" value
			long myMaxLong= 9_223_372_036_854_775_807L;
			long myLongTotal= (myMinLong/2);
			
			System.out.printf("myLongTotal: %d\n", myLongTotal);
			
			byte var_0= 10;
			short var_1= 20;
			int var_2= 50;
			long var_3= 50_000L + ( 10L * (var_0 + var_1 + var_2) );
			
			System.out.printf("50_000 + ( 10*(var_0 + var_1 + var_2) ) = %d\n", var_3);
		}
}