package app;
import dominio.*;
import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		
		
		ArrayList<FiguraGeometrica> figurasGeometricas = new ArrayList<>();
		
		figurasGeometricas.add(new Cuadrado(2));
		figurasGeometricas.add(new Circulo(4));
		figurasGeometricas.add(new Triangulo(3,4));
		
		for(FiguraGeometrica item : figurasGeometricas) 
		{
			System.out.println(item.toString());
		}
		
		
	}

}
