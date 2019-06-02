/**
 * 
 */
package automation.fibonacci;

/**
 * @author AMeiyanathan
 *
 */
public class FibonacciSeriesUsingRecursion {
	static int n=0,n1=1,n2,count=10;
	public static void main(String[] args){
		/*System.out.println(4%10);*/
		System.out.println(4/10);
		System.out.print(n+" "+n1);
		fib(count-2);		
	}
	static void fib(int count){
		if(count>0){   
			n2=n+n1;
			n=n1;
			n1=n2;
			System.out.print(" "+n2);
			fib(count-1);
		}
		
	}

}
