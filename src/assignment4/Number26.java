package assignment4;

import java.util.Scanner;

public class Number26 {
	public static void main(String[] args) {
		//26.	Write a Program to reverse the given number. //123 => 321
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=input.nextInt();//123==321
		int reverse=0;
		while(num!=0) {
			reverse =reverse *10;
			reverse=reverse+num%10;
			num=num/10;
			
		}
		System.out.println(reverse);
		input.close();
	}
}
