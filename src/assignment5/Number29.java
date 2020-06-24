package assignment5;

import java.util.Scanner;

public class Number29 {
	
	public static void sumOfNthterm(int n) {
		
		double sum=0.0;
		double factor=1;
		
		
		for(int i=1;i<=n;i++) {
		
			factor=factor*i;
			sum=sum+(i/factor);
		
		}
		System.out.println(sum);
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nth term ");
		int num=input.nextInt();
		Number29.sumOfNthterm(num);
		input.close();
				
	
	}
	

}
