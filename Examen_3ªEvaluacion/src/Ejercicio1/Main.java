package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void lecturaFichero(String fichero, String letra) {
		File file = new File(fichero);
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] lineaSep = linea.split(" "); //Método de separación dentro del fichero
				for(int i = 0; i < lineaSep.length; i++) {
					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Pre: --- Post: Nos piden un programa que, dado un fichero .txt, nos muestre
	 * por pantalla todas las palabras que hay en el texto que empiecen o acaben por
	 * la letra que nosotros hayames metido por parámetro.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen3ªEVA\\HablanosDelDon.txt";
		System.out.println(
				"Escribe una letra para buscar las palabras que o bien empiezan o bien acaban por dicha letra.");
		String letra = sc.nextLine();
		lecturaFichero(fichero, letra);
	}
}