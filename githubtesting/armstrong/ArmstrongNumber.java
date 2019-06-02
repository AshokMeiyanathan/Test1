/**
 * 
 */
package automation.armstrong;

/**
 * @author AMeiyanathan
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args){
		System.out.println("A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, \n"
				+ "370, 371, 407 etc.\n\n"
				+ "    153 = (1*1*1)+(5*5*5)+(3*3*3)\n"
				+ "where:\n"
				+ "(1*1*1)=1\n"
				+ "(5*5*5)=125\n"
				+ "(3*3*3)=27 \n"
				+ "So:\n"
				+ "1+125+27=153  \n\n"
				+ "");
		int n=153,temp,r,c=0;
		temp=n;
		while(n>0){
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
		}
		if(temp==c) System.out.println("ArmstrongNumber");
		else System.out.println("It is not ArmstrongNumber");
	}
}
