package service;

import javax.swing.JOptionPane;

/**
 * Ejercicios de la clase de Semana 2
 */
public class EjercicioClase {

	/**
	 * Constructor sin parametros de la clase
	 */
	public EjercicioClase() {

	}

	/**
	 * Metodo main para ejecutar el menu principal
	 * 
	 * @param args Parametros por defecto
	 */
	public static void main(String[] args) {

		String menu = "1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Salir\nEscoja una opcion";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion) {
			case 1:
				determinaNumeroPar();
				break;
			case 2:
				adivinaAdivinador();
				break;
			case 3:
				try {
					int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
					int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

					divisionNumeros(numero1, numero2);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Algo fallo", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 4:
				try {
					int sizeEstudiantes = Integer
							.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes"));
					int sizeCalificaciones = Integer
							.parseInt(JOptionPane.showInputDialog("Digite la cantidad de calificaciones"));
					ingresoCalificaciones(sizeEstudiantes, sizeCalificaciones);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Algo fallo", "Error", JOptionPane.ERROR_MESSAGE);
				}
			case 5:
				JOptionPane.showMessageDialog(null, "Saliendo del sistema....", "3, 2, 1", JOptionPane.WARNING_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida", "No existe", JOptionPane.WARNING_MESSAGE);
				break;
			}

		} while (opcion != 5);

	}

	/**
	 * Metodo que determina si el numero es par o no
	 */
	public static void determinaNumeroPar() {
		int numero;
		try {

			do {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				if (numero <= 0) {
					JOptionPane.showMessageDialog(null, "Debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} while (numero <= 0);

			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El numero es par", "Par", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "El numero es impar", "Impar", JOptionPane.INFORMATION_MESSAGE);
			}

			JOptionPane.showMessageDialog(null, "Eso es todo amigos", "Bye bye", JOptionPane.INFORMATION_MESSAGE);

		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Metodo que hace que el usuario deba adivinar un numero aleatorio entre 1 y un
	 * numero que el usuario escoja
	 */
	public static void adivinaAdivinador() {

		int numeroAdivinar = 0;
		boolean adivino = false;
		int numeroLimite = 0;
		int numeroUsuario;
		double numeroRand;

		// Se determina el numero aleatorio
		try {
			numeroLimite = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero N"));
			numeroRand = (Math.random()) * numeroLimite;
			numeroAdivinar = (int) numeroRand;
			System.out.println(numeroAdivinar);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
		}

		// Logica para que el usuario adivine el numero, no sale del ciclo hasta que lo
		// encuentre
		do {
			try {
				numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero aleatorio"));

				if (numeroUsuario == numeroAdivinar) {
					JOptionPane.showMessageDialog(null, "Adivino el numero", "Felicidades",
							JOptionPane.INFORMATION_MESSAGE);
					adivino = true;
				} else {
					JOptionPane.showMessageDialog(null, "Casi casi, pero no le adivino", "Muy mal",
							JOptionPane.WARNING_MESSAGE);
				}

			} catch (NumberFormatException nfe2) {
				JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!adivino);

	}

	/**
	 * Division entre numeros con decimales
	 * 
	 * @param numero1 numero dividendo
	 * @param numero2 numero divisor
	 */
	public static void divisionNumeros(int numero1, int numero2) {
		boolean divisionCorrecta = false;
		double resultado;
		do {
			try {
				// La division de los numeros, numero1 se castea a double para obtener los
				// decimales
				resultado = ((double) numero1 / numero2);
				divisionCorrecta = true;
				JOptionPane.showMessageDialog(null, "Resultado de la division " + resultado);

			} catch (NumberFormatException nfe) {
				// en caso de que no digite un numero
				JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
				divisionCorrecta = false;
			} catch (ArithmeticException ae) {
				// en caso de que se divida entre 0
				JOptionPane.showMessageDialog(null, "Error al realizar la division" + ae.getMessage(), "Error",
						JOptionPane.ERROR_MESSAGE);
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
				divisionCorrecta = false;
			} catch (Exception ex) {
				// Por si algo mas pasa
				JOptionPane.showMessageDialog(null, "Algo fallo, comuniquese con TI " + ex.getMessage(), "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (divisionCorrecta == false);
	}

	/**
	 * Ingreso de calificaciones por el profesor 
	 * @param sizeEstudiantes cantidad de estudiantes
	 * @param sizeCalificaciones cantidad de calificaciones
	 */
	public static void ingresoCalificaciones(int sizeEstudiantes, int sizeCalificaciones) {
		int[] estudiantes = new int[sizeEstudiantes];
		try {
			for (int i = 0; i < sizeCalificaciones; i++) {
				estudiantes[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite una calificacion"));
			}
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			JOptionPane.showMessageDialog(null, "La cantidad de estudiantes excedida", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
		}

		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i] != 0) {
				JOptionPane.showMessageDialog(null, estudiantes[i]);
			}

		}

	}

}
