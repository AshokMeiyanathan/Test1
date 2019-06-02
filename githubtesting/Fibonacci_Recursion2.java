/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class Fibonacci_Recursion2 {
	
	static void fib(int n) 
	{ 
    if (n <= 1) 
       return;
    System.out.println("Before");
    		if(n==4)
    		fib(n-1);else if(n==3) fib(n-1);
    } 
       
    public static void main (String args[]) 
    { 
    int n = 4; 
    fib(n);
    /*System.out.println(fib(n));*/ 
    } 

}
