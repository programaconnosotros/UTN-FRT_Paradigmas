package dominio;

public class FiguraGeometrica 
{
	private int lado;
	
	public FiguraGeometrica(int lado)
	{
		this.lado = lado;
	}
	
	public int getLado() {
		return this.lado;
	}
	
	public void setLado(int nuevoLado)
	{
		lado = nuevoLado;
	}

	
	public double calcularSuperficie() {
		return 0;
	}
	
	public double calcularPerimetro() {
		return 0;
	}
	
	@Override
	public String toString() {
		String mensaje = "Figura : Circulo  - Perimetro : %.2f - Superficie : %.2f";
		return String.format(mensaje, calcularPerimetro(),calcularSuperficie());
	}

}
