package Class2;

public class Class2Ex2Dot2 extends Tree {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Class2Ex2Dot2 root = new Class2Ex2Dot2();
		root.op = '+';
		
		root.setNumberOfChildren(2);
		root.setValueOfChildren(3, '*');
		
		(root.child[1]).setNumberOfChildren(2);
		(root.child[1]).setValueOfChildren('-', '+');
		
		(root.child[1].child[0]).setNumberOfChildren(2);
		(root.child[1].child[0]).setValueOfChildren(4, '*');
		
		(root.child[1].child[0].child[1]).setNumberOfChildren(2);
		(root.child[1].child[0].child[1]).setValueOfChildren(7, 9);
		
		(root.child[1].child[1]).setNumberOfChildren(2);
		(root.child[1].child[1]).setValueOfChildren(3, '-');
		
		(root.child[1].child[1].child[1]).setNumberOfChildren(2);
		(root.child[1].child[1].child[1]).setValueOfChildren(6, 2);
		
		root.preorder(root);
		//Reading from Left to right ---> -410
		System.out.println(root.postorderEval(root));
		//Left to right produces ---> -56
	}
	
	public void preorder(Tree r){
		 if (r == null) 
			 return;
		 System.out.print(r.num==999?r.op + ", ":r.num + ", ");
		 for(int i =0; i < r.numberOfChildren; i++){
			 try {
				 preorder(r.child[i]);
			 }catch(NullPointerException e){
				 
			 }
		 }
	}
	
	public int postorderEval(Tree root){
		if(root == null)
			return -1;
		try{
			int x = postorderEval(root.child[0]);
			int y = postorderEval(root.child[1]);
			if(root.op != ' ')
				return eval (root.op, x, y);
		}catch(NullPointerException e){
		}
		return root.num;
	}
}
