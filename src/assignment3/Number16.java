package assignment3;

import java.util.Scanner;

public class Number16 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number: ");
		double num=input.nextDouble();
		if(num%2==0) {
			System.out.println("It is even :");
			}
		else {
			System.out.println("It is not odd");
		}
	}

}
