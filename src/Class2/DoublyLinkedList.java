package Class2;

public class DoublyLinkedList {
	
	String val;
	DoublyLinkedList next;
	DoublyLinkedList prev;
	
	public DoublyLinkedList(){
		this.next = null;
		this.prev = null;
	}
	
	public DoublyLinkedList(String val){
		this();
		this.val = val;
	}
	
	public int insertNode(String val){
		DoublyLinkedList temp = new DoublyLinkedList();
		for(temp = this; temp.next != null; temp = temp.next);
		temp.next = new DoublyLinkedList(val);
		temp.next.prev = temp;
		return 1;
	}
	
	public void printList(){
		for(DoublyLinkedList temp = this; temp != null; temp = temp.next){
			System.out.print(temp.val + ", ");
		}	
	}
	
	public int count (){
		int cnt = 0;
		for(DoublyLinkedList temp = this; temp != null; temp = temp.next)
			cnt++;
		return cnt;
	}
	
	public DoublyLinkedList clean(){
		if(this == null)
			return null;
		else if(this.val == "0"){
			try{
				return this.next.clean();
			}catch (NullPointerException n){ return null;}
		}	
		else{
			try{
			this.next = this.next.clean();
			}catch (NullPointerException n){}
		}	
		return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
