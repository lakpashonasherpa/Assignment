package assignment9;

import java.util.Scanner;

//39.	Write a Program to display name in short form. 
//E.g. Ram Kishore Singh  -> R. k. Singh
public class Number39 {
	
	public static void nameInShortForm(Scanner input) {
		System.out.println("Enter the full name");
		String name = input.nextLine();
		String[] arr = name.split(" ");

		System.out.print(arr[0].charAt(0) + ". " + arr[1].charAt(0) + ". " + arr[arr.length - 1]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {

			nameInShortForm(input);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			input.close();
		}
	}

}
