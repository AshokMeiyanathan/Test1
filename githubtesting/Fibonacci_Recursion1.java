/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class Fibonacci_Recursion1 {

	static void fib(int n) 
    { 
		System.out.println("Before");
    if (n <= 1) 
       return; 
    		System.out.println("Before recursion");
    		fib(n-1);
    		System.out.println("After");
/*    		return;*/
    } 
       
    public static void main (String args[]) 
    { 
    int n = 2; 
    fib(n);
    /*System.out.println();*/ 
    } 

}
