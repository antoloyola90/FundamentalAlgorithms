package Class2;

public class Class2Ex2Dot3PartB extends Tree {

	public static void main(String[] args) {
		
		Class2Ex2Dot3PartB root = new Class2Ex2Dot3PartB();
		root.num = 2;
		
		root.setNumberOfChildren(3);
		root.setValueOfChildren(9,8,5);
		
		root.child[0].setNumberOfChildren(1);
		root.child[0].setValueOfChildren(7);
		
		root.child[2].setNumberOfChildren(2);
		root.child[2].setValueOfChildren(1,8);
		
		root.child[2].child[0].setNumberOfChildren(3);
		root.child[2].child[0].setValueOfChildren(3,7,5);
		
		root.preorderPrintWithSmallestNumberWithWhichNode(root);
		root.postorderEvalSmallestNumberAndWhichNode(root);
		System.out.println("");
		root.preorderPrintWithSmallestNumberWithWhichNode(root);
	}
	
	public void preorderPrintWithSmallestNumberWithWhichNode(Tree root){
		 if (root == null) 
			 return;
		 try{
			 System.out.println( root.num + "(" + root.small + ", Node to which its pointing has Value : " + root.whichIsSmallest.num + ")" + ", ");
			 for(int i =0; i<root.numberOfChildren; i++){
				preorderPrintWithSmallestNumberWithWhichNode(root.child[i]);
			 }
		 }catch(NullPointerException e){
			 System.out.println("caught a null!!");
		 }
	}
	
	public int postorderEvalSmallestNumberAndWhichNode(Tree root){
		if(root == null)
			return 999;
		
		for(int i=0;i<root.numberOfChildren; i++){
			try {
				postorderEvalSmallestNumberAndWhichNode(root.child[i]);
				if(root.small > root.child[i].num){
					root.small = root.child[i].num;
					root.whichIsSmallest = root.child[i];
				}
				
			}catch(NullPointerException e){
			 
		 }
		
	}
		return root.small;
			
	}
	
}

