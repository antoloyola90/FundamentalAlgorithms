package Class3;

public class Class3Ex2Dot24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numToFindFact = 10;
		fact(numToFindFact + 1);
	}
	
	public static int fact(int n){
		if(n == 1)
			return 1;
		int x = fact(n-1);
		System.out.println(n-1 + "! = " + x);
		return n * x;
	}

}
