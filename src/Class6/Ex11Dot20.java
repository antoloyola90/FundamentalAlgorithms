package Class6;

public class Ex11Dot20 {
	
	static int [] d = {20, 100, 10, 20, 100, 5}; 
	public static void main (String [] args){
		
		System.out.println(returnWorkItoJ(0, 1));
		System.out.println(returnWorkItoJ(1, 2));
		System.out.println(returnWorkItoJ(2, 3));
		System.out.println(returnWorkItoJ(3, 4));
		
		System.out.println(returnWorkItoJ(0, 2));
		System.out.println(returnWorkItoJ(1, 3));
		System.out.println(returnWorkItoJ(2, 4));
		
		System.out.println(returnWorkItoJ(0, 3));
		System.out.println(returnWorkItoJ(1, 4));
		
		System.out.println(returnWorkItoJ(0, 4));
	}
	
	public static int returnWorkItoJ(int i, int j){
		if(i==j)
			return 0;
		int temp = Integer.MAX_VALUE;
		for(int k = i; k < j; k++){
			temp = Math.min(temp, returnWorkItoJ(i, k) + d[i]*d[k+1]*d[j+1] + returnWorkItoJ(k+1, j));
		}
		return temp;
	}
}
