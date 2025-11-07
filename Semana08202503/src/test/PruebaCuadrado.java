package test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import model.Cuadrado;

class PruebaCuadrado {
	static Cuadrado cuadrado;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuadrado = new Cuadrado(4);
	}

	@BeforeEach
	void setUp(TestInfo testInfo) throws Exception {
		cuadrado.setLado(Integer.parseInt(
				JOptionPane.showInputDialog(testInfo.getDisplayName() + "\nDigite la medida del lado del cuadrado")));
	}

	@Test
	void testCalculaArea() {
		assumeTrue("La instancia debe estar inicializada", cuadrado != null);
		// Pregunto si la medida del lado es menor o igual a 0, de ser asi, ignoro el
		// test
		assumeTrue("La medida del lado es igual o menor a 0", cuadrado.getLado() > 0);
		double resultado = cuadrado.calculaArea();
		assertTrue(resultado> 0);
		String area = "El area es: " + resultado;
		JOptionPane.showMessageDialog(null, area);

	}

	@Test
	void testCalculaPerimetro() {
		assumeTrue("La instancia debe estar inicializada", cuadrado != null);
		// Pregunto si la medida del lado es menor o igual a 0, de ser asi, ignoro el
		// test
		assumeTrue("La medida del lado es igual o menor a 0", cuadrado.getLado() > 0);
		assertTrue(cuadrado.calculaPerimetro() > 0);

	}

}
