package Class5;

public class Class5SheetEx3PartA {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aabbb";
		String b = "aaabbbb"; 
		System.out.println(lengthGCS(a, b));
		
	}
	
	public static int lengthGCS(String a, String b){
		if(a.length() == 0 || b.length() == 0)
			return 0;
		else if (a.charAt(a.length() - 1) == b.charAt(b.length() - 1))
			return 1 + lengthGCS(a.substring(0, a.length()-1), b.substring(0,b.length()-1));
		return Math.max(
				lengthGCS(a.substring(0, a.length()-1), b.substring(0,b.length())), 
				lengthGCS(a.substring(0, a.length()), b.substring(0,b.length()-1)) );
	}
	
}
