package assignment4;

import java.util.Scanner;

public class Number27Part2 {
public static void main(String[] args) {

	Scanner input =new Scanner(System.in);
	
	System.out.println("Enter the number");
		int num=input.nextInt();
		
		int product=1;
		
		while(num!=0) {
			
			product= product * (num%10);
			
			num=num/10;
			
		}
		System.out.println("The product of each digit is: "+product);
		input.close();
	}

}

