
public class Node<Item> {
	private Node<Item> next;
	private Item value;
	
	public Node() {
		value = null;
		next = null;
	}
	
	public Node(Item item, Node<Item> next) {
		value = item;
		this.next = next;
	}
}
