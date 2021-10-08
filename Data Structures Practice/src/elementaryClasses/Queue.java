package elementaryClasses;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item> {
	private Node<Item> first;
	private Node<Item> last;
	private int size;
	
	public Queue() {
		this.first = null;
		this.size = 0;
	}
	
	public Queue(Node<Item> first) {
		this.first = first;
		Node<Item> temp = first;
		size++;
		
		while (temp.next != null) 
			size++;
		last = temp;
	}
	
	public void enqueue(Item item) {
		if (isEmpty()) {
			first = new Node<Item>(item, null);
			last = first;
		} else {
			Node<Item> oldLast = last;
			last = new Node<Item>(item, null);
			oldLast.next = last;
		}
		size++;
	}
	
	public Item dequeue(Node<Item> node) {
		if (isEmpty()) throw new NoSuchElementException();
		Item item = first.item;
		first = first.next;
		size--;
		if (isEmpty()) last = first;
		return item;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Item peek() {
		if (isEmpty()) throw new NoSuchElementException();
		return first.item;
	}
	
	public Iterator<Item> iterator() {
		return new queueIterator();
	}
	
	private class queueIterator implements Iterator<Item> {
		private Node<Item> current;

		public boolean hasNext() {
			return current != null;
		}
		
		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
			Item temp = current.item;
			current = current.next;
			return temp;
		}
		
	}
	
}
