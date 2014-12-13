package Class2;

public class Class2Ex2Dot30 extends Tree{
	
	public static void main(String[] args) {
		
		Class2Ex2Dot30 root = new Class2Ex2Dot30();
		root.num = 2;
		
		root.setNumberOfChildren(4);
		root.setValueOfChildren(3, 9,8,5);
		
		root.child[1].setNumberOfChildren(2);
		root.child[1].setValueOfChildren(1, 7);
		
		root.child[3].setNumberOfChildren(3);
		root.child[3].setValueOfChildren(2, 1,8);
		
		root.child[3].child[1].setNumberOfChildren(4);
		root.child[3].child[1].setValueOfChildren(3, 3,7,5);
		
		root.postorder(root, 5);
	}
	
	public void postorder(Tree root, int k){
		 if (root == null) 
			 return;
		
		 try{ 
			 for(int i = 1; i<=root.child[0].num; i++){
				 if(root.child[i].num == k || k == -1)
					 postorder(root.child[i], -1);
			 }
		}catch(NullPointerException e){
				
		 	}
		 if(k == -1)
			 System.out.print( root.num + ", "); 
	}
	

}

