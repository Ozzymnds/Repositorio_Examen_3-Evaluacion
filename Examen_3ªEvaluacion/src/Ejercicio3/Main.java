package Ejercicio3;

public class Main {
	/**
	 * Pre: --- Post: Nos piden que, teniendo una Simple Linked List con nodos de
	 * tipo int, creemos un m�todo llamado "eliminarMayor()", el cual consistir� en
	 * eliminar el nodo que tenga el n�mero mayor, es decir, si est�n 23, 12 y 40 se
	 * eliminar� el 40 por ser el mayor.
	 * 
	 */
	public static void main(String[] args) {
		SimpleLinkedList l = new SimpleLinkedList();
		Node n1 = new Node(20, null);
		Node n2 = new Node(40, null);
		Node n3 = new Node(32, null);
		l.add(n1);
		l.add(n2);
		l.add(n3);
	}
}
