package assignment4;

import javax.swing.JOptionPane;

	//20.Write a program to create the equivalent of a four-function calculator. 
	//The program to enter two integer’s numbers and an operator. 
	//It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers. Finally, it displays the result
	public class Number20 {
	public static void main(String[] args) {
		
	//JOptionPane.showMessageDialog(null, "Enter the first integer");
	String a=JOptionPane.showInputDialog("Enter the value of first integer");
	String operation=JOptionPane.showInputDialog("Enter the operation");
	String b=JOptionPane.showInputDialog("Enter the value of second integer");
	
	if(a!=null &&b!=null &&operation!=null) {
		int val1=Integer.parseInt(a);
		int val2=Integer.parseInt(b);
		
		switch(operation) {
		case"add":
		case"+":
		case"Add":
		case"sum":
		case"Sum":
			int addition =val1+val2;
			JOptionPane.showMessageDialog(null,"The sum of two integer is "+ addition);
		
			break;
		case"-":
		case"Sub":
		case"sub":
			int subtraction =val1-val2;
			JOptionPane.showMessageDialog(null, "The sub of two value is "+subtraction);
			
			break;
		case"*":
		case"Mul":
		case"mul":
			int multiplication=val1*val2;
			JOptionPane.showMessageDialog(null,"The mul of two value is "+ multiplication);
			
			break;
		case"/":
		case"div":
		case"Div":
			int division=val1/val2;
			JOptionPane.showMessageDialog(null, "The div of two value is "+division);
		
			break;
		default:
			System.out.println("Enter the valid operation");
			break;
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	}
	

}
