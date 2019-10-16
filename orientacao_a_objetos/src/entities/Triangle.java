package entities;

public class Triangle { /// Entidade - Classe: é a definição do tipo
	
	public double a;   //// Atributos
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}

}
