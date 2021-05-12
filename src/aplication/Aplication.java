package aplication;

import entities.Account;
import exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Aplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
try{
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double whitdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, whitdrawLimit);

		System.out.print("Enter amount for withdraw: ");
		Double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("New balance: $" + String.format("%.2f", account.getBalance()));
	}
catch(WithdrawException a) {
	System.out.println("Error in withdraw: " + a.getMessage());
}
//Exibindo mensagem da exception
	}
}
