package assignment4;

import javax.swing.JOptionPane;

public class Number22 {
//22.Write a program to print the table of given number.

public static void main(String[] args) {
	String x=JOptionPane.showInputDialog("Enter the number to print its multiplication table");
	if(x!=null) {
	int num=Integer.parseInt(x);
	
	for(int i=1;i<=10;i++) {
		int mul=num*i;
		System.out.println(num+" * "+i+" : "+mul);
		//JOptionPane.showMessageDialog(null, mul);
	}
}
}
}
