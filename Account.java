package BankActivity;

public class Account {
	private String acname,email;
	private int Balance;
	
	
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int Balance) {
		this.Balance = Balance;
	}
	@Override
	public String toString() {
		return "Account [acname=" + acname + ", email=" + email + ", Balance=" + Balance + "]";
	}
	
	
}
