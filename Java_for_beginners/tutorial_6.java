// lesson 6 if

public class tutorial_6{
	public static void main(String[] args){
		
		boolean cond_0 = 1<6;
		boolean cond_1 = 5==5;
		boolean cond_2 = 3!=3;
		System.out.printf( "cond_0 is %b, cond_1 is %b, and cond_2 is %b\n", cond_0, cond_1, cond_2 );
		
		int myInt = 20;
		//int myInt = -20;
		
		for(int testValue = 10, i=0; i<3; testValue += 10, i++){
			System.out.printf("testValue is equal to %d\n", testValue);
			
			if(myInt < 0){
				System.out.printf("myInt is negative value %d, abort\n", myInt);
				break;
			}
			
			else if(myInt < testValue){
				System.out.println("myInt is less that testValue.");
			}
		
			else if(myInt == testValue){
				System.out.println("myInt is equal to testValue");
			}
			else{
				System.out.println("myInt is greater than testValue");
			}
		}	
	}
}