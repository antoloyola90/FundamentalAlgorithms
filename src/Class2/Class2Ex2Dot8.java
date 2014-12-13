package Class2;

public class Class2Ex2Dot8 extends Tree{
	
	public static void main(String[] args) {
		
		Class2Ex2Dot8 root = new Class2Ex2Dot8();
		root.num = 2;
		
		root.setNumberOfChildren(3);
		root.setValueOfChildren(9,8,5);
		
		root.child[0].setNumberOfChildren(1);
		root.child[0].setValueOfChildren(7);
		
		root.child[2].setNumberOfChildren(2);
		root.child[2].setValueOfChildren(1,8);
		
		root.child[2].child[0].setNumberOfChildren(3);
		root.child[2].child[0].setValueOfChildren(3,7,5);
		
		root.preorderPrintWithNumberOfLeaves(root);
		root.postorderFindNumberOfLeaves(root);
		System.out.println();
		root.preorderPrintWithNumberOfLeaves(root);
	}
	
	public void preorderPrintWithNumberOfLeaves(Tree root){
		 if (root == null) 
			 return;
		 System.out.print( root.num + "(" + root.numberOfLeavesInSubtree + ")" + ", ");
		 for(int i =0; i<root.numberOfChildren; i++){
			try{ 
				preorderPrintWithNumberOfLeaves(root.child[i]);
		 	}catch(NullPointerException e){
			 
		 	}
		 }
	}
	
	public int postorderFindNumberOfLeaves(Tree root){
		
		if(root == null){
			//System.out.println("\nRoot is null! ");
			return 0;
		}	

		if(root.numberOfChildren == 0){
			//System.out.println("\nall are null!!");
			root.numberOfLeavesInSubtree = 1;
			return 1;
		}	
		else{
			
		try {
			for(int i =0; i<root.numberOfChildren; i++){	
				root.numberOfLeavesInSubtree += postorderFindNumberOfLeaves(root.child[i]);
			}
			
		}catch(NullPointerException e){
			
		 }	
		}
		return root.numberOfLeavesInSubtree;
	}

}

