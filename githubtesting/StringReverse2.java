/**
 * 
 */
package automation;

import java.util.Scanner;

/**
 * @author AMeiyanathan
 *
 */
public class StringReverse2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder(str);

		System.out.println(sb.reverse());
		System.out.println(sb.toString());
	}

}
