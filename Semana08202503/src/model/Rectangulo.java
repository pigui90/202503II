package model;

public class Rectangulo extends Poligono {

	private double base;
	private double altura;

	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(int cantidadLado, double base, double altura) {
		super(cantidadLado);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return (base * 2) + (altura * 2);
	}

}
