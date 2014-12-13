package Class5;

public class Class5Ex11Dot27 {
	
	static int [] R = {2, 4, 7, 1, 6};
	static int [] D = {3, 3, 4, 8, 3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findBestSplits(4));
	}
	
	public static int findBestSplits(int i){
		if(i == 0)
			return 0;
		int temp = 0;
		int where = 0;
		for(int k =0; k<i;k++){
			int temp1 = findBestSplits(k) + RightValue(0, k, i);
			if(temp1>temp){
				temp = temp1;
				where = k;
			}	
		}	
		
		System.out.println(temp + ", " + where);
		return temp;
	}
	
	public static int RightValue(int i, int j, int k){
		int sumDemocratic = 0;
		int sumRepublican = 0;
		
		if(returnIfSetOfBlocksItoJIsRepublicanOrDemocraticOrNeither(j+1, k) == -1)
			sumDemocratic += returnWeightBetweenIandJ(j+1, k);
		else if(returnIfSetOfBlocksItoJIsRepublicanOrDemocraticOrNeither(j+1, k) == 1)
			sumRepublican += returnWeightBetweenIandJ(j+1, k);
		
		if(returnIfSetOfBlocksItoJIsRepublicanOrDemocraticOrNeither(i, j) == -1)
			sumDemocratic += returnWeightBetweenIandJ(i, j);
		else if(returnIfSetOfBlocksItoJIsRepublicanOrDemocraticOrNeither(i, j) == 1)
			sumRepublican += returnWeightBetweenIandJ(i, j);
		
		return sumDemocratic - sumRepublican;
	}
	
	public static int returnWeightBetweenIandJ(int i, int j){
		return returnRepublicanWeightInBuildingsItoJ(i, j) + returnDemocraticWeightInBuildingsItoJ(i, j);
	}
	
	public static int returnIfSetOfBlocksItoJIsRepublicanOrDemocraticOrNeither(int i , int j){
		if(returnRepublicanWeightInBuildingsItoJ(i, j) > returnDemocraticWeightInBuildingsItoJ(i, j))
			return 1;
		else if(returnRepublicanWeightInBuildingsItoJ(i, j) == returnDemocraticWeightInBuildingsItoJ(i, j))
			return 0;
		return -1;
	}
	
	public static int returnRepublicanWeightInBuildingsItoJ(int i , int j){
		int cnt = 0;
		for(;i<=j; i++)
			cnt += R[i];
		return cnt;
	}
	
	public static int returnDemocraticWeightInBuildingsItoJ(int i , int j){
		int cnt = 0;
		for(;i<=j; i++)
			cnt += D[i];
		return cnt;
	}

}
