package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrianguloRectangulo t1 = new TrianguloRectangulo(3,7);
		
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		double areaT1 = t1.area();
		double perimetroT1 = t1.perimetro();
		
		double areaT2 = t2.area();
		double perimetroT2 = t2.perimetro();

	}

}
