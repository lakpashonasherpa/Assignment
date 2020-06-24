package assignment2;

import java.util.Scanner;

public class Number12 {
//12.	Write a program to accept the roll, name, and nationality of the person and display those values in good format way.

public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter the name");
	String name=input.nextLine();
	System.out.println("Enter the nationality");
	String nationality=input.next();
	System.out.println("Enter the roll");
	int roll=input.nextInt();
	
	
	
	
	
	System.out.println("======================");
	System.out.println("Roll number is: "+roll);
	System.out.println("The name is: "+name);
	System.out.println("The nationality is: "+nationality);
	
}
}
