package Class2;

public class Class2Ex2Dot11 extends Tree{
	
	public static void main(String[] args) {
		
		Class2Ex2Dot11 root = new Class2Ex2Dot11();
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
		root.postorderDepthSecond(root);
		System.out.println();
		root.preorderPrintWith2Depths(root);
	}
	
	public void preorderPrintWith2Depths(Tree root){
		 if (root == null) 
			 return;
		 System.out.print( root.num + "(" + root.dis1 + ")" + ", ");
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
				}
			}
		}catch(NullPointerException e){
			
		 }	
	}
	
	public void postorderDepthSecond(Tree root){
		
		if(root == null){
			return;
		}
		try {
			for(int i =0; i<root.numberOfChildren; i++){
				
				//System.out.println("i = " + i + ", dis1 = " + root.dis1 + ", num = " + root.num);
				
				for(int j =0 ; j<root.numberOfChildren ; j++){
					root.child[j].dis1 = -1;
					//System.out.println("\tBefore j = " + j + ", dis1 = " + root.child[j].dis1 + ", num = " + root.child[j].num);
					
					for(int k =0 ; k<root.numberOfChildren; k++){
						//System.out.println("\t\tBefore k = " + k + ", dis1 = " + root.child[k].dis1 + ", num = " + root.child[k].num);
						if(root.child[k].dis1 > root.child[j].dis1 && j!=k)
								root.child[j].dis1 = root.child[k].dis1;
						//System.out.println("\t\tAfter j = " + j + ", dis1 = " + root.child[j].dis1 + ", num = " + root.child[j].num);
					}
					root.child[j].dis1 = root.child[j].dis1 + root.dis1 - 1;
					//System.out.println("\tAfter j = " + j + ", dis1 = " + root.child[j].dis1 + ", num = " + root.child[j].num);
					
				}
				postorderDepthSecond(root.child[i]);
				//System.out.println("i = "+ i + " , x = " + x);
				
			}
		}catch(NullPointerException e){
			
		 }	
	}

}

