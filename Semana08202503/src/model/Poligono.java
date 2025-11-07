package model;

public class Poligono {
	private int cantidadLado;

	public Poligono(int cantidadLado) {
		super();
		this.cantidadLado = cantidadLado;
	}

	public Poligono() {
		super();
	}

	public int getCantidadLado() {
		return cantidadLado;
	}

	public void setCantidadLado(int cantidadLado) {
		this.cantidadLado = cantidadLado;
	}
	
	public double calculaArea() {
		return 0.0;
	}
	
	public double calculaPerimetro() {
		return 0.0;
	}
	
	
}
