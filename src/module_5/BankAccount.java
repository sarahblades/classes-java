package module_5;


public class BankAccount {
	
	protected String customer_name;
	protected int acc_number;
	protected double balance;
	private static int auto_acc_number = 100000;
	
	public BankAccount(String customer_name, int acc_number, double balance) {
		this.customer_name = customer_name;
		this.acc_number = acc_number;
		this.balance = balance;
	}
	
	public BankAccount(String customer_name, double balance) {
		this.customer_name = customer_name;
		this.balance = balance;
		this.acc_number = auto_acc_number;
		auto_acc_number += 1;
	}
		
	public void setCustomerName(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public void setAccountNumber(int acc_number) {
		this.acc_number = acc_number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return this.customer_name;
	}
	
	public int getAccountNumber() {
		return this.acc_number;
	}
	
	public double getAccountBalance() {
		return this.balance;
	}
	
	public String displayBankAccount() {
		String bank_details;
		bank_details = "\nCustomer name: " + this.customer_name + "\tAccount number: " + this.acc_number + "\tBalance: " + this.balance;
		return bank_details;
		//System.out.printf("Customer name: %s\tAccount number: %d\tBalance: %.2f\n", customer_name, acc_number, balance);
	}
	
	public void deposit(double deposit_amount) {
		if (deposit_amount >= 0) {
			this.balance += deposit_amount;
		}
		else {
			System.out.println("Deposit amount can't be negative");
		}
	}
	
	public void withdraw(double withdrawal_amount) {
		if (withdrawal_amount >= 0) {
//			if (balance >= withdrawal_amount) {
				this.balance -= withdrawal_amount;
//			}
//			else {
//				System.out.println("There is not enough money in the account to withdraw that amount");
//			}
		}
		else {
			System.out.println("Withdrawal amount can't be negative");
		}
	}

}
