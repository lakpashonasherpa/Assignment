package assignment2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Number3 {
	public static void main(String[] args) {
	//3.Write a program to find sum and average of two numbers input by User (using Scanner class).
	
	
	int a=Integer.parseInt(JOptionPane.showInputDialog("Enter a:"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Enter b:"));
	int sum=a+b;
	int avg=sum/2;
	
	JOptionPane.showMessageDialog(null, "Sum is: "+sum);
	JOptionPane.showMessageDialog(null, "Avg is: "+avg);
	
	}

}
