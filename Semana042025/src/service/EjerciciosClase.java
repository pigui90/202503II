package service;

import java.awt.font.NumericShaper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class EjerciciosClase {

	public static void main(String[] args) {
		String menu = "********************\n** Bienvenido al sistema de la clase 4\n** 1- Ejercicio 1\n** 2- Ejercicio 2\n** 3- Ejercicio 3\n** Digite una opcion: \n**************************";
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcion) {
		case 1:

			try {
				int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
				String sumatoriaAStr = "";
				String sumatoriaBStr = "";

				int sumatoriaA = 0;
				int sumatoriaB = 0;

				for (int i = 1; i < numeroA; i++) {
					if (numeroA % i == 0) {
						sumatoriaA = sumatoriaA + i;
						sumatoriaAStr = sumatoriaAStr + " " + i;
					}
				}

				for (int i = 1; i < numeroB; i++) {
					if (numeroB % i == 0) {
						sumatoriaB += i;
						sumatoriaBStr = sumatoriaBStr + " " + i;

					}
				}

				if (sumatoriaA == numeroB && sumatoriaB == numeroA) {
					JOptionPane.showMessageDialog(null, "Son amiguis \n" + "Sumatoria de " + numeroA + ": "
							+ sumatoriaAStr + "\n" + "Sumatoria de " + numeroB + ": " + sumatoriaBStr);
				} else {
					JOptionPane.showMessageDialog(null, "No son amiguis");
				}

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 2:
			try {
				int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia, en numeros"));
				int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes, en numeros"));
				int year = Integer.parseInt(JOptionPane.showInputDialog("Digite un año con los 4 digitos"));
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String fecha = dia + "-" + mes + "-" + year;

				Date fechaUsuario = sdf.parse(fecha);
				Date fechaHoy = new Date();
				
				if(fechaUsuario.after(fechaHoy)) {
					JOptionPane.showMessageDialog(null, "La fecha indicada esta despues de hoy");
				}else {
					if(fechaUsuario.before(fechaHoy)) {
						JOptionPane.showMessageDialog(null, "La fecha indicada esta antes de hoy");
					}else {
						JOptionPane.showMessageDialog(null, "La fecha indicada es igual a hoy");
					}
				}

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			} catch (ParseException pe) {
				JOptionPane.showMessageDialog(null, pe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			break;
		default:
			break;
		}

	}

}
