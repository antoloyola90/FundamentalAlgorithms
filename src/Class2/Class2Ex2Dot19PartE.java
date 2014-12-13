package Class2;

public class Class2Ex2Dot19PartE extends Tree {

	public static void main(String[] args) {
		
		Class2Ex2Dot19PartE root = new Class2Ex2Dot19PartE();
		root.op = 'A';
		
		root.setNumberOfChildren(4);
		root.setValueOfChildren('B', 'C', 'D', 'E');
		
		(root.child[0]).setNumberOfChildren(2);
		(root.child[0]).setValueOfChildren('F', 'G');
		
		root.postorder(root);
		//Reading from Left to right ---> -410
		//Left to right produces ---> -56
	}
	
	public void postorder(Tree r){
		 if (r == null) 
			 return;
		
		 for(int i =0; i < r.numberOfChildren; i++){
			 try {
				 postorder(r.child[i]);
				 System.out.println(r.child[i].op + "(parent : " + r.op + "), ");
			 }catch(NullPointerException e){
				 
			 }
		 }
		 
	}
	

}
