/**
 * 
 */
package automation.fibonacci;

/**
 * @author AMeiyanathan
 *
 */
public class FibonacciSeriesWithoutUsingRecursion {
	public static void main(String[] args){
		int n1=0,n2=1,n,i,count=10;
		System.out.print(n1+" "+n2);
		for(i=2;i<10;i++){
			n=n1+n2;
			
			n1=n2;
			n2=n;
			System.out.print(" "+n2);
		}
	}
}
