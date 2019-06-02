/**
 * 
 */
package automation.factorial;

/**
 * @author AMeiyanathan
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4! = 4*3*2*1 = 24 \n\n"
				+ "Here, 4! is pronounced as \"4 factorial\", it is also called \"4 bang\" or \"4 shriek\".\n\n"
						+ "");
		int fact=1,n=5;
		for(int i=1;i<=5;i++) fact=fact*i;
		System.out.println(fact);
	}

}
