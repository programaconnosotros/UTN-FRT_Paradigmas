package dominio;

//Herencia: Una clase hija hereda los atributos( que no sean privados) y métodos (que no son privados) de la clase Padre

//TODAS LAS CLASES EN JAVA HEREDAN DE UNA CLASE LLAMADA OBJECT
//JAVA NO SOPORTA MULTIHERENCIA

// Jerarquia de Herencias : Circulo -> FiguraGeometrica -> Object

public class Circulo extends FiguraGeometrica
{	               

	public Circulo(int radio) {
		super(radio);
	}
	
	@Override
	public double calcularSuperficie() 
	{
		return Math.PI * getLado() * getLado();
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * getLado();
	}

	
}
