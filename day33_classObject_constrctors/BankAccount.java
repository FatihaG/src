package day33_classObject_constrctors;

public class BankAccount {

	double balance;
	
	
	//this constructor sets the starting balance to 0.0
	public BankAccount() {
		balance=0.0;
	}
	
	public BankAccount(double startBalance) {
		balance=startBalance;
	}
	//ths constructor sets the starting balance to have value in the string argument
	public BankAccount(String str) {
		
	balance=Double.parseDouble(str);
	}
	//deposit method makes a deposit into account
	public void deposit(String str) {
		balance=balance+Double.parseDouble(str);
	}
	public double getBalance() {
		return balance;
	}
}