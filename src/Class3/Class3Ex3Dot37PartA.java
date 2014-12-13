package Class3;

public class Class3Ex3Dot37PartA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("U(99) = " + getU(65));
		System.out.println("Z(99) = " + getZ(65));
	}
	
	public static double getU(double n){
		if(n > 65.0)
			return n + getU(9 * n / 10);
		return 15 * n;
	}
	
	public static double getZ(double n){
		if(n > 65.0){
			return n + getZ(Math.ceil(9 * n / 10));
		}
		return 15 * n;
	}
}
