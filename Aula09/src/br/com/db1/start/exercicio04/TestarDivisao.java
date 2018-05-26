package br.com.db1.start.exercicio04;

import org.junit.Assert;
import org.junit.Test;



public class TestarDivisao {

	@Test
	public void div(){
		
		Divisao divide = new Divisao();
		Assert.assertTrue(20 == divide.numero(200, 10));
		
	}

}
