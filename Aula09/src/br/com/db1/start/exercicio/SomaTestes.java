package br.com.db1.start.exercicio;

import org.junit.Assert;
import org.junit.Test;

public class SomaTestes {

	@Test
        public void calcularTeste(){
		
		SomaDois soma = new SomaDois();
		Assert.assertTrue(10 == soma.numero(8, 2));
	}
}
