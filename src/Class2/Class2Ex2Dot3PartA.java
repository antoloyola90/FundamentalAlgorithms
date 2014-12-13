package Class2;

public class Class2Ex2Dot3PartA extends Tree {

	public static void main(String[] args) {
		
		Class2Ex2Dot3PartA root = new Class2Ex2Dot3PartA();
		root.num = 2;
		
		root.setNumberOfChildren(3);
		root.setValueOfChildren(9,8,5);
		
		root.child[0].setNumberOfChildren(1);
		root.child[0].setValueOfChildren(7);
		
		root.child[2].setNumberOfChildren(2);
		root.child[2].setValueOfChildren(1,8);
		
		root.child[2].child[0].setNumberOfChildren(3);
		root.child[2].child[0].setValueOfChildren(3,7,5);
		
		root.preorderPrintWithSmallestNumber(root);
		root.postorderEvalSmallestNumber(root);
		System.out.println();
		root.preorderPrintWithSmallestNumber(root);
	}
	
	public void preorderPrintWithSmallestNumber(Tree root){
		 if (root == null) 
			 return;
		 System.out.print( root.num + "(" + root.small + ")" + ", ");
		 for(int i =0; i<root.numberOfChildren; i++){
			try{
				preorderPrintWithSmallestNumber(root.child[i]);
		 	}catch(NullPointerException e){
			 
		 	}
		 }
	}
	
	public int postorderEvalSmallestNumber(Tree root){
		if(root == null)
			return 999;
		
		try {
			root.small = root.num;
			int numbers[] = new int[root.numberOfChildren];
			for(int i=0;i<root.numberOfChildren; i++){
				numbers[i] = postorderEvalSmallestNumber(root.child[i]);
			}
			for(int i=0;i<root.numberOfChildren; i++){
				if(root.small > numbers[i]){
					root.small = numbers[i];
				}
			}
		}catch(NullPointerException e){
			 
		 }	
		return root.small;
		
	}
}

