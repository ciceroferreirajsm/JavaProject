package Lista1;

public class EqGrau {

	double a, b, c;
	
	public EqGrau (double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double Delta() {
		
		double delta = (Math.pow(b, 2)) - (4 * a * c);
		
		return delta;
	}
	
	public double Raiz1(double delta) {
		
		double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);	
		
		return raiz1;
	}
	
	public double Raiz2(double delta) {
		
		double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);	
		
		return raiz2;
	}
}
