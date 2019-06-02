/**
 * 
 */
package automation.palindrome;

/**
 * @author AMeiyanathan
 *
 */
public class PalindromeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the \n"
				+ "palindrome numbers. It can also be a string like LOL, MADAM etc.\n\n"
				+ "");
		int n=454,sum=0,r;
		int temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;//Must intalize the sum before using here
			n=n/10;
		}
		if(temp==sum) System.out.println("Palindrome number");
		else System.out.println("number is not Palindrome");
	}

}
