package service;

import javax.swing.JOptionPane;

public class Ejercicios {

	public static void main(String[] args) {
		String menu = "1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4";
		double numero = 0;
		double numero2 = 0;
		String palabra = "";
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcion) {
		case 1:
			do {
				String resultado = "";
				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
				if (numero > 0) {
					for (int i = 1; i <= numero; i++) {
						resultado = resultado + i + "/" + numero + "=" + i / numero + "\n";
					}
					JOptionPane.showMessageDialog(null, resultado);
				}
			} while (numero != 0);

			break;
		case 2:
			do {
				String deletreo = "";
				palabra = JOptionPane.showInputDialog("Digite una palabra");
				if (!palabra.equalsIgnoreCase("FIN")) {
					for (int i = 0; i < palabra.length(); i++) {
						deletreo = deletreo + palabra.charAt(i) + " ";
					}
					JOptionPane.showMessageDialog(null, deletreo);
				}

			} while (!palabra.equalsIgnoreCase("FIN"));
			break;
		case 3:
			String acumularTexto = "";
			double resul = 0;
			double sumatoria = 0;
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite segundo numero"));

			resul = numero + numero2;
			acumularTexto = acumularTexto.concat(numero + "+" + numero2 + "=" + (numero + numero2) + "\n");
			sumatoria += numero + numero2;

			resul = numero - numero2;
			acumularTexto = acumularTexto.concat(numero + "-" + numero2 + "=" + resul + "\n");
			sumatoria += resul;

			resul = numero / numero2;
			acumularTexto = acumularTexto.concat(numero + "/" + numero2 + "=" + resul + "\n");
			sumatoria += resul;

			resul = numero * numero2;
			acumularTexto = acumularTexto.concat(numero + "*" + numero2 + "=" + resul + "\n");
			sumatoria += resul;

			acumularTexto = acumularTexto.concat("El total es: " + sumatoria);

			JOptionPane.showMessageDialog(null, acumularTexto);

			break;

		case 4:
			String nombre;
			boolean continuar;
			do {
				nombre = JOptionPane.showInputDialog("Indique su nombre completo");
				JOptionPane.showMessageDialog(null,
						"Mucho gusto " + nombre + " espero que aprenda mucho este cuatrimestre");
				continuar = Boolean
						.parseBoolean(JOptionPane.showInputDialog("Indique si quiere continuar Si(true) No(false)"));
			} while (continuar);
			JOptionPane.showMessageDialog(null, "Gracias por ponerle bonito");
			break;
		default:
			JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
			break;
		}

	}

}
