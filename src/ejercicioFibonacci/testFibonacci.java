package ejercicioFibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFibonacci {

	@Test
	void test() {
		int valor = fibonacci.serieFibonacci(0);
        assertEquals(0, valor);
	}

}
