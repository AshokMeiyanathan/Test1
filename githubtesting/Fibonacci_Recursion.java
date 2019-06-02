/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class Fibonacci_Recursion {
	static int m=0;
	static int fib(int n) 
	{
		System.out.println("Before : "+n);
    if (n <= 1) 
       return n;
    
    return 
    		fib(n-1) asdf
    		/*m++*/
    		+ 
    		fib(n-2)
    		/*n*/; 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n)); 
    /*System.out.println(n);*/
    } 

}

/*0+1=1
1+1=2
1+2=3
2+3=5
3+5=8
5+8=13
*/