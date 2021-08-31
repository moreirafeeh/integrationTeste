package testeIntegration.test;

import org.junit.Assert;
import org.junit.Test;

import testeIntegration.Calculadora;

public class CalculadoraTest {
	
	@Test
	public void TestarCalculo() {
		int soma = Calculadora.somar(2 , 1);
		
		Assert.assertEquals(3, soma);
		
	}
	

}
