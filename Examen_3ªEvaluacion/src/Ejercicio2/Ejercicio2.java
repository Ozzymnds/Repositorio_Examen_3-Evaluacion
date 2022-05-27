package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Pre: --- Post: M�todo usado para leer el fichero .csv.
	 */
	public static void lecturaFichero(String fichero) {
		File file = new File(fichero);
		String provincia = "";
		String interrogacion = "";
		String a�o = "";
		String total = "";
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] lineSep = linea.split(";");
				provincia = lineSep[0];
				interrogacion = lineSep[1];
				a�o = lineSep[2];
				total = lineSep[3];
				for (int i = 0; i < lineSep.length; i++) {
					// Este condicional lo usaremos para saber los divorcios con separaci�n previa
					// del a�o 2019
					if (interrogacion.equalsIgnoreCase("Si") && a�o.equalsIgnoreCase("2019")) {
						System.out.println();
						System.out.print("\n Provincia: " + lineSep[0] + " ---");
						System.out.print(" Si/No: " + lineSep[1] + " ---");
						System.out.print(" A�o: " + lineSep[2]);
						// Este segundo condicional es para saber los divorcios SIN separaci�n previa
						// del a�o 2018
					} else if (interrogacion.equalsIgnoreCase("No") && a�o.equalsIgnoreCase("2018")) {
						System.out.println();
						System.out.print("\n Provincia: " + lineSep[0] + " ---");
						System.out.print(" Si/No: " + lineSep[1] + " ---");
						System.out.print(" A�o: " + lineSep[2]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Pre: --- Post: Se nos pide que, dado un fichero ".csv" sobre los divorcios
	 * listados por el INE en Espa�a, mostremos por pantalla los divorcios con
	 * separaci�n previa de 2019, aquellos que NO tuvieron separaci�n previa en
	 * 2018, y la localidad cuyo n�mero de divorcios (suma de ambos) desde 2013
	 * hasta 2019 haya sido mayor.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuaci�n se mostrar� el listado de divorcios de cada provincia de Espa�a.");
		String fichero = "C:\\Users\\jmsan\\Desktop\\ficherosExamen3�EVA\\Divorcios.csv";
		lecturaFichero(fichero);
	}
}
