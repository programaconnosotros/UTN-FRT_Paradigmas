package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import dominio.Circulo;

public class TestCirculo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testCalcularSuperficie() 
	{
		Circulo miCirculo = new Circulo(1);
		
		double valorEsperado = Math.PI;
		
		double resultado = miCirculo.calcularSuperficie();
		
		org.junit.Assert.assertEquals(valorEsperado, resultado,0);
	}

}
