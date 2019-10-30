package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();   // objeto: instancia da classe Triangle
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A área maior é a do triângulo X");
			}
		else if (areaX < areaY){
			System.out.println("A área maior é a do triângulo Y");
			}
		else {
			System.out.println("Áreas são iguais!");
			}
	
	    sc.close();			
	}
	

}
