import java.util.Iterator;
import java.util.NoSuchElementException;

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
	
	public Iterator<Item> iterator() {
		return new bagIterator();
	}
	
	/**
	 * Private Nested Iterator Class
	 * Used by iterator() to allow For-Each Looping.
	 * @author Suhas
	 *
	 */
	private class bagIterator implements Iterator<Item> {
		private Node<Item> current;

		public boolean hasNext() {
			return current != null;
			}
		
		public void remove() {
			throw new UnsupportedOperationException();
			}

		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
			}
	   }
	
	public String toString() {
		String output = new String("[" + first.item.toString() + ", " + first.next + "]");
		
		for (Node<Item> node = first.next; first != null; first = first.next)
			output += ", [" + node.item.toString() + ", " + node.next + "]";
	
		return output;
	}
	
}
