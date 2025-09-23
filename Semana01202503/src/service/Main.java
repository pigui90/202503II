package service;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nombreCompleto = JOptionPane.showInputDialog("Indique su nombre completo");
		
		
		JOptionPane.showMessageDialog(null, nombreCompleto);
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

		JOptionPane.showMessageDialog(null, "El numero que digito es " + valor);
		
		int resultado = valor * 8;
		JOptionPane.showMessageDialog(null, "El resultado es " + resultado);

		
	}

}
