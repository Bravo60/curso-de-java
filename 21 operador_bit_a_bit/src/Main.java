
public class Main {

	public static void main(String[] args) {
		/*
		& Opera��o "E" bit a bit
		| Opera��o "OU" bit a bit
		^ Opera��o "OU-exclusivo" bit a bit
		
		Demo
        0101 1001   >>>> &: 0001 1000 (24)
        0011 1100        |: 0111 1101 (125)
                         ^: 0110 0101 (101)
		*/
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

	}

}
