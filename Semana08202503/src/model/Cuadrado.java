package model;

public class Cuadrado extends Poligono {

	private double lado;

	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cuadrado(int cantidadLado) {
		super(cantidadLado);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(int cantidadLado, double lado) {
		super(cantidadLado);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

}
