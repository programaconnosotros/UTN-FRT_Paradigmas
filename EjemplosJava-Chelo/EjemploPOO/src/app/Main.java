package app;


import dominio.*;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Hola");
		
		Cuadrado miCuadrado = new Cuadrado(5);//Nace de lado 5	
		
		Circulo miCirculo = new Circulo(2);
		
		Triangulo triangulo = new Triangulo(3,4);
		
		
		
		System.out.println(miCirculo.getLado());
		System.out.println(miCuadrado.getLado());
		System.out.println(triangulo.getLado());
		
		System.out.println(miCuadrado.calcularSuperficie());
		System.out.println(miCirculo.calcularSuperficie());
		System.out.println(triangulo.calcularSuperficie());
		
		System.out.println(miCuadrado.calcularPerimetro());
		System.out.println(miCirculo.calcularPerimetro());
		System.out.println(triangulo.calcularPerimetro());
		
			
	}

}
