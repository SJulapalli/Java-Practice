package elementaryClasses;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item>{
	private Node<Item> top;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	public Stack(Node<Item> first) {
		top = first;
		
		for (Node<Item> i = first; i != null; i = i.next)
			size++;
	}
	
	public void push(Item item) {
		top = new Node<Item>(item, top);
	}
	
	public Item pop() {
		Item output = top.item;
		top = top.next;
		return output;
	}
	
	public Item peek() {
		return top.item;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public Iterator<Item> iterator() {
		return new stackIterator(top);
	}
	
	private class stackIterator implements Iterator<Item> {
		private Node<Item> top;
		
		public stackIterator(Node<Item> top) {
			this.top = top;
		}
		
		public boolean hasNext() {
			return top.next != null;
		}
		
		public void remove() {
			
		}
		
		public Item next() {
			if (top == null) throw new NoSuchElementException();
			Item item = top.item;
			top = top.next;
			return item;
		}
		
	}
	
}
