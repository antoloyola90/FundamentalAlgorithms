package Class2;

public class Class2Ex2Dot20 extends DoublyLinkedList{
	
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList("3");
		list.insertNode("4");
		list.insertNode("7");
		list.insertNode("9");
		list.insertNode("0");
		list.insertNode("1");
		list.insertNode("3");
		list.insertNode("6");
		list.insertNode("2");
		list.insertNode("0");
		list.insertNode("7");
		list.insertNode("0");
		list.insertNode("9");
		list.insertNode("0");
		
		list.printList();
		list = list.clean();
		System.out.println();
		list.printList();
	}
	
}
