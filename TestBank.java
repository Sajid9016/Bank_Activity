package BankActivity;

public class TestBank {

	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.setAcname("Adnan");
		acc.setEmail("adnan@gmail.com");
		acc.setBalance(5000);
		
		Transaction tcs=new Transaction();
		
		
			tcs.deposit(acc,2000);
		System.out.println(acc);
	
		tcs.withdraw(acc, 1000);
		System.out.println(acc);
	}

}
