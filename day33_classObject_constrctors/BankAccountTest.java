package day33_classObject_constrctors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		String input;
		System.out.println("What is your starting balance?");
		input=sc.next();
		
		BankAccount account =new BankAccount(input);
		
		System.out.println("How much were you paid this month?");
		
		input=sc.next();
		
		account.deposit(input);
		
		System.out.println("your pay has been deposited.your current balance is: "+account.getBalance());
		
		
		
	}

}
