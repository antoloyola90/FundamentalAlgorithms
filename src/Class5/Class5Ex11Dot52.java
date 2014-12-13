package Class5;

public class Class5Ex11Dot52 {
	
	static int [][] lookup;
	static int [][] whereTo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ab";
		String b = "aaabbbb";
		
		lookup = new int[a.length()][b.length()];
		whereTo = new int[a.length()][b.length()];
		
		for(int i=0;i<a.length();i++){
			for(int j=0;j<b.length();j++){
				lookup[i][j] = -1;
				whereTo[i][j]=  -1;
			}
		}	
		
		System.out.println(lengthGCSwithLookUpAndDecisionTable(a, b));
		
		createMaxCount(a, b);
		
		System.out.println(whereTo[a.length()-1][b.length()-1]);
	}
	
	public static int lengthGCSwithLookUpAndDecisionTable(String a, String b){
		if(a.length() == 0 || b.length() == 0)
			return 0;
		else if (lookup[a.length()-1][b.length()-1] != -1)
			return lookup[a.length()-1][b.length()-1];
		else if (a.charAt(a.length() - 1) == b.charAt(b.length() - 1)){
			lookup[a.length()-1][b.length()-1] = 1 + lengthGCSwithLookUpAndDecisionTable(a.substring(0, a.length()-1), b.substring(0,b.length()-1));
		}
		else{
			int t1 = lengthGCSwithLookUpAndDecisionTable(a.substring(0, a.length()-1), b.substring(0,b.length()));
			int t2 = lengthGCSwithLookUpAndDecisionTable(a.substring(0, a.length()), b.substring(0,b.length()-1));
			if(t1 > t2){
				lookup[a.length()-1][b.length()-1] = t1;
			}
			else {
				lookup[a.length()-1][b.length()-1] = t2;
			}
				
		}
		return lookup[a.length()-1][b.length()-1];
	}
	
	public static void createMaxCount(String a, String b ){
		int n = a.length();
		int m = b.length();
		
		for(int i = 0; i<n;i++){
			for(int j=0; j<m;j++){
				if(i ==0 || j==0)
					whereTo[i][j] = 1;
				else{
					whereTo[i][j] = 0;
					if(a.charAt(i) == b.charAt(j))
						whereTo[i][j] = whereTo[i-1][j-1];
					else if(lookup[i-1][j] == lookup[i][j])
						whereTo[i][j] = whereTo[i][j] + whereTo[i-1][j];
					
					if(lookup[i][j-1] == lookup[i][j])
						whereTo[i][j] = whereTo[i][j] + whereTo[i][j-1];
					if(lookup[i-1][j-1] == lookup[i][j])
						whereTo[i][j] = whereTo[i][j] - whereTo[i-1][j-1];
				}
			}
		}
	}
	
	
}
