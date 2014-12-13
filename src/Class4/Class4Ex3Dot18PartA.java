/* THIS GIVES TWO VALUES (Within patient runtime) --> 512 and 4194816*/

package Class4;

public class Class4Ex3Dot18PartA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n = 2; ; n++ ){
			double a = firstExpression(n) + 2*calc(n/2);
			double b = 4 * n * n;
			if(a == b){
				System.out.println("n = " + n + ", a = " + a + ", b = " + b);
			}
		}	
	}
	
	public static double calc(int n){
		if(n == 1)
			return 1;
		return Math.min(firstExpression(n) + 2*calc(n/2), secondExpression(n));			
	}
	
	public static double firstExpression(int n){
		return 1024*n; 
	}
	
	public static double secondExpression(int n){
		return 4*n*n; 
	}
	
}
