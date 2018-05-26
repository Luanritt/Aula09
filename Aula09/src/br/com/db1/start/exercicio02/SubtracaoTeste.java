package br.com.db1.start.exercicio02;

import org.junit.Assert;
import org.junit.Test;

public class SubtracaoTeste {

	@Test
	public void calculaTeste(){
		
		Subtracao subtrair = new Subtracao();
		Assert.assertTrue(32 == subtrair.numero(50, 18));
		
	}

}
