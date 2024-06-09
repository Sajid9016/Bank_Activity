package BankActivity;

public interface Bank {
	int MIN =1000;
	int DEPOSIT_LIMIT = 20000;
	int WITHDRAW_LIMIT =10000;
	
	public void deposit(Account acc,int amt);
	public void withdraw(Account acc,int amt);
}
