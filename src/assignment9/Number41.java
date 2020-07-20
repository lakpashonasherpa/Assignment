package assignment9;

import java.util.Scanner;

public class Number41 {
	public static void findDuplicate(String word) {
		
		char[] ar=word.toCharArray();
		
		for (int i = 0; i <ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j]) {
					System.out.println("The duplicate latter in "+word+" are : "+ar[j]);
			
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the string to check the duplicates");
		try {
			String string=input.next();
			findDuplicate(string);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			input.close();
		}

	}

}
