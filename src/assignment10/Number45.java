package assignment10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//45.Write a program to find the duplicate name (word) in a file.
public class Number45 {
	public static void main(String[] args) {
		
		String path="C:\\Users\\lSherpa\\Desktop\\New folder\\demo2.txt";
		returnDuplicateWords(path);
	
	}
	

	public static void returnDuplicateWords(String path) {
	
		try (	FileReader file= new FileReader(path);
				BufferedReader br=new BufferedReader(file);
				){
			
			String line=null;
			System.out.println("The Duplicate words in a file are:");
			
			while((line=br.readLine())!=null) {
					String s=line;
					String[] arr=s.split(" ");
					
					for (int i = 0; i < arr.length; i++) {
						for (int j = i+1; j < arr.length; j++) {
							if(arr[i].equals(arr[j])) {
								System.out.println(arr[j]);
							}
						}
					}
				}
	} catch (FileNotFoundException e2) {
		e2.printStackTrace();
	} catch (IOException e2) {
		e2.printStackTrace();
	}
 }
}