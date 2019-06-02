/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t();
	}

	static void t(){
		System.out.println("print");
		if(i>=1) {
			i=1;
			t();}
	}
}
