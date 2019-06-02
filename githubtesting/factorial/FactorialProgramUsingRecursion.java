/**
 * 
 */
package automation.factorial;

/**
 * @author AMeiyanathan
 *
 */
public class FactorialProgramUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact=fact(n);
		System.out.println(fact);
	}
	static int fact(int n){
		if(n==0) 
			return 1;
		else 
			return (
				n
				*
				fact(n-1));
	}
}
