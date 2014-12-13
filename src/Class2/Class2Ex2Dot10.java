package Class2;

public class Class2Ex2Dot10 extends Tree{
	
	public static void main(String[] args) {
		
		Class2Ex2Dot10 root = new Class2Ex2Dot10();
		root.num = 2;
		
		root.setNumberOfChildren(3);
		root.setValueOfChildren(9,8,5);
		
		root.child[0].setNumberOfChildren(1);
		root.child[0].setValueOfChildren(7);
		
		root.child[2].setNumberOfChildren(2);
		root.child[2].setValueOfChildren(1,8);
		
		root.child[2].child[0].setNumberOfChildren(3);
		root.child[2].child[0].setValueOfChildren(3,7,5);
		
		root.preorderPrintWith2Depths(root);
		root.postorder2Depths(root);
		System.out.println();
		root.preorderPrintWith2Depths(root);
	}
	
	public void preorderPrintWith2Depths(Tree root){
		 if (root == null) 
			 return;
		 System.out.print( root.num + "(" + root.dis1 + ", "+ root.dis2 + ")" + ", ");
		 for(int i =0; i<root.numberOfChildren; i++){
			try{ 
				preorderPrintWith2Depths(root.child[i]);
		 	}catch(NullPointerException e){
			 
		 	}
		 }
	}
	
	public void postorder2Depths(Tree root){
		
		if(root == null){
			return;
		}
		try {
			for(int i =0; i<root.numberOfChildren; i++){
				postorder2Depths(root.child[i]);
				if(root.child[i].dis1 + 1 > root.dis1){
					root.dis1 = root.child[i].dis1 + 1;
					root.whichChildIsDis1In = i;
				}
				if(root.child[i].dis2 + 1 > root.dis2 && root.whichChildIsDis1In != i){
					root.dis2 = root.child[i].dis2 + 1;
				}
				
			}
			if(root.numberOfChildren == 1)
				root.dis2 = -999;
			
		}catch(NullPointerException e){
			
		 }	
		
		
	}

}

