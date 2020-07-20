package assignment9;

import java.util.Scanner;

//40.	Write a program to reverse the string.
public class Number40 {
	public static void reverse(String word) {
		String reverse="";
		for (int i = word.length()-1; i >=0; i--) {
			reverse=reverse+word.charAt(i);
			
		}
		System.out.println("The Reverse of "+word+" is "+reverse);
		
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the word");
		try {
			String word=input.next();
			reverse(word);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			input.close();
		}
		
		
	}

}
