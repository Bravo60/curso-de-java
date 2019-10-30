package entities;

public class Account {
	
	private int account;
	private String holder;
	private double balance;
	
	public Account(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

/*	public void setAccount(int account) {
		this.account = account;
	}*/

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	/*public void setBalance(double balance) {
		this.balance = balance;
	}*/
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount+5.00;
	}
	
	public String toString() {
		return "Acount: " + account + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	

}
