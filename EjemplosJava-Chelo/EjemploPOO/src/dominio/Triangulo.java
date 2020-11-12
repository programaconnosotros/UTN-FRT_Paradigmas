package dominio;

//Un triangulo no deja de ser una Figura Geometrica
public class Triangulo extends FiguraGeometrica{

	private int altura;
	
	public Triangulo(int base,int altura) {
		super(base);
		this.altura = altura;
	}
	
	@Override
	public double calcularSuperficie() {
		return (getLado() * altura)/2;	
	}
	
	@Override
	public double calcularPerimetro() {
		return (getLado()* 3 );
	}
	
	@Override
	public String toString() {
		String mensaje = "Figura : Triangulo  - Perimetro : %.2f - Superficie : %.2f";
		return String.format(mensaje, calcularPerimetro(),calcularSuperficie());
	}
	

	

}
