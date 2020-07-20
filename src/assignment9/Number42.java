package assignment9;

import java.util.Scanner;

public class Number42 {
	public static void findDuplicateWords(String string) {
		
		String[] ar=string.split(" ");
		
		System.out.println("The duplicates words are:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				
					if(ar[j].equals(ar[i])) {
					System.out.print(ar[i]+" , ");
					
				}
			}
		}
		
	}
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter a long string ");
	try {
	
		String string=input.nextLine();
		findDuplicateWords(string);
		
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		input.close();
	}
	
}
}
