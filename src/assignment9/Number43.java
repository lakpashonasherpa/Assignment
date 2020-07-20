package assignment9;

import java.util.InputMismatchException;
import java.util.Scanner;



//43.	Write a program to trap the exception handling to trap the divided by zero and out of index value in array.
public class Number43 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] ar=new int[2];
		
		try {
			System.out.println("Enter a: ");
			int a=input.nextInt();
			System.out.println("Enter b:");
			int b=input.nextInt();
			System.out.println("try start");
			ar[2] =divide(a,b);
			System.out.println("division is "+ar[2]);
					
			System.out.println("try end");
		}catch (ArithmeticException|InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("exit");
		input.close();
	}

	public static int divide(int a, int b) {
		
		return a/b;
	}

	

}
