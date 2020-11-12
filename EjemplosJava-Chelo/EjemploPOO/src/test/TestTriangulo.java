package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import dominio.Triangulo;

public class TestTriangulo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testCalcularSuperficie() 
	{
		Triangulo miTriangulo = new Triangulo(2, 2);
		
		double superficieEsperada = 2;
		
		double resultado = miTriangulo.calcularSuperficie();
		
		org.junit.Assert.assertEquals(superficieEsperada,resultado, 0);
	}
	
	@Test
	public void testCalcularPerimetro() 
	{
		Triangulo miTriangulo = new Triangulo(2, 2);
		
		double perimetroEsperada = 6;
		
		double resultado = miTriangulo.calcularPerimetro();
		
		org.junit.Assert.assertEquals(perimetroEsperada,resultado, 0);
	}

}
