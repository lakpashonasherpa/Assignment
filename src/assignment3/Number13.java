package assignment3;

import java.util.Scanner;

public class Number13 {
	public static void main(String[] args) {
		//13.Write a program to print the number entered by user only if the number entered is negative.
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=input.nextInt();
		if(num<0) {
			System.out.println("you have enter: "+num);
		}else {
			System.out.println("Enter the negative number");
		}
	}

}
