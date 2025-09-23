package service;

import javax.swing.JOptionPane;

/**
 * Clase Principal para ver los temas de la semana 2
 */
public class Main {

	/**
	 * Constructor
	 */
	public Main() {
		
	}
	/**
	 * Metodo principal que ejecuta el Java
	 * @param args Por defecto, se utiliza para ejecutar la aplicacion, no modificar
	 */
	public static void main(String[] args) {
		// Este es un ejemplo de un try-catch
		try {
			/*
			 * Se solicita un numero al usuario, se convierte el String digitado a numero Y
			 * si es mayor a 0, indica que es positivo
			 */
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			JOptionPane.showMessageDialog(null, "El valor digitado es: " + numero, "Numero Digitado",
					JOptionPane.INFORMATION_MESSAGE);
			
			if (numero > 0) {
				JOptionPane.showMessageDialog(null, "Es positivo");
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "El valor indicado no es el correcto", "Error algo fallo",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Algo paso, que falla", "Error algo fallo",
					JOptionPane.WARNING_MESSAGE);
		}

		JOptionPane.showMessageDialog(null, "Hola a todos");

	}

}
