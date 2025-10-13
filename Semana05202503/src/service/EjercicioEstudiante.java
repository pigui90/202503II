package service;

import java.awt.JobAttributes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class EjercicioEstudiante {

	public void ejercicio1() {

		try {

			JOptionPane.showMessageDialog(null, "Indique dos numeros para hacer el ejercicio");

			int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1:"));

			int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2:"));

			for (int i = (num1 + 1); i < num2; i++) {

				if (i % 2 != 0) {

					JOptionPane.showMessageDialog(null, " [" + i + "] ");
				}

			}

		} catch (NumberFormatException nfe) {

			JOptionPane.showMessageDialog(null, "Por favor solo use numero", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void ejercicio2() {
		String respuesta = "";

		try {
			String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");

			for (int i = nombre.length() - 1; i >= 0; i--) {
				char letra = nombre.charAt(i);
				respuesta += " " + letra;

				if (letra == ' ') {
					respuesta += "\n";
				}
			}
			JOptionPane.showMessageDialog(null, respuesta);

		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Vuelva a intentarlo", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void ejercicio3() {
		double numero1;
		double numero2;
		try {

			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un primer numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite un segundo numero"));
			do {
				numero1 = numero1 + 0.25;
				numero2 = numero2 - 0.25;
			} while (numero1 != numero2);
			JOptionPane.showInternalMessageDialog(null,
					"El resultado de la suma es :" + numero1 + "\n" + " El resultado de la resta es :" + numero2);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido algun error", null, JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR", null, JOptionPane.WARNING_MESSAGE);
		}
	}

	public void ejercicio4() {

		try {

			LocalDate hoy = LocalDate.now();
			LocalDate manana;

			for (int i = 1; i <= 7; i++) {

				manana = hoy.plusDays(i);

				JOptionPane.showMessageDialog(null, manana);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void ejercicio5() {
		try {
			String nombre;
			nombre = JOptionPane.showInputDialog("Digite su nombre");

			int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad (En numeros)"));

			String fechaNacimiento;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaNacimiento = JOptionPane.showInputDialog("Digite su fecha de nacimiento (dia/mes/año)");
			Date fechaNac = sdf.parse(fechaNacimiento);

			JOptionPane.showMessageDialog(null,
					"Nombre: " + nombre + "\nEdad: " + edad + "\nFecha de nacimiento: " + sdf.format(fechaNac));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Error al digitar un valor", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al digitar la fecha", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void ejercicio6() {

		boolean continuar = true;
		while (continuar) {
			try {
				int numA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para un numero numA"));
				int numB = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese un valor para un segundo numero numB"));

				if (numA == numB) {
					JOptionPane.showMessageDialog(null, "El numero numA es igual a numB");
				} else if (numA > numB) {
					JOptionPane.showMessageDialog(null, "El numero numA es mayor a numB");
				} else if (numA < numB) {
					JOptionPane.showMessageDialog(null, "El numero numA es menor a numB");
				}
				continuar = Boolean.parseBoolean(JOptionPane.showInputDialog("Quiere continuar (true/false)"));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros enteros", "Error",
						JOptionPane.ERROR_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void ejercicio7() {
		String producto = JOptionPane.showInputDialog("Ingrese el precio del producto:");
		try {
			double precioOriginal = Double.parseDouble(producto);
			double iva = precioOriginal * 0.25;
			double precioFinal = precioOriginal + iva;

			String mensaje = "Precio original: $" + precioOriginal + "\nMonto de IVA (25%): $" + iva
					+ "\nPrecio final con IVA: $" + precioFinal;

			JOptionPane.showMessageDialog(null, mensaje);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un numero válido", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void ejercicio8() {

		Random random = new Random();

		int numero1 = 0;
		int numero2 = 0;
		String total = " ";

		try {

			numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer valor del ejercio"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo valor del ejercio"));

			if (numero1 < 0 || numero2 < 0) {
				JOptionPane.showMessageDialog(null, "Alguno de los dos valores ingresados no es positivo", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				if (numero2 < numero1) {
					do {
						numero2 = Integer.parseInt(
								JOptionPane.showInputDialog(null, "ingrese nuevamente el segundo valor del ejercio"));

					} while (numero2 <= numero1);
				}

				int min = Math.min(numero1, numero2);
				int max = Math.max(numero1, numero2);

				for (int i = 0; i < 10; i++) {

					int aleatorio = random.nextInt(max - min + 1) + min;
					total += aleatorio + " ";

				}

				JOptionPane.showMessageDialog(null,
						"Los numeros son correctos \n" + numero1 + " y " + numero2 + " son positivos \n" + numero2
								+ " es mayor que " + numero1 + "\n" + "----------------------------------------------"
								+ "Y los demas numeros random son: \n" + total);
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Valor invalido", "Error", JOptionPane.ERROR_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor invalido", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
