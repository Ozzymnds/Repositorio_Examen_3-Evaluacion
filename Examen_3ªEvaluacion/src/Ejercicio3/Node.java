package Ejercicio3;

public class Node {
	private int content;
	private Node next;

	public Node(int content, Node next) {
		super();
		this.content = content;
		this.next = next;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node first) {
		this.next = first;
	}

	@Override
	public String toString() {
		if (next != null) {
			return "Node = " + content + ", next=" + next.getContent();
		} else {
			return "Content = " + content;
		}
	}
}
