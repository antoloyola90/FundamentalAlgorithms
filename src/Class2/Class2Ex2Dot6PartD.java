package Class2;

public class Class2Ex2Dot6PartD extends DoublyLinkedList{
	
	public Class2Ex2Dot6PartD(){
		this.next = null;
		this.prev = null;
	}
	
	public Class2Ex2Dot6PartD(String val){
		this();
		this.val = val;
	}
	
	public static void main(String[] args) {
		Class2Ex2Dot6PartD list = new Class2Ex2Dot6PartD("3");
		list.insertNode("4");
		list.insertNode("7");
		list.insertNode("9");
		list.insertNode("*");
		list.insertNode("-");
		list.insertNode("3");
		list.insertNode("6");
		list.insertNode("2");
		list.insertNode("-");
		list.insertNode("+");
		list.insertNode("*");
		list.insertNode("+");
		
		list.printList();
		System.out.println("\nAnswer is = "+list.evalAndConsume(list.next.next, list, list.next));
	
	}
	
	public String evalAndConsume(DoublyLinkedList c, DoublyLinkedList a, DoublyLinkedList b){
		int x = 0;
		
		if(this.next == null){
			return this.val;
		}
		else if(c.val != "+" && c.val != "-" && c.val != "*" && c.val != "/" ){
			evalAndConsume(c.next, a.next, b.next);
		}
		else {
			a.next = c.next;
			c.prev = a;
			
			int aInt = Integer.parseInt(b.val);
			int bInt = Integer.parseInt(a.val);
			//System.out.println("a = " + aInt + ", b = " + bInt + ", op = " + c.val);
			if(c.val == "+")
				x = aInt + bInt;
			else if(c.val == "-")
				x = aInt - bInt;
			else if(c.val == "*")
				x = aInt * bInt;
			else if(c.val == "/")
				x = aInt / bInt;
			System.out.println("x = " + x);
			a.val = x + "";
			this.printList();
			try{
				this.evalAndConsume(this.next.next,this, this.next);
			}catch(NullPointerException n){
				
			}
		}
			
		return this.val;
	}
	
}
