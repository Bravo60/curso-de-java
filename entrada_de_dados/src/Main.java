import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // teclado
		
		//Para ler uma palavra (texto sem espaços)
		System.out.println("(Para ler uma variavel String) DIGITE:");
		String x;
		x = sc.next();
		System.out.println("DADO DIGITADO:" + x);
		System.out.println();
		
		//Para ler um número inteiro
		System.out.println("(Para ler uma variavel int) DIGITE:");
		int y;
		y = sc.nextInt();
		System.out.println("DADO DIGITADO:" + y);
		System.out.println();
		
		//Para ler um número com ponto flutuante
		System.out.println("(Para ler uma variavel double) DIGITE:");
		double z;
		z = sc.nextDouble(); 
		System.out.println("DADO DIGITADO:" + z);
		System.out.println();
		
		System.out.printf("DADO DIGITADO: %.2f%n", z);
		System.out.println();
		
		
		//Para ler um caractere
		System.out.println("(Para ler uma variavel char) DIGITE:");
		char a;
		a = sc.next().charAt(0);
		System.out.println("DADO DIGITADO:" + a);
		System.out.println();
		
		//Para ler vários dados na mesma linha
		System.out.println("(Para ler vários dados separados por espaço na mesma linha) DIGITE  3 DADOS:");
		String b;
		int c;
		double d;
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		//Para ler um texto ATÉ A QUEBRA DE LINHA 
		System.out.println("(Para ler um texto ATÉ A QUEBRA DE LINHA) DIGITE  3 LINHAS:");
		String s1, s2, s3;
		s1 = sc.nextLine(); // linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		
		//Para ler um texto ATÉ A QUEBRA DE LINHA PENDENTE
		System.out.println("(QUEBRA DE LINHA PENDENTE) DIGITE 1 numero int e  3 LINHAS:");
		int j;
		String s4, s5, s6;
		j = sc.nextInt();
		sc.nextLine();
		s4 = sc.nextLine(); // linha inteira
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(j);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		
		sc.close();

	}

}
