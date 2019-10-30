
public class Main {

	public static void main(String[] args) {
		//Exemplo 1
		
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();

		//Exemplo 2
		int z;
		double w;
		z = 5;
		w = 2 * x;
		System.out.println(z);
		System.out.println(w);
		
		System.out.println();
		
		//Exemplo 3 Calcula a Area do trapezio
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);

		System.out.println();

		//Exemplo 4
		int a4, b4;
		double resultado;
		a4 = 5;
		b4 = 2;
		resultado = a4 / b4; // int não exibirá decimais
		System.out.println(resultado);

		System.out.println();

		resultado = (double) a4 / b4; // exibirá decimais >> casting
		System.out.println(resultado);
		
		System.out.println();
		
		//Exemplo 5
		double a5;
		int b5;
		a5 = 5.0;
		b5 = (int) a5;
		System.out.println(b5);

		
		

		
		
	}

}
