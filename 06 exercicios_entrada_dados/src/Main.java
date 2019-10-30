import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // teclado entrada de dados
		
		System.out.println("1o Numero Inteiro:");
		int y;
		y = sc.nextInt();
		
		System.out.println("2o Numero Inteiro:");
		int x;
		x = sc.nextInt();
		
		int z = x+y;
		System.out.println("SOMA:" + z);
		System.out.println();
		
		
		
		sc.close();	
	}

}
