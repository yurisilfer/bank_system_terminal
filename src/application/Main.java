package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initital deposit: ");
			double initialAmount = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialAmount);
		} else {
			account = new Account(accountNumber, accountHolder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println("Account " + account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);
		System.out.println("Updated account data: ");
		System.out.println("Account " + account);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawAmount = sc.nextDouble();
		account.withdraw(withdrawAmount);
		System.out.println("Updated account data: ");
		System.out.println("Account " + account);

		sc.close();

	}

}
