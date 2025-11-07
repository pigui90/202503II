package service;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import model.Funcionario;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNombre("Sergio");
		funcionario.setIdentificacion(155545);
		funcionario.setPuesto("Profesor");
		funcionario.setDireccion("Grecia");
		funcionario.setEdad(35);
		funcionario.setSalario(new BigDecimal(5000));
		 
		Funcionario fun2 = new Funcionario("Sergio C", 35, 155545, "Grecia", new BigDecimal(5000), "Profesor");
		
		
//		JOptionPane.showMessageDialog(null, "El salario es: " + fun2.getSalario());
//		JOptionPane.showMessageDialog(null, "La identificacion es: " + fun2.getIdentificacion());
//
//		JOptionPane.showMessageDialog(null, fun2.muestraInformacion());
		JOptionPane.showMessageDialog(null, fun2.toString());
		JOptionPane.showMessageDialog(null, funcionario.toString());

		if(funcionario.equals(fun2)) {
			JOptionPane.showMessageDialog(null, "SON IGUALES");
		}else {
			JOptionPane.showMessageDialog(null, "SON DIFERENTES");
		}
		
		Funcionario fun3 = fun2;
		
		if(fun3.equals(fun2)) {
			JOptionPane.showMessageDialog(null, "SON IGUALES");
		}else {
			JOptionPane.showMessageDialog(null, "SON DIFERENTES");
		}
		
		fun3.setNombre("Pedro");
		JOptionPane.showMessageDialog(null, fun2.toString());
		JOptionPane.showMessageDialog(null, fun3.toString());
	}
}
