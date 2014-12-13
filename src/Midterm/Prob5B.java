package Midterm;

public class Prob5B {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		Tree root = new Tree ('A');
		root.left = new Tree ('X');
		root.right = new Tree ('L');
		
		root.left.left = new Tree ('U');
		
		root.right.left = new Tree ('Z');
		root.right.left.left = new Tree ('W');
		root.right.left.right = new Tree ('P');
		
		root.right.right = new Tree ('Q');
		
		root.printVal(root);
		
		root.predecessor(root);
		
		//root.printPredecessor(root);
	}

}

class Tree {
	char val;
	Tree left;
	Tree right;
	Tree predecessor;
	
	public Tree(char c){
		this.val = c;
		this.left = null;
		this.right = null;
		this.predecessor = null;
	}
	
	public void predecessor(Tree root) throws NullPointerException{
		if(root.left != null)
			predecessor(root.left);
		root.predecessor = new Tree(root.left.val);
		if(root.right != null)
			predecessor(root.right);
	}
	
	public void printPredecessor(Tree root) throws NullPointerException{
		if(root.left != null)
			printPredecessor(root.left);
		System.out.print(root.predecessor.val + ", ");
		if(root.right != null)
			printPredecessor(root.right);
	}
	
	public void printVal(Tree root) throws NullPointerException{
		if(root.left != null)
			printVal(root.left);
		System.out.print(root.val  + ", ");
		if(root.right != null)
			printVal(root.right);
	}
}
