package module_5;

public class CurrentAccount extends BankAccount {
	
	private double overdraft_limit;

	public CurrentAccount(String customer_name, double balance, double overdraft_limit) {
		super(customer_name, balance);
		this.overdraft_limit = overdraft_limit;
	}
	
	// Using setter method to set value for overdraft limit
	public void setOverdraftLimit(double overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}
	
	public void withdraw(double withdrawal_amount) {		
		if (Math.abs(super.getAccountBalance() - withdrawal_amount) <= this.overdraft_limit) {
			super.withdraw(withdrawal_amount);
		}
		else {
			System.out.println("Withdrawing that amount will take you over your overdraft limit");
		}
	}
	
	public String displayBankAccount() {
		return super.displayBankAccount() + "\tOverdraft limit: " + this.overdraft_limit;
	}
	
}