package model;

public class Persona {
	
	private String nombre;
	private int edad;
	private int identificacion;
	private String direccion;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, int identificacion, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String muestraInformacion() {
		return "El nombre: " + getNombre() + ", la identificacion " + getIdentificacion();
	}
	
	

}
