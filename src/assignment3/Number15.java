package assignment3;

import java.util.Scanner;

public class Number15 {

	public static void main(String[] args) {
		//15.Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
//		char a='A';
//		int acs=a;
//		char c=(char)acs;
//		System.out.println(a);
//        System.out.println(acs);
//        System.out.println(c);
//        
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter the ASCII code (0-128) to see its equivalent character:");
        int ascii=input.nextInt();
        for(int i=0;i<=128;i++) {
        
        	if(ascii==i) {
        	char c=(char)i;
        	System.out.println("The character for the given input is: "+c);
                 }
                }
        input.close();
           }
	

      }


