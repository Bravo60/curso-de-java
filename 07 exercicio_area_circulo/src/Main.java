import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // teclado entrada de dados
		
		//Para ler um número com ponto flutuante
		System.out.println("DIGITE O RAIO DO CÍRCULO:");
		double z;
		double pi=3.14159;
		z = sc.nextDouble(); 
		
		double area_circulo=pi * Math.pow(z, 2.0); 

		System.out.printf("ÁREA DO CIRCULO: %.4f%n", area_circulo);
		System.out.println();
		
		sc.close();

	}

}
