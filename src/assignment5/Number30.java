package assignment5;

import java.util.Scanner;

public class Number30 {
	public static void fibonacciSeries(int n) {
		int a=0;
		int b=1;
		int c;
		System.out.print(b+" ");
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
		}
	}
	
	//1,1,2,3,5,8,13
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter the number of series");
	int num=input.nextInt();
	Number30.fibonacciSeries(num);
	input.close();
	
}
}
