package assignment9;

import java.util.Scanner;

//38.	Write a program to check whether given string is palindrome or not.
public class Number38 {
	
	public static void isPalindrome(String word) {
		String reverse="";
		for (int i = word.length()-1; i>=0; i--) {
			reverse=reverse+word.charAt(i);
			
		}
		if (reverse.equals(word)) {
			System.out.println("The word you enter is a palindrome ");
			
		}else {
			System.out.println("It is not a palindrome ");
		}
	}
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter the word you like to check");
	try {
		String word=input.next();
		isPalindrome(word);
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		input.close();
	}
	
	
	
	
	
}
}
