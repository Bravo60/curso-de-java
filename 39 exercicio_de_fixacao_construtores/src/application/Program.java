package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account accountData;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char question = sc.next().charAt(0);
		
		if (question=='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			accountData = new Account(account, holder, initialDeposit);
		}
		else {
			accountData = new Account(account, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(accountData);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accountData.deposit(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(accountData);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		accountData.withdraw(withdrawValue);
		System.out.println("Updated account data::");
		System.out.println(accountData);

		
		sc.close();
		
	}

}
