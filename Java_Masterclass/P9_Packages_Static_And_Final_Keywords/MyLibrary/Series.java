// Math functions for Package project //
import java.math.BigInteger;

public class Series{
// return the sum of numbers 0 through n //
	public static BigInteger nSum(int n){
		if(n <= 0)
			return BigInteger.ZERO;
		
		BigInteger sum = new BigInteger("0");
		for(int i=n; i > 0; i--){
			sum = sum.add(BigInteger.valueOf(i));
		}
		return sum;
	}
// return product of numbers 1 through n //	
	public static BigInteger factorial(int n){
		if(n <= 0)
			return BigInteger.ZERO;
		
		BigInteger product = new BigInteger("1");
		for(int i=1; i <= n; i++){
			product = product.multiply(BigInteger.valueOf(i));
		}
		return product;
	}
// return nth fibonacci number //
	public static BigInteger fibonacci(int n){
		if(n <= 0)
			return BigInteger.ZERO;
		else if(n == 1)
			return BigInteger.ONE;
		else{
		// f(n-2)
			BigInteger fib_2 = new BigInteger("0");
		// f(n-1)
			BigInteger fib_1 = new BigInteger("1");
		// f(n)
			BigInteger fib = new BigInteger("1");
			
			for(int counter = 2; counter <= n; counter++){
			// f(n) = f(n-1) + f(n-2)
				fib = fib_1.add(fib_2);
				
				fib_2 = fib_1;
				fib_1 = fib;
			}
			return fib;
		}
	}
	
}