/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class FibonacciUseDynamicProgramming {

	public static void main(String[] args){
		int a=2;
		System.out.println(fib(a));
	}
	public static int fib(int b){
		int[] n=new int[b+2];n[0]=0;n[1]=1;	int i;
		for(i=2;i<=b;i++) 
			n[i]=
			n[i-1]+
			n[i-2];
		return n[b];

	}
	
	/*static int fib(int n) 
    { 
     Declare an array to store Fibonacci numbers. 
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
     0th and 1st number of the series are 0 and 1
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
        Add the previous 2 numbers in the series 
         and store it 
        f[i] = f[i-1] + f[i-2]; 
    } 
       
    return f[n]; 
    } 
       
    public static void main (String args[]) 
    { 
        int n = 9; 
        System.out.println(fib(n)); 
    } 
*/
}
