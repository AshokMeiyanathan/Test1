/**
 * 
 */
package automation;

/**
 * @author AMeiyanathan
 *
 */
public class FibonacciOptimizedMethod{
	public static void main(String[] args){
		int n=9;
		System.out.println(fib(n));
	}

	static int fib(int n){
		int a=0,b=1,c;
		if(n==0) return a;

		for(int i=2;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
		}
/*		return c;*/
		return b;
	}
	
	
}