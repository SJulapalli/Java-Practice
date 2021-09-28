
public class Bag<Item> implements Iterable<Item>{
	private Node<Item> first;
	private int size;
	
	public Bag() {
		first = null;
		size = 0;
	}
	
	public Bag(Node<Item> first, int size) {
		this.first = first;
		this.size = size;
	}
	
	public void add(Item item) {
		Node<Item> temp = first;
		first = new Node<Item>(item, temp);
		size++;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return size;
	}
	
//	public Iterator<Item> iterator() {
//
//	}
	
	public String toString() {
		String output = new String("[" + first.value.toString() + ", " + first.next + "]");
		
		for (Node<Item> node = first.next; first != null; first = first.next)
			output += ", [" + node.value.toString() + ", " + node.next + "]";
	
		return output;
	}
	
}
