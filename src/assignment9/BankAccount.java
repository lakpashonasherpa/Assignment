package assignment9;



public class BankAccount {
	
	static int accountNumber;
	static double initialBalance;
	static double totalBalance;
	public BankAccount() {}
	public BankAccount(int accnum,String name) {
		accountNumber=accnum;
		System.out.println("Welcome to ABC Bank ");
		System.out.println("Name: "+name);
		System.out.println("Initial balance is: $"+initialBalance);

	}
	public BankAccount(int accnum, String name,double initialBalance) {
		accountNumber=accnum;
		System.out.println("Welcome to ABC Bank ");
		System.out.println("Name: "+name);
		System.out.println("Initital Balance is: $"+initialBalance);
	}
	
	
	public void withdraw(double withdrawAmt) {
		double remaining=totalBalance-withdrawAmt;
		totalBalance=remaining;
		System.out.println("Withdraw ammount is: "+withdrawAmt);
	}

	public void withdraw(double withdrawAmt, double fee) {
		double remaining=totalBalance-withdrawAmt-fee*totalBalance;
		totalBalance=remaining;
		System.out.println("Withdraw ammount is: "+withdrawAmt);
		System.out.println("Fee charged is: "+fee);
	}
	
	
	
	public void deposit(double depositAmmount) {
		 totalBalance=initialBalance+depositAmmount;
		System.out.println("Ammount deposited is: $"+depositAmmount);
		
	
	}
	
	public  void deposit(double depositAmmount,int interest) {
		 totalBalance=initialBalance+depositAmmount+(interest*initialBalance)*100;
		System.out.println("Ammount deposited is: $"+depositAmmount);
		System.out.println("Intreste rate is: "+interest+"%");
		
	
	}
	
	
	public  void display() {
		
		System.out.println("Account Number  is: "+BankAccount.accountNumber);
		System.out.println("Total balance remaining in account is: $"+totalBalance);
	
	}
	

	
	
}
