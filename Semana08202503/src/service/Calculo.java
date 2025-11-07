package service;

import javax.swing.JOptionPane;

/**
 * Clase para realizar calculos y probarlos en el test
 */
public class Calculo {
	// Atributos de la clase
	int numeroA;
	int numeroB;
	
	/**
	 * Metodo que verifica si numeroA es mayor a numeroB
	 * @author Aula
	 * @return True si A es mayor que B
	 */
	public boolean esMayor() {
	
		// Se solicitan datos numericos al usuario
		numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		
		return numeroA > numeroB;
	}
	
	/**
	 * Metodo que verifica si numeroA es menor a numeroB
	 * @author Aula
	 * @return True si A es menor que B
	 */
	public boolean esMenor() {
	
		// Se solicitan datos numericos al usuario
		numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		
		return numeroA < numeroB;
	}
	
	/**
	 * Metodo que verifica si numeroA es igual a numeroB
	 * @author Aula
	 * @return True si A es igual que B
	 */
	public boolean esIgual() {
	
		// Se solicitan datos numericos al usuario
		numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		
		return numeroA == numeroB;
	}
	
}
