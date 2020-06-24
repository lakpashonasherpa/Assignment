package assignment3;

import java.util.Scanner;

public class Number19 {
public static void main(String[] args) {
	//19.Write a Program to accept three sides of triangle and display which kind of triangle is formed.
	Scanner input =new Scanner(System.in);
	System.out.print("Enter the value of side a of a triangle: ");
	int a=input.nextInt();
	
	System.out.print("Enter the value of second side b of a triangl: ");
	int b=input.nextInt();
	System.out.print("Enter the value of third side of a triangle: ");
	int c=input.nextInt();
	if(a==b&&b==c) {
		System.out.println("Equilateral triangle.");
	}else if(a==b||a==c||b==c) {
		System.out.println("Isoceles triangle.");
	}else {
		System.out.println("Scalene triangle.");
	}
}
}
