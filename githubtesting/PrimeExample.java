/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class PrimeExample {

	public static void main(String[] args){
		System.out.println("Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be \n"
				+ "divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.\n\n"
				+ "Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.\n\n"
				+ "");
		int n=3,flag=1,m;
		m=n/2;
		if(n==0||n==1) System.out.println(n + " is not a prime number");
		else{
			for(int i=2;i<=m;i++){
				if(n%i==0){
					System.out.println(n+" is not a prime number");
					flag=0;
					break;
				}
			}
		}
			if(flag==1) System.out.println(n + " is prime number");
	}

}
