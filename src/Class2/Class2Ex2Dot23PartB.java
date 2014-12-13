package Class2;

public class Class2Ex2Dot23PartB {
	
	int [] data = {10, 7, 3, 2, 6, 8, 9, 1, 4, 5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class2Ex2Dot23PartB nums = new Class2Ex2Dot23PartB();
		
		nums.print();
		nums.selectionSort(nums.data.length - 1);
		nums.print();
	}
	
	public void print(){
		for(int i=0;i<this.data.length;i++)
			System.out.print(this.data[i] + ", ");
		System.out.println();
	}
	
	public void selectionSort(int n){
		if(n == this.data.length - 1)
			return;
		int wheresBig = 0;
		for(int i=0; i<=n; i++){
			if(this.data[i] > this.data[wheresBig]){
				wheresBig = i;
			}
		}
		int temp = this.data[n];
		this.data[n] = this.data[wheresBig];
		this.data[wheresBig] = temp;
		
		if(n == 1){
			temp = this.data[n];
			this.data[n] = this.data[wheresBig];
			this.data[wheresBig] = temp;
			selectionSort(n+1);
		}
		
		selectionSort(n-1);
		
		
	}
}
