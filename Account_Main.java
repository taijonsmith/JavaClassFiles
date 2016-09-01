package assignment3package;

import java.util.Scanner;

public class Account_Main {

	public static void main(String[] args) {
		double withdraw;
		double deposit;
		double balance;
		String name;
		int acctNumber;
		final double fee = 5;
		
		Scanner scan = new Scanner(System.in);
		//user information
		System.out.println("What is your name? ");
		name = scan.next();
		System.out.println("What is your account number? ");
		acctNumber = scan.nextInt();
		System.out.println("What is your current account balance? ");
		balance = scan.nextDouble();
		
		Account person = new Account(name, acctNumber, balance);
		//error messages
		System.out.println("Enter an amount to withdraw: ");
		withdraw = scan.nextDouble();
		person.withdraw(withdraw, fee);
		
		System.out.println("\nEnter an amount to deposit: ");
		deposit = scan.nextDouble();
		person.deposit(deposit);		
	}
}