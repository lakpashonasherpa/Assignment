package assignment2;

import java.util.Scanner;


public class Number5 {
	final static double VALUE_OF_PI=Math.PI;
	
			
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of a Rectangle: ");
		double l=input.nextDouble();
		System.out.println("Enter the breadth of a Rectangle: ");
		double b=input.nextDouble();
		Number5.areOfRectangle(l,b);
		
		System.out.println("======================");
		
		System.out.println("Enter the radious of a circle: ");
		double r=input.nextDouble();
		Number5.areaOfCircle(r);
		
		System.out.println("======================");
		System.out.println("Enter the height of the triangle:");
		double h1=input.nextDouble();
		System.out.println("Enter the base of a triangle:");
		double b1=input.nextDouble();
		Number5.areaOfTriangle(h1, b1);
		
		
		
		
}
public static void areOfRectangle(double len,double bdth) {
		
		double area=len*bdth;
		System.out.println("The area if the triangle whose length is "+len+" and breadth is "+bdth+" is: "+area);
		
	}
	
	
	public static void areaOfTriangle(double height,double base) {
		double area =(height*base)/2;
		System.out.println("The area of triangle whose height is "+height+" and base is "+base+" is: "+area);
		
	
	}
	
	public static void areaOfCircle(double radius) {
		double area =VALUE_OF_PI*radius*radius;
		System.out.println("The area of circle whose radius "+radius+" is: "+area );
		
	
	}
}
