import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // teclado entrada de dados
		
		int a, b, c, d; 
		
		System.out.println("Digite o valor de A (inteiro):");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B (inteiro):");
		b = sc.nextInt();

		System.out.println("Digite o valor de C (inteiro):");
		c = sc.nextInt();

		System.out.println("Digite o valor de D (inteiro):");
		d = sc.nextInt();
		
		int dif=(a*b)-(c*d);

		System.out.printf("ÁREA DO CIRCULO: " + dif);
		
		sc.close();

	}

}
