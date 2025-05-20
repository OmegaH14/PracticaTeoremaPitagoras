package clases;

public class TrianguloRectangulo {

		private double a,b,c;
		
		/**
		 * Param a = 1, b = 1, calcular hipotenusa como valor de C
		 */
		public TrianguloRectangulo() {
			this.a = 1;
			this.b = 1;
			this.c = this.hipotenusa();
		}
		
		/**
		 * 
		 * @param a
		 * @param b
		 */
		
		public TrianguloRectangulo(double a, double b) {
			
			if(a <= 0 || b <= 0)
				throw new IllegalArgumentException("Ingresa valores superiores a 0");
			
			this.a = a;
			this.b = b;
			this.c = this.hipotenusa();
		}
		
		/**
		 * 
		 * @return area
		 */
		public double area() {
			return (this.a * this.b)/2;
		}
		
		/**
		 * 
		 * @return hipotenusa
		 */
		public double hipotenusa() {
			
			double resultado = Math.round(Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2)) * 100);
			return resultado / 100;
		}
		
		/**
		 * 
		 * @return perimetro
		 */
		public double perimetro() {
			return this.a + this.b + this.hipotenusa();
		}
		/**
		 * 
		 * @return this.a
		 */
		
		public double getA() {
			return this.a;
		}
		
		/**
		 * 
		 * @return this.b
		 */
		
		public double getB() {
			return this.b;
		}
		
		@Override
		/**
		 * @return mensaje toString
		 */
		public String toString() {
			String mensaje = "Cateto A: " + this.a + "\n";
			mensaje += "Cateto B: " + this.b + "\n";
			mensaje += "Hipotenusa: " + this.hipotenusa();
			
			return mensaje;
		}
		
}
