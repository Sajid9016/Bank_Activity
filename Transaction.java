package BankActivity;

public class Transaction implements Bank{
	
	public void deposit(Account acc,int amt) {
		int newbal =acc.getBalance() + amt;
		acc.setBalance(newbal);
		System.out.println("$"+amt+"  Deposited Successfull..");
	}
	
	public void withdraw(Account acc,int amt) {
		
		int newbal =acc.getBalance() - amt;
		acc.setBalance(newbal);
		System.out.println("$"+amt+"  Withdrawed Successfull..");
	}
	
}
