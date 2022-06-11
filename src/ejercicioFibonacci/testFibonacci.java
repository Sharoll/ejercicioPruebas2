package ejercicioFibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFibonacci {

	@Test
	void test() {
		int valor = fibonacci.serieFibonacci(0);
        assertEquals(0, valor);
	}
	
	@Test
	void test1() {
		int valor = fibonacci.serieFibonacci(1);
        assertEquals(1, valor);
	}

	@Test
	void test2() {
		int valor = fibonacci.serieFibonacci(2);
        assertEquals(1, valor);
	}
	
	@Test
	void test3() {
		int valor = fibonacci.serieFibonacci(3);
        assertEquals(2, valor);
	}
	
	@Test
	void test4() {
		int valor = fibonacci.serieFibonacci(4);
        assertEquals(3, valor);
	}
	
	@Test
	void test5() {
		int valor = fibonacci.serieFibonacci(5);
        assertEquals(5, valor);
	}
}
