package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadorasimpleTest {

	
	
	@Test
	void op1Test() {
		double res=calculadorasimple.multiplicar(80,3);
		assertEquals(res,240);
	}
	
	@Test
	void op2Test() {
		double res=calculadorasimple.sumar(150,180);
		double res2=calculadorasimple.dividir(res,3);
		assertEquals(res2,110);
		}
	
	@Test
	void op3Test() {
		double res=calculadorasimple.restar(90,50);
		double res2=calculadorasimple.multiplicar(res,15);
		assertEquals(res2,605);
	}
	
	@Test
	void op4Test() {
		double res=calculadorasimple.sumar(70,40);
		double res2=calculadorasimple.multiplicar(res, 25);
		assertEquals(res2,2700);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
