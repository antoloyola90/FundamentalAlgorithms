package Class2;

public class Class2Ex2Dot19PartCDot1 extends Tree {

	public static void main(String[] args) {
		
		Class2Ex2Dot19PartCDot1 root = new Class2Ex2Dot19PartCDot1();
		root.op = 'A';
		
		root.setNumberOfChildren(4);
		root.setValueOfChildren('B', 'C', 'D', 'E');
		
		(root.child[0]).setNumberOfChildren(2);
		(root.child[0]).setValueOfChildren('F', 'G');
		
		root.preorder(root, null);
		//Reading from Left to right ---> -410
		//Left to right produces ---> -56
	}
	
	public void preorder(Tree r, Tree parent){
		 if (r == null) 
			 return;
		 String y = "null";
		 if(parent != null)
			 y = parent.op+"";
		 System.out.println(r.op + "(parent : " + y + "), ");
		 for(int i =0; i < r.numberOfChildren; i++){
			 try {
				 preorder(r.child[i], r);
			 }catch(NullPointerException e){
				 
			 }
		 }
	}
	

}
