package assignment10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//44.	Write a program to store name and address of
//10 students in file and search address by given name.
public class Number44 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for(int i=0;i<2;i++) {
		
		
	//List<Integer>=new ArrayList<>();
		
		try( FileWriter write =new FileWriter("C:/Users/lSherpa/Desktop/New folder/file1.txt");
			 PrintWriter pwrite=new PrintWriter(write);
				) {
			String line=null;
			while((line=input.nextLine())!="END") {

				System.out.println("Enter the name");
				String name=input.nextLine();
				pwrite.print(name);
				pwrite.println(" ");
				System.out.println("Enter the Address");
				String address=input.nextLine();
				pwrite.print(address);
			
			}
			System.out.println("written");
	
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	}
}
