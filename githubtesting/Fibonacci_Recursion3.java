/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class Fibonacci_Recursion3 {
	
	static int fib(int n) 
	{
		System.out.println("Before");
    if (n <= 1) 
       return n;
    
    return 
    		fib(n-1) 
    		+ 
    		fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 3; 
    System.out.println(fib(n)); 
    } 

}
