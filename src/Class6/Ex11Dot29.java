package Class6;

public class Ex11Dot29 {
	
	static int [][] lookup;
	static int [][][] whereTo;
	
	static Values [] vals = {new Values('A', 20), new Values('X', 20)};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "AMLAOPBOPHOPNTOPX";
		String b = "APOPNTOPNVALMX";
		
		lookup = new int[a.length()][b.length()];
		whereTo = new int[a.length()][b.length()][2];
		
		for(int i=0;i<a.length();i++){
			for(int j=0;j<b.length();j++){
				lookup[i][j] = -1;
				whereTo[i][j][0] = -1;
				whereTo[i][j][1] = -1;
			}
		}	
		
		System.out.println(lengthGCSwithLookUpAndDecisionTable(a, b));
		
		dfsPrint(a, b);
	}
	
	public static int lengthGCSwithLookUpAndDecisionTable(String a, String b){
		if(a.length() == 0 || b.length() == 0)
			return 0;
		else if (lookup[a.length()-1][b.length()-1] != -1)
			return lookup[a.length()-1][b.length()-1];
		else if (a.charAt(a.length() - 1) == b.charAt(b.length() - 1)){
			whereTo[a.length()-1][b.length()-1][0] = a.length() - 1;
			whereTo[a.length()-1][b.length()-1][1] = b.length() - 1;
			lookup[a.length()-1][b.length()-1] = Values.returnVal(vals, a.charAt(a.length() - 1)) + lengthGCSwithLookUpAndDecisionTable(a.substring(0, a.length()-1), b.substring(0,b.length()-1));
		}
		else{
			int t1 = lengthGCSwithLookUpAndDecisionTable(a.substring(0, a.length()-1), b.substring(0,b.length()));
			int t2 = lengthGCSwithLookUpAndDecisionTable(a.substring(0, a.length()), b.substring(0,b.length()-1));
			if(t1 > t2){
				whereTo[a.length()-1][b.length()-1][0] = a.length() - 1;
				whereTo[a.length()-1][b.length()-1][1] = b.length();
				lookup[a.length()-1][b.length()-1] = t1;
			}
			else {
				whereTo[a.length()-1][b.length()-1][0] = a.length();
				whereTo[a.length()-1][b.length()-1][1] = b.length() - 1;
				lookup[a.length()-1][b.length()-1] = t2;
			}
				
		}
		return lookup[a.length()-1][b.length()-1];
	}
	
	public static void printDecisions(String a, String b){
		if(a.length() == 0 || b.length() == 0)
			System.out.println("No Subsequence!!");
		dfsPrint(a, b);
	}
		
	public static void dfsPrint(String a, String b){
		if(a.length() != 0 && b.length() != 0){
			int i = whereTo[a.length()-1][b.length()-1][0];
			int j = whereTo[a.length()-1][b.length()-1][1];
			
			dfsPrint(a.substring(0, i), b.substring(0, j));
			
			if(i == a.length()-1 && j == b.length()-1)
				System.out.print(a.charAt(i));
		}
			
	}
	
}

class Values {
	char letter;
	int val;
	
	public Values(char l, int x){
		this.letter = l;
		this.val = x;
	}
	
	public static int returnVal(Values [] v, char l){
		int temp = 1;
		
		for(int i =0; i<v.length;i++){
			if( v[i].letter == l){
				temp = v[i].val;
				break;
			}
		}
		
		return temp;
	}
}
