package Class2;

public class Class2Ex2Dot19PartDDot2 extends Tree {

	public static void main(String[] args) {
		
		Class2Ex2Dot19PartDDot2 root = new Class2Ex2Dot19PartDDot2();
		root.op = 'A';
		
		root.setNumberOfChildren(1);
		root.setValueOfChildren('B');
		
		(root.child[0]).setNumberOfChildren(2);
		(root.child[0]).setValueOfChildren('F', 'C');
		
		(root.child[0].child[0]).setNumberOfChildren(1);
		(root.child[0].child[0]).setValueOfChildren('G');
		
		(root.child[0].child[1]).setNumberOfChildren(1);
		(root.child[0].child[1]).setValueOfChildren('D');
		
		(root.child[0].child[1].child[0]).setNumberOfChildren(1);
		(root.child[0].child[1].child[0]).setValueOfChildren('E');
		
		root.postorder(root, null);
		//Reading from Left to right ---> -410
		//Left to right produces ---> -56
	}
	
	public void postorder(Tree r, Tree parent){
		 if (r == null) 
			 return;
		
		 for(int i =0; i < r.numberOfChildren; i++){
			 try {
				 postorder(r.child[i], r);
			 }catch(NullPointerException e){
				 
			 }
		 }
		 String y = "null";
		 if(parent != null)
			 y = parent.op+"";
		 System.out.println(r.op + "(parent : " + y + "), ");
	}
	

}
