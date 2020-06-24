package assignment2;

import javax.swing.JOptionPane;

public class Number6 {
	final static double VALUE_OF_PI=Math.PI;
	public static void main(String[] args) {
		//6.Write a program to find the perimeter of circle, triangle, and rectangle.
		JOptionPane.showMessageDialog(null,"You are calculating perimater of a circle please click on ok");
		double r=Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of a circle"));
		Number6.perimeterOfCircle(r);
		
		JOptionPane.showMessageDialog(null,"You are calculating perimater of a Triangle please click on ok");
		
		double s1 =Double.parseDouble(JOptionPane.showInputDialog("Enter the length of triangle side 1"));
		double s2=Double.parseDouble(JOptionPane.showInputDialog("Enter the length of triangle side 2"));
		double s3=Double.parseDouble(JOptionPane.showInputDialog("Enter the length of triangle  side 3"));
		Number6.perimeterOfTriangle(s1, s2, s3);
		
		JOptionPane.showMessageDialog(null,"You are calculating the perimeter of Rectangle please click ok");
		double l=Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle"));
		double b=Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the rectangle"));
		Number6.perimeterOfRectangle(l, b);
		JOptionPane.showMessageDialog(null, "Thanks you for your input!!");
		
	}
	
	public static void perimeterOfCircle(double radius) {
		double perimeter=2*VALUE_OF_PI*radius;
		JOptionPane.showMessageDialog(null, "Perimeter of a Circle is"+perimeter);
		
		
	}
	public static void perimeterOfTriangle(double side1,double side2,double side3 ) {
		double perimeter=side1+side2+side3;
		JOptionPane.showMessageDialog(null, "Perimeter of a triangle is"+perimeter);
		
	}
	public static void perimeterOfRectangle(double length, double breadth) {
		double perimeter =2*(length+breadth);
		JOptionPane.showMessageDialog(null, "Perimeter of the rectangle is"+perimeter);
		
		
	}

}
