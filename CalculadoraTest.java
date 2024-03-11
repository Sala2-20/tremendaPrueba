package prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {
		Calculadora cal = new Calculadora(4,1);
		int resultado = cal.sumar();
		assertEquals(5, resultado);
	}
	@Test
	void testRestar() {
		Calculadora cal = new Calculadora(4,1);
		int resultado = cal.restar();
		assertEquals(3, resultado);
	}

}
