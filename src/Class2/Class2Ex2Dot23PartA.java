package Class2;

public class Class2Ex2Dot23PartA {
	
	int [] data = {10, 7, 3, 2, 6, 8, 9, 1, 4, 5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class2Ex2Dot23PartA nums = new Class2Ex2Dot23PartA();
		
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
		
		int wheresBig = 0;
		for(int i=0; i<=n; i++){
			if(this.data[i] > this.data[wheresBig]){
				wheresBig = i;
			}
		}
		int temp = this.data[n];
		this.data[n] = this.data[wheresBig];
		this.data[wheresBig] = temp;
		
		if(n == 2)
			return;
		
		selectionSort(n-1);
	}
}
