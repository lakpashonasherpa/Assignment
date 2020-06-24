package assignment3;

import javax.swing.JOptionPane;

public class Number17 {
public static void main(String[] args) {
int year=Integer.parseInt(JOptionPane.showInputDialog("Enter the year")); 
String leap=(year%4==0 &&year%100!=0)?"This year is leap year":"this is not leap year";
JOptionPane.showMessageDialog(null, leap);

//	if(year%4==0 &&year%100!=0) {
//	System.out.println("The year you enter is leap year");
//}else {
//	System.out.println("The year is not leap year");
//}
}
}
