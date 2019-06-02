/**
 * 
 */
package automation.palindrome;

import java.util.Scanner;

/**
 * @author AMeiyanathan
 *
 */
public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,r="";
		Scanner s1=new Scanner(System.in);
		s=s1.nextLine();
		s1.close();
		for(int i=s.length()-1;i>=0;i--)
			/*r=s.charAt(i);Type mismatch: cannot convert from char to String*/
			r=r+s.charAt(i);
		if(r.equals(s)) System.out.println("It is palindrome");
		else System.out.println("It is not a palindrome");
	}

}
