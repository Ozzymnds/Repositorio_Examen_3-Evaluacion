package Ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBBDD {
	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	final private static String host = "localhost:3306/ejercicio1examenprog";
	final private static String user = "root";
	final private static String passwd = "1234";
	private ArrayList<Registro> registro = new ArrayList<Registro>();

	/**
	 * Pre: --- Post: Método utilizado para enlazar el código de esta clase con la
	 * base de datos creada en MySQL WorkBench.
	 */
	public static void linkDB() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			statement = connect.createStatement();
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Pre: --- Post: Método para leer la tabla "registro"
	 * 
	 */
	public ArrayList<Registro> readRegistro() throws Exception {
		ArrayList<Registro> registro = new ArrayList<Registro>();
		int id = 0;
		String letra = "";
		String palabra = "";
		int linea = 0;
		try {
			linkDB();
			statement = connect.createStatement();
			preparedStatement = connect.prepareStatement("SELECT * from rpg.avatar");
			resultSet = preparedStatement.executeQuery("SELECT * from rpg.avatar");
			while (resultSet.next()) {
				id = resultSet.getInt(1);
				letra = resultSet.getString(2);
				palabra = resultSet.getString(3);
				linea = resultSet.getInt(4);
				registro.add(new Registro(id, letra, palabra, linea));
			}
			return registro;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	/**
	 * Pre: --- Post: Método para insertar valores en la tabla "registro".
	 * 
	 */
	public void insertAvatar(Registro registro, ArrayList<Registro> Registro) throws Exception {
		try {
			linkDB();
			statement = connect.createStatement();
			preparedStatement = connect
					.prepareStatement("insert into registro(id, letra, palabra, linea) values (?, ?, ?, ?)");
			preparedStatement.setInt(1, registro.getId());
			preparedStatement.setString(2, registro.getLetra());
			preparedStatement.setString(3, registro.getPalabra());
			preparedStatement.setInt(4, registro.getLinea());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	/**
	 * Pre: --- Post: Método utilizado para cerrar la conexión con la base de datos.
	 */
	private static void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
		}
	}
}