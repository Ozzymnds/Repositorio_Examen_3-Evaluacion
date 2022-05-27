package Ejercicio3;

public class SimpleLinkedList {
	private Node first;
	private int size;

	public SimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}

	public SimpleLinkedList(Node first) {
		this.first = first;
		this.size = 1;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/*
	 * Método para añadir un nodo en la primera posición solamente.
	 */
	public boolean add(Node node) {
		try {
			if (size == 0) {
				first = node;
			} else {
				Node p = first;
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				}
				p.setNext(node);
			}
			size++;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/*
	 * Método con la misma finalidad que el anterior, pero con la diferencia de que
	 * aquí elegimos la posición donde añadir el nodo
	 */
	public boolean add(int position, Node node) {
		try {
			Node p = first;
			if (position == 0) {
				node.setNext(first);
				first = node;
			} else if (position == size) {
				return add(node);
			} else {
				for (int i = 1; i < position; i++) {
					p = p.getNext();
				}
				node.setNext(p.getNext());
				p.setNext(node);
			}
			size++;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/*
	 * Método usado para eliminar un nodo de la lista en base a su posición en la
	 * misma.
	 */
	public boolean delete(int position) {
		try {
			if (position == 0) {
				Node p = first;
				first = p.getNext();
			} else if (position == size - 1) {
				Node p = first;
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				}
				p.setNext(null);
			} else {
				Node p = first;
				for (int i = 1; i < position - 1; i++) {
					p = p.getNext();
				}
				p.setNext(p.getNext().getNext());
			}
			size--;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	public boolean eliminarMayor() {
		try {
			
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/*
	 * Método usado para seleccionar un nodo en base a su posición en la lista.
	 */
	public Node get(int position) {
		try {
			if (position >= 0 && position < size) {
				Node p = first;
				for (int i = 1; i <= position; i++) {
					p = p.getNext();
				}
				return p;
			} else {
				System.out.println("Te pasaste");
				return null;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}

	/*
	 * Método para mostrar por pantalla la Simple Linked List
	 */
	public void show() {
		Node p = first;
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] -> " + p.getContent());
			p = p.getNext();
		}
	}
}
