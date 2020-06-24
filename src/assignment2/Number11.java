package assignment2;

public class Number11 {
//11.	Write a program to swap two numbers
	//a) using temp variable
	//b) without temp variable

	public static void main(String[] args) {
		
	Number11.swap(4, 5);
	Number11.swapWithoutTemp(10, 20);
		
		
	}
	public static void swap(int a, int b) {
		System.out.println("Before swapping a is: "+a+" b is: "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a is: "+a+" b is: "+b);
	}
	public static void swapWithoutTemp(int a, int b) {
		System.out.println("Before Swapping a is: "+a+" b is: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a is: "+a+" b is: "+b);
	}

}
