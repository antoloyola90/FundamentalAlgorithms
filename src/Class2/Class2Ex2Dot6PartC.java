package Class2;

public class Class2Ex2Dot6PartC {
	
	String [] L;
	int size;
	
	public Class2Ex2Dot6PartC(){
		L = new String[100];
		this.size = 0;
	}
	
	public Class2Ex2Dot6PartC(String ... n){
		this();
		this.setValueOfChildren(n);
	}

	public void setValueOfChildren(String ... n){
		int i=0;
		
		for(i = n.length - 1; i >= 0 ; i--){
			push(n[i]);
		}
	}
	
	public void printStack (){
		System.out.println();
		for(int i = 0; i < this.size; i++){
			System.out.print(this.L[i] + "(" + i + ")" + ", ");
		}
	}
	
	public void push(String val){
		L[this.size] = val;
		this.size++;
	}
	
	public String pop (){
		if(this.size == 0){
			return " ";
		}
		String x = this.L[this.size-1];
		this.size --;
		return x;
	}
	
	public static String toReturn = "";
	public int stackVal(Class2Ex2Dot6PartC temp){
		System.out.print("\nL --- >");
		this.printStack();
		System.out.print("\ntemp --- >");
		temp.printStack();
		String x = this.pop();
		if(x == " "){
			toReturn = temp.pop();
		}
		else if(x != "+" && x != "-" && x != "*" && x != "/"){
			temp.push(x);
			this.stackVal(temp);
		}	
		else{
			temp.push(eval(x, temp.pop(), temp.pop()));
			this.stackVal(temp);
		}
		return Integer.parseInt(toReturn);
		
	}
	
	public String eval(String op, String a, String b){
		int x = 0;
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
		System.out.println("a = " + aInt + ", b = " + bInt + ", op = " + op);
		if(op == "+")
			x = aInt + bInt;
		else if(op == "-")
			x = aInt - bInt;
		else if(op == "*")
			x = aInt * bInt;
		else if(op == "/")
			x = aInt / bInt;
		System.out.println("x = " + x);
		return x + "";
	}
	
	public static void main(String[] args) {
		Class2Ex2Dot6PartC L = new Class2Ex2Dot6PartC("3", "4", "7", "9", "*", "-", "3", "6", "2", "-" , "+", "*", "+");
		L.printStack();
		Class2Ex2Dot6PartC temp = new Class2Ex2Dot6PartC();
		System.out.println("\n" + 	L.stackVal(temp));
		L.printStack();
	}
	
	
}
