package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void tablaMultiplicar(int n, int multiplicadores) {
		if (multiplicadores >= 1) {
			tablaMultiplicar(n, multiplicadores - 1);
		}
		System.out.println(n + " x " + multiplicadores + " = " + (n * multiplicadores));
	}

	/**
	 * Pre: --- Post: Nos piden un programa para calcular de manera recursiva la
	 * tabla de multiplicar de "n" contando sólo con los números pares, es decir,
	 * que sólo se multiplicará por 2, 4, 6, 8, etc.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la tabla que quieres mostrar: ");
		int n = sc.nextInt();
		int multiplicadores = 100;
		System.out.println("El número de multiplicadores será siempre " + multiplicadores);
		System.out.println();
		tablaMultiplicar(n, multiplicadores);
	}
}
