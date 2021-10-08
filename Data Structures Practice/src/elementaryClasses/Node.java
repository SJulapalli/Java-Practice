package elementaryClasses;

public class Node<Item> {
	public Node<Item> next;
	public Item item;
	
	public Node() {
		this.item = null;
		this.next = null;
	}
	
	public Node(Item item, Node<Item> next) {
		this.item = item;
		this.next = next;
	}
}
