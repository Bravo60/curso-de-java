package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------- for each \"para cada objeto 'obj' contido em vect, fa�a:\"");
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
