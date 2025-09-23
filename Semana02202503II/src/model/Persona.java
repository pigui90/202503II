package model;

/**
 * Clase Persona, como ejemplo 
 */
public class Persona {

	private int edad;
	private String nombre;
	
	/**
	 * Constructor de la clase Persona
	 */
	public Persona() {
		
	}
	
	/**
	 * Constructor de la clase Persona con parametros
	 * @param edad Valor que se va a guardar en el atributo edad
	 * @param nombre Valor que se va guardar en el atributo nombre
	 */
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el nombre de la persona
	 * @return Un String con el valor del nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	
}
