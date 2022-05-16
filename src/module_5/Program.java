package module_5;


public class Program {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Sarah Blades", 21000.00);
		System.out.println(b1.displayBankAccount());
		System.out.printf("Customer name: %s\n", b1.getCustomerName());
		System.out.printf("Account Number: %d\n", b1.getAccountNumber());
		System.out.printf("Balance: £%.2f\n", b1.getAccountBalance());
		b1.setBalance(87000);
		System.out.println(b1.displayBankAccount());
		
		BankAccount b2 = new BankAccount("Sarah Blades", 53000.00);
		System.out.println(b2.displayBankAccount());
		b2.deposit(16000);
		System.out.println(b2.displayBankAccount());
		
		BankAccount b3 = new BankAccount("Sarah Blades", 48500.00);
		System.out.println(b3.displayBankAccount());
		b3.withdraw(5000);
		System.out.println(b3.displayBankAccount());
		
		CurrentAccount c1 = new CurrentAccount("Sarah Blades", 19000, 500);
		System.out.println(c1.displayBankAccount());
		c1.withdraw(19400);
		System.out.println(c1.displayBankAccount());
		c1.withdraw(200);
		System.out.println(c1.displayBankAccount());
		
		SavingsAccount s1 = new SavingsAccount("Sarah Blades", 87000, 0.001);
		System.out.println(s1.displayBankAccount());
		s1.addInterest();
		System.out.println(s1.displayBankAccount());
	}

}
