
public class Node<Item> {
	public Node<Item> next;
	public Item value;
	
	public Node() {
		value = null;
		next = null;
	}
	
	public Node(Item item, Node<Item> next) {
		value = item;
		this.next = next;
	}
}
