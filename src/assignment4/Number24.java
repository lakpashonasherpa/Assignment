package assignment4;

import javax.swing.JOptionPane;



public class Number24 {
	//24.	Write a program to print the factorial number of given numbers.
public static void main(String[] args) {
	String s=JOptionPane.showInputDialog("Enter any number");
int fact=1;

	if(s!=null) {
	
		int num=Integer.parseInt(s);
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		
		}
		System.out.println("Factorial of "+num+"! is"+fact);
	JOptionPane.showMessageDialog(null, "Factorial of "+num+"! is"+fact);
		
	}
}

public int factorial() {

	
	
	
	return 0;
}


}
