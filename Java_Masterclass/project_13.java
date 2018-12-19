public class project_13{
	public static void main(String[] args){
		
		areEqualByThreeDecimalPlaces(0.0, 0.0);
		areEqualByThreeDecimalPlaces(3.174, 3.175);
		areEqualByThreeDecimalPlaces(-3.175, 3.175);
		areEqualByThreeDecimalPlaces(0, 2.77);
		areEqualByThreeDecimalPlaces(3.1756, 3.1757);
		areEqualByThreeDecimalPlaces(-3.1756, 3.1757);
		
	}

	public static boolean areEqualByThreeDecimalPlaces(double n1, double n2){
		/*Three possible cases exist: n1 == n2, n1 > n2, or n1 < n2.*/
		if(n1 == n2){
			//System.out.println("Match: n1==n2, n1: " + n1 + " n2: " + n2);
			return true;
		}

		/*Four possible cases: +n1 +n2, +n1 -n2, -n1 +n2, -n1 -n2*/		
		
		/*Test if n1 positive and n2 negative, or n1 negative and n2 positive*/
		/*If one number is positive and the other negative then we know they cannot be the equal
		up to 3 decimal places.*/
		
		else if( (n1 >= 0 && n2 <= 0) || (n1 <= 0 && n2 >= 0) ){
			//System.out.println("Not a match, one number is postive, the other negative. n1: "+n1 + " n2: "+n2);
			return false;
		}
		
		/*All remaining cases both n1 and n2 must be both positive or negative*/
		else if(n1 > n2){
			
			/*both numbers are positive*/
			if((n1-n2) < 0.000999){
				//System.out.println("Match! n1 > n2, n1: "+ n1 + " n2: "+ n2);
				return true;
			}
			/*both numbers are negative*/
			else if( ((n1+n2) > -0.001) && ((n1+n2) <= 0.0)){
				//System.out.println("Match! n1 < n2, n1: "+ n1 + " n2: "+n2 );
				return true;
			}
			else{
				//System.out.println("Not a match, n1: " + n1 + " n2: " + n2);
				return false;
			}
		}
		
		//n1 < n2
		else{
			
			/*both numbers are positive*/
			if((n2-n1) < 0.000999){
				//System.out.println("Match! n1 < n2, n1: "+n1 + " n2: "+ n2 );
				return true;
			}
			/*both numbers are negative*/
			else if( ((n2+n1) > -0.001) && ((n2+n1) <= 0.0)){
				//System.out.println("Match! n1 < n2, n1: "+n1 + " n2: "+ n2 );
				return true;
			}
			else{
				//System.out.println("Not a match, n1: " + n1 + " n2: " + n2);
				return false;
			}
		}
	}
}