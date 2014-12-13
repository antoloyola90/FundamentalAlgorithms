package Class7;

public class Ex5Dot34 { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {9,10,11,12,13,14,2,3,4,5,6}; 
		int [] B = {9,10,11,12,13,14,15,16,17,18,19,1,2,3}; 
		int [] C = {13,14,1,2,3,4,5,6,7,8,9,10,11,12}; 
		int [] D = {14,0,1,2,3,4,5,6,7,8,9,10,11,12}; 
		int [] E = {1,2,3,4,5,6,7,8,9,10,11,12};
		int [] F = {12,0,1,2,3,4,5,6,7,8,9,10,11,12}; 
		
		System.out.println("=" + getIPosition(0, A.length-1, A) );
		System.out.println("=" + getIPosition(0, B.length-1, B) );
		System.out.println("=" + getIPosition(0, C.length-1, C) );
		System.out.println("=" + getIPosition(0, D.length-1, D) );
		System.out.println("=" + getIPosition(0, E.length-1, E) );
		System.out.println("=" + getIPosition(0, F.length-1, F) );
	}
	
	public static int getIPosition(int l, int u, int [] Arr){
		int mid = -1;
		//System.out.println(l+", "+u);
		try{
		if(l<u){
			mid = (l+u)/2;
			if(Arr[mid] > Arr[mid - 1] && Arr[mid] > Arr[mid+1]){
				return mid;
			}
			else if(Arr[mid]<Arr[u] && Arr[mid]<Arr[l]){
				return getIPosition(l, mid, Arr);
			}
			else{
				return getIPosition(mid+1, u, Arr);
			}
		}	
		else if(l==u && u == Arr.length-1){
			mid = Arr.length - 1;
			if(Arr[mid] > Arr[mid-1])
				return mid;
		}	
		else{
			mid = 0;
			if(Arr[mid] > Arr[mid+1])
				return mid;
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			if(Arr[mid]!=Arr[Arr.length-1])
				return mid;
		}
		return -1;
		
	}

}
