package model;

public class Campus {

	private String ubicacion;
	private int numero;
	private String nombre;
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Campus(String ubicacion, int numero, String nombre) {
		super();
		this.ubicacion = ubicacion;
		this.numero = numero;
		this.nombre = nombre;
	}
	public Campus() {
		super();
	}
	
	@Override
	public String toString() {
		return "Ubicacion: " + getUbicacion() + "\nNombre: " + getNombre() + "\nNumero: " + getNumero();
	}
}
