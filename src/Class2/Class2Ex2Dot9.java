package Class2;

public class Class2Ex2Dot9 extends Tree{
	
	public static void main(String[] args) {
		
		Class2Ex2Dot9 root = new Class2Ex2Dot9();
		root.num = 2;
		
		root.setNumberOfChildren(3);
		root.setValueOfChildren(9,8,5);
		
		root.child[0].setNumberOfChildren(1);
		root.child[0].setValueOfChildren(7);
		
		root.child[2].setNumberOfChildren(2);
		root.child[2].setValueOfChildren(1,8);
		
		root.child[2].child[0].setNumberOfChildren(3);
		root.child[2].child[0].setValueOfChildren(3,7,5);
		
		root.preorderPrintWithDepth(root);
		root.postorderDepth(root);
		System.out.println();
		root.preorderPrintWithDepth(root);
	}
	
	public void preorderPrintWithDepth(Tree root){
		 if (root == null) 
			 return;
		 System.out.print( root.num + "(" + root.depth + ")" + ", ");
		 for(int i =0; i<root.numberOfChildren; i++){
			try{ 
				preorderPrintWithDepth(root.child[i]);
		 	}catch(NullPointerException e){
			 
		 	}
		 }
	}
	
	public void postorderDepth(Tree root){
		
		if(root == null){
			return;
		}	
	
		
			
		try {
			for(int i =0; i<root.numberOfChildren; i++){
				postorderDepth(root.child[i]);
				if(root.child[i].depth + 1 > root.depth){
					root.depth = root.child[i].depth + 1;
				}
			}
			
		}catch(NullPointerException e){
			
		 }	
		
		
	}

}

