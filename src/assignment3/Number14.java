package assignment3;

import javax.swing.JOptionPane;

public class Number14 {
public static void main(String[] args) {
	//14.	Write a program to relate two integers entered by user using = =or > or < sign.
 int a=Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer"));
 int b =Integer.parseInt(JOptionPane.showInputDialog("Enter the second integer"));
 
 if(a>b) {
	 JOptionPane.showMessageDialog(null, a+" is greater than "+b);
 }else if(a==b) {
	 JOptionPane.showMessageDialog(null, a+" is equal to "+b);
 }else if(a<b) {
	 JOptionPane.showMessageDialog(null, a+" is less than "+b);
 }
System.out.println("Exit");
 }
}
