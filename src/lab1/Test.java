package lab1;



public class Test {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount("lakpa");
		obj.deposit(50000.00);
		obj.withdraw(20000.00);
		obj.display();
		
		System.out.println("=========================");
		obj.deposit(25000, 3);
		obj.display();
		
		System.out.println("==========================");
		BankAccount obj1=new BankAccount("John",10000.00);
		obj1.deposit(10000, 3);
		obj1.withdraw(1000, 0.5);
		obj1.display();
          
		System.out.println("=======================");
		BankAccount obj2=new BankAccount("Ram",45000);
		obj2.display();
		
		
		System.out.println("==================");
		BankAccount obj3= new BankAccount("Smith",45000);
		obj3.deposit(20000);
		obj3.display();
		
		
		
		System.out.println("=================");
		
		
		

	}

}
