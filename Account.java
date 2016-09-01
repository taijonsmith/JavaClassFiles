package assignment3package;

import java.text.NumberFormat;

public class Account {
	
	private final double RATE = 0.035; //interest rate of 3.5%
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account (String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;	
	}
	
	public double deposit(double amount) {
		//if user tries to deposit negative amount of money, error appears
		if (amount < 0.0) {
			System.out.println("Error: Sorry, you can't deposit a negative amount of"
					+ " money");
		}
		else {
			balance = balance + amount;
		}
		return balance;
	}
	
	public double withdraw(double amount, double fee) {
		//if user tries to withdraw more than he/she has in account, error appears
		if (amount > (balance + fee)) {
			System.out.println("Error: Sorry, your account has insufficient funds");
		}
		else {
			balance = balance - amount - fee;
		}
		return balance;
	}
	
	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}