package testeIntegration;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void TestarCalculo() {
		int soma = Calculadora.somar1();
		
		Assert.assertEquals(3, soma);
		
	}

}
