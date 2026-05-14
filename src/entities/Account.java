package entities;

public class Account {

	public int accountNumber;
	public String name;
	public double balance;

	public Account() {
	}

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public double withdraw(double amount) {
		return balance -= amount + 5.0;
	}

	public double deposit(double amount) {
		return balance += amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
}
