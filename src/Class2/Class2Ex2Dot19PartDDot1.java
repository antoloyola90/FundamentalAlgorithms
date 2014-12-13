package Class2;

public class Class2Ex2Dot19PartDDot1 extends Tree {

	public static void main(String[] args) {
		
		Class2Ex2Dot19PartDDot1 root = new Class2Ex2Dot19PartDDot1();
		root.op = 'A';
		
		root.setNumberOfChildren(4);
		root.setValueOfChildren('B', 'C', 'D', 'E');
		
		(root.child[0]).setNumberOfChildren(2);
		(root.child[0]).setValueOfChildren('F', 'G');
		
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
