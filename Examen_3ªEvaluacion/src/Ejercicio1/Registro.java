package Ejercicio1;

/**
 * Pre: --- Post: Clase constructor donde introducimos los valores o atributos
 * de la tabla llamada "registro" que hemos creado en MySQL.
 *
 */
public class Registro {
	private int id;
	private String letra;
	private String palabra;
	private int linea;

	public Registro(int id, String letra, String palabra, int linea) {
		super();
		this.id = id;
		this.letra = letra;
		this.palabra = palabra;
		this.linea = linea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}
}
