package Class2;

public class Tree {
	int num = 999;
	char op = ' ';
	int small;
	Tree whichIsSmallest;
	int numberOfChildren = 2;
	int depth = 0;
	int dis1 = 0;
	int dis2 = 0;
	int whichChildIsDis1In = 0;
	int numberOfLeavesInSubtree = 0;
	
	Tree [] child;
	
	public void setNumberOfChildren(int n){
		this.numberOfChildren = n;
		this.child = new Tree[n];
		for(int i =0;i<n;i++){
			this.child[i] = new Tree();
			this.child[i].numberOfChildren = 0;
			this.child[i].num = 0;
		}	
	}
	
	@SuppressWarnings("unchecked")
	public <E> void setValueOfChildren(E ... n){
		int i=0;
		for(E nums : n){
			if(nums.getClass().getName().toString().contains("Character")){
				this.child[i].op = (char) nums;
			}
			else {
				this.child[i].num = (int) nums;
			}
			i++;
		}
	}
	
	public int eval(char op, int a, int b){
		if(op == '+')
			return a + b;
		else if(op == '-')
			return a - b;
		else if(op == '*')
			return a * b;
		else if(op == '/')
			return a / b;
		return 0;
	}
}
