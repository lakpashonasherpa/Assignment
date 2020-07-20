package assignment5;

import java.util.Scanner;

public class Number28 {
	//28.	Write a program in single class having the following methods.
	//a.	isPrimenumber(int)
	//b.	firstNthPrime(int )
	//c.	allPrimebetween(int start , int  end)


public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number");
	int num=input.nextInt();
	int i;
	
	if(num==0&&num==1) {
		System.out.println(num+" is not prime");
	} else {
	
		for( i=2;i<num;i++) {
			
			if(num%i==0) {
				
				System.out.println(num+" is not prime");
				break;
			}
			
		}
		if(num==i) {
			System.out.println(num+" is prime");
			
		}
		
		input.close();
	}






}
	   
	
}

