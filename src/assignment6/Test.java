package assignment6;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Assignement6 obj=new Assignement6();
	Scanner input =new Scanner(System.in);
	String decision="";
	do {
		System.out.println("Enter the operation would you like to perform");
		String choice=input.next();
		switch (choice) {
		case "table":
			System.out.println("Enter the number to get the table:");
			int num=input.nextInt();
			obj.table(num);
			break;
		case "factorial":
			System.out.println("Enter the number to see its factorial:");
			 num=input.nextInt();
			obj.factorial(num);
			break;
		case "fibonacci":
			System.out.println("Enter the number to get the fibonacci series:");
			 num=input.nextInt();
			obj.fibonacciSeries(num);
			break;
		case "prime":
			System.out.println("Enter the number to check the prime or not");
			 num=input.nextInt();
			obj.isPrime(num);
			break;
		case "reverse":
			System.out.println("Enter the number to see in revese order");
			 num=input.nextInt();
			obj.reverseIt(num);
			break;
		case "sumofnth":
			System.out.println("Enter the number to seethe sum of 1 to nth term");
			 num=input.nextInt();
			obj.sumOfnth(num);
			break;

		default:
			System.out.println("You have made incorrect operation ");
			break;
		}
		System.out.println("Would you like to perform next operation");
		decision=input.next();
	} while (decision.equalsIgnoreCase("yes"));
	
	System.out.println("Thank you hope you like the output\nHave a nice day");
input.close();	
}
}
