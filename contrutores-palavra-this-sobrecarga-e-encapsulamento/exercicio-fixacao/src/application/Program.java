package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double deposit;
		
		System.out.printf("Enter account number: ");
		int cod = sc.nextInt();
		sc.nextLine();
	
		System.out.printf("Enter account holder: ");
		String name = sc.nextLine();
		
		Account Account = new Account(cod, name);
		
		System.out.printf("Is therena initial deposit (y/n)? ");
		String resp = sc.next();
		if (resp.equals("y")) {
			System.out.printf("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			Account.addDeposit(deposit);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(Account.toString());
		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		deposit = sc.nextDouble();
		Account.addDeposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(Account.toString());
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		Account.removeDeposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(Account.toString());
		
		sc.close();
	}
}
