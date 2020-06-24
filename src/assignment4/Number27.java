package assignment4;

import java.util.Scanner;

public class Number27 {
	public static void main(String[] args) {
		//27.	Write a Program to sum each digit of given number as we XX ll as product. 
		//456 =>4*5*6 and 4+5+6
	Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=input.nextInt();
		int sum=0;
		
		while(num!=0) {
			
		sum=sum + num%10;
		
		num=num/10;
	}
		System.out.println("The sum of each digit is: "+sum);
		input.close();
	
		
	}
	
}
