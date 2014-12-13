package Class5;

public class Class5SheetEx3PartB {
	
	static int [][] lookup;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aabbb";
		String b = "aaabbbb";
		
		lookup = new int[a.length()][b.length()];
		
		for(int i=0;i<a.length();i++)
			for(int j=0;j<b.length();j++)
				lookup[i][j] = -1;
		
		System.out.println(lengthGCSWithLookup(a, b));
		
	}
	
	public static int lengthGCSWithLookup(String a, String b){
		if(a.length() == 0 || b.length() == 0)
			return 0;
		else if (lookup[a.length()-1][b.length()-1] != -1)
			return lookup[a.length()-1][b.length()-1];
		else if (a.charAt(a.length() - 1) == b.charAt(b.length() - 1))
			lookup[a.length()-1][b.length()-1] = 1 + lengthGCSWithLookup(a.substring(0, a.length()-1), b.substring(0,b.length()-1));
		else
			lookup[a.length()-1][b.length()-1] = Math.max(
					lengthGCSWithLookup(a.substring(0, a.length()-1), b.substring(0,b.length())), 
					lengthGCSWithLookup(a.substring(0, a.length()), b.substring(0,b.length()-1)) );
		
		return lookup[a.length()-1][b.length()-1];
	}
	
}
