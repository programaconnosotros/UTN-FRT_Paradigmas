package dominio;

public class Cuadrado extends FiguraGeometrica
{
	public Cuadrado(int lado) 
	{
		super(lado);
	}
	
	
	@Override
	public double calcularSuperficie() {
		return getLado() * getLado();
	}
	
	@Override
	public double calcularPerimetro() {
		return getLado() * 4;
	}
	
	@Override
	public String toString() {
		String mensaje = "Figura : Cuadrado  - Perimetro : %.2f - Superficie : %.2f";
		return String.format(mensaje, calcularPerimetro(),calcularSuperficie());
	}
	
}
