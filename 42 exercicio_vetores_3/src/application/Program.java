package application;

//import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		Room[] vect = new Room[11];
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			
			System.out.println("Rent #" + i + ":");
			
			System.out.printf("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("Email: ");
			String email = sc.nextLine();

			System.out.printf("Room: ");
			int room = sc.nextInt();
			
			System.out.println();
			
			vect[room] = new Room(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 1; i < vect.length ; i++) {
			if (vect[i] != null) {
				//System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
