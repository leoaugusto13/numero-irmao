package br.com.navita.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.navita.NumeroIrmao;
 
public class NumeroIrmaoTeste {
 
	@Test
	public void teste() {
		int numero1 = 531;
		int numero2 = 2348;
		int numero3 = 533;
		int numero4 = 129433162;
		
		int retornoNumero1 = 531;
		int retornoNumero2 = 8432;
		int retornoNumero3 = 533;
		int retornoNumero4 = -1;
		
		NumeroIrmao numeroIrmao = new NumeroIrmao();
		
		int resultadoNumero1 = numeroIrmao.solution(numero1);
		assertEquals(retornoNumero1, resultadoNumero1);
		
		int resultadoNumero2 = numeroIrmao.solution(numero2);
		assertEquals(retornoNumero2, resultadoNumero2);
		
		int resultadoNumero3 = numeroIrmao.solution(numero3);
		assertEquals(retornoNumero3, resultadoNumero3);
		
		int resultadoNumero4 = numeroIrmao.solution(numero4);
		assertEquals(retornoNumero4, resultadoNumero4);
	}
}
