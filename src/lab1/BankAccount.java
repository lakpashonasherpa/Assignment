package lab1;



public class BankAccount {
	private String name;
	private double initialBalance;
	//private int accountNum;
	private static int accountNumber=(int) Math.random();
	
	
	public BankAccount(String name) {
		this.name=name;
		this.initialBalance=0.0;
		accountNumber++;
		display();
		
		
	}
	public BankAccount( String name,double initialBalance) {
		this.name=name;
		this.initialBalance=initialBalance;
		accountNumber++;
		display();
		
	}
	

	public void deposit(double depositAmmount) {
		this.initialBalance= initialBalance+depositAmmount;
		display();
	
	}
	
	public  void deposit(double depositAmmount,double interest) {
		initialBalance=initialBalance+depositAmmount;
		initialBalance=initialBalance*interest/100;
		
		display();
	
	}
	public void withdraw(double withdrawAmt) {
		initialBalance =initialBalance-withdrawAmt;
		display();	
	}

	public void withdraw(double withdrawAmt, double fee) {
		initialBalance =initialBalance-withdrawAmt-fee;
		
		display();
	}
	
	
	public  void display() {
		System.out.println("============================");
		System.out.println("Name of account hoolder is: "+name);
		System.out.println("Account Number  is: "+accountNumber);
		System.out.println("Account Balance is: $"+initialBalance);
		System.out.println("=============================");
	}
	

	
	
}
