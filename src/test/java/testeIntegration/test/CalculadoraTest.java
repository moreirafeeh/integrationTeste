package testeIntegration.test;

import org.junit.Assert;
import org.junit.Test;

import testeIntegration.Calculadora;

public class CalculadoraTest {
	
	@Test
	public void TestarCalculo() {
		int soma = Calculadora.somar1();
		
		Assert.assertEquals(3, soma);
		
	}
	

	@Test
	public void TestarCalculoSoma() {
		int soma = Calculadora.somar2();
		
		Assert.assertEquals(3, soma);
		
	}

}
