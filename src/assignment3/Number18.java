package assignment3;

import javax.swing.JOptionPane;

public class Number18 {
	public static void main(String[] args) {
//18.Write a program to display largest number from given three values.
	int n1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
	int n2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
	int n3=Integer.parseInt(JOptionPane.showInputDialog("Enter the third number"));
	if(n1>n2&& n1>n3) {
		System.out.println(n1+" is the largest one.");
	}else if(n2>n1&&n2>n3) {
		System.out.println(n2+" is the largest one.");
	}else {
		System.out.println(n3+" is the largest one.");
	}
	
	
	}

}
