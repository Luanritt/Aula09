package br.com.db1.start.exercicio03;

import org.junit.Assert;
import org.junit.Test;



public class TestarMultiplicacao {

	@Test
	public void multiplica(){
		
		Multiplicacao multiplica = new Multiplicacao();
		Assert.assertTrue(30 == multiplica.numero(3, 10));
		
	}

}
