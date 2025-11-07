package test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.Calculo;

class Prueba {
	static int contador = 0;
	static Calculo calculo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		JOptionPane.showMessageDialog(null, "Iniciando Pruebas... Inicializando variables");
		calculo = new Calculo();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

		JOptionPane.showMessageDialog(null, "Finalizando Pruebas... Cerrando sesion");

	}

	@BeforeEach
	void setUp() throws Exception {
		contador = contador + 1;
		JOptionPane.showMessageDialog(null, "Iniciando Prueba#: " + contador);

	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "Finalizando Prueba#: " + contador);

	}

	@Test
	void test() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		if (numero % 2 == 0) {
			fail("Valor Par, debia ser impar");
		}
	}

	@Test
	void test2() {
		String saludo = JOptionPane.showInputDialog("Digame un saludo");
		if (saludo.equalsIgnoreCase("Hola")) {
			fail("Valor Par, debia ser impar");
		}
	}

	@Test
	void esMayor() {
		try {
			assumeTrue( "Se debe inicializar la instancia calculo", calculo != null);
			
			assertTrue(calculo.esMayor(), "No es mayor");
		} catch (NumberFormatException nfe) {
			fail("No digito un valor numerico correcto");
		}
	}

	@Test
	void esMenor() {
		try {
			assumeTrue( "Es null", calculo != null);
			
			assertTrue(calculo.esMenor(), "No es mayor");
		} catch (NumberFormatException nfe) {
			fail("No digito un valor numerico correcto");
		}
	}
	
	@Test
	void esIgual() {
		try {
			assumeTrue( "Es null", calculo != null);
			
			assertTrue(calculo.esIgual(), "No es mayor");
		} catch (NumberFormatException nfe) {
			fail("No digito un valor numerico correcto");
		}
	}
}
