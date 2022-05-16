package module_5;

public class SavingsAccount extends BankAccount{
	
	private double interest_rate;
	
	public SavingsAccount(String customer_name, double balance, double interest_rate) {
		super(customer_name, balance);
		this.interest_rate = interest_rate;
	}
	
	public double addInterest() {
		this.balance += this.balance * this.interest_rate;
		return this.balance;
	}
	
}