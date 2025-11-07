package model;

import java.math.BigDecimal;

public class Funcionario extends Persona {
	private BigDecimal salario;
	private String puesto;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nombre, int edad, int identificacion, String direccion, BigDecimal salario,
			String puesto) {
		super(nombre, edad, identificacion, direccion);
		this.salario = salario;
		this.puesto = puesto;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	@Override
	public String muestraInformacion() {
		// TODO Auto-generated method stub
		return super.muestraInformacion() + 
				"\n Datos Funcionario " + 
				"\nPuesto: " + getPuesto();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Informacion del Funcionario\n"+
				"Nombre " + getNombre() + "\n"+
				"Salario " + getSalario() +"\n"+
				"Edad " + getEdad() + "\n" +
				"Direccion " + getDireccion();
				
	}
	
	@Override
	public boolean equals(Object obj) {
		Funcionario fun50 = (Funcionario) obj;
		if(this.getPuesto().equals(fun50.getPuesto()) 
				&& this.getNombre().equals(fun50.getNombre())) {
			return true;
		}
		return false;
	}

}
