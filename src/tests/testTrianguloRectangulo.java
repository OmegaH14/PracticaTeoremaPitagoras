package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	@Test
	void testTrianguloRectanguloPredeterminadoHipotenusa() {
		
		TrianguloRectangulo t1h = new TrianguloRectangulo();
		
		double hipotenusaT1 = t1h.hipotenusa();
	}
	
	@Test
	void testTrianguloRectanguloPredeterminadoArea() {
		
		TrianguloRectangulo t1a = new TrianguloRectangulo();
		
		double areaT1 = t1a.area();
	}
	
	@Test
	void testTrianguloRectanguloPredeterminadoPerimetro() {
		
		TrianguloRectangulo t1p = new TrianguloRectangulo();
		
		double perimetroT1 = t1p.perimetro();
	}
	
	@Test
	void testTrianguloRectanguloAsignacionHipotenusa() {
		
		TrianguloRectangulo t2h = new TrianguloRectangulo(3,7);
		
		double hipotenusaT2 = t2h.hipotenusa();
	}
	
	@Test
	void testTrianguloRectanguloAsignacionArea() {
		
		TrianguloRectangulo t2a = new TrianguloRectangulo(3,7);
		
		double areaT1 = t2a.area();
	}
	
	@Test
	void testTrianguloRectanguloAsignacionPerimetro() {
		
		TrianguloRectangulo t2p = new TrianguloRectangulo(3,7);
		
		double areaT1 = t2p.perimetro();
	}
	
	@Test
	void testTrianguloRectanguloInvalido() {
		try {
			TrianguloRectangulo t2 = new TrianguloRectangulo(-2,4);
		}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
		}
		
	}

}
