/**
 * 
 */
package automation;

import java.util.Scanner;
/**
 * @author AMeiyanathan
 *
 */
public class StringReverse1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String ss=s.nextLine();

		for(int i=ss.length()-1;i>=0;i--) sb.append(ss.charAt(i));

		System.out.println(sb);
	}

}
