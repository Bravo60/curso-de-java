import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // teclado entrada de dados
		
		String f;
		int h;
		double v;
		
		System.out.println("Digite o Nome do Funcion�rio:");
		f = sc.next();
		
		System.out.println("Digite as Horas Trabalhadas:");
		h = sc.nextInt();
		
		System.out.println("Digite o Valor/Hora:");
		v = sc.nextDouble();
		
		System.out.printf("Funcion�rio: ", f);
		System.out.println();
		
		System.out.printf("Sal�rio: R$ %.2f%n", v*h);
		 
		
		
		sc.close();

	}

}
