package service;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		EjercicioEstudiante eEstudiante = new EjercicioEstudiante();
		String menu = "1- Ejercicio 1\n2- Ejercicio 2\n"
				+ "3- Ejercicio 3\n4- Ejercicio 4\n5- Ejercicio 5\n6- Ejercicio 6\n"
				+ "7- Ejercicio 7\n8- Ejercicio 8\n9- Ejercicio 9\n10- Ejercicio 10\n" + "11- Ejercicio 11\n12- Salir";
		int opcion = 0;
		do {

			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				eEstudiante.ejercicio1();
				break;
			case 2:
				eEstudiante.ejercicio2();
				break;
			case 3:
				eEstudiante.ejercicio3();

				break;
			case 4:
				eEstudiante.ejercicio4();

				break;
			case 5:
				eEstudiante.ejercicio5();

				break;
			case 6:
				eEstudiante.ejercicio6();

				break;
			case 7:
				eEstudiante.ejercicio7();
				break;
			case 8:
				eEstudiante.ejercicio8();

				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			case 12:	
				JOptionPane.showMessageDialog(null, "Saliendo del sistema", "Saliendo", JOptionPane.WARNING_MESSAGE);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);

				break;
			}

		} while (opcion != 12);

	}

}
