package Class2;

public class Class2Ex2Dot4 extends Tree{

	public static void main(String[] args) {
		
		Class2Ex2Dot4 root = new Class2Ex2Dot4();
		root.num = 2;
		
		root.setNumberOfChildren(3);
		root.setValueOfChildren(7,0,1);
		
		root.child[0].setNumberOfChildren(1);
		root.child[0].setValueOfChildren(4);
		
		root.child[2].setNumberOfChildren(2);
		root.child[2].setValueOfChildren(8,6);
		
		root.child[2].child[0].setNumberOfChildren(2);
		root.child[2].child[0].setValueOfChildren(5,3);
		
		Class2Ex2Dot4.singleX = 9;
		root.postorder(root);
		System.out.println("\t" + "X = " + Class2Ex2Dot4.singleX);
		root.postorderRotate(root);
		root.postorder(root);
		System.out.println("\t" + "X = " + Class2Ex2Dot4.singleX);
	}
	
	public void postorder(Tree r){
		 if (r == null) 
			 return;
		 for(int i =0; i < r.numberOfChildren; i++){
			 try {
				 postorder(r.child[i]);
			 }catch(NullPointerException e){
				 
			 }
		 }
		 System.out.print(r.num==999?r.op + ", ":r.num + ", ");
	}
	
	static int singleX;
	public void postorderRotate(Tree root){
		if (root == null)
			return;
		try{
			for(int i=0; i<root.numberOfChildren; i++){
				postorderRotate(root.child[i]);
			}
		}catch(NullPointerException e){
		}
		
		int temp = singleX;
		singleX = root.num;
		root.num = temp;
	}
	
}

