package assignment2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Number10 {
	public static void main(String[] args) {
		//10.	Write a Program for the following Mathematical Function.
		//a.	s=u*t+(a*t*t)/2 m
		
	//	b.area=sqrt(s*(s-a)(s-b)(s-c)	 
		//c.x=(-b +sqrt(b*b-4*a*c))	 
		
		//final double a=9.8;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the initial velocity m/s: ");
		double u=input.nextDouble();
		System.out.print("Enter the final velocity m/s: ");
		double v=input.nextDouble();
		System.out.print("Enter the time travel in seconds: ");
		float t=input.nextFloat();
		Number10.calculateDistanceTravel(u, v, t);
		
		System.out.println("====================================");
		//JOptionPane.showMessageDialog(null,"Enter the Length of a side of Triangle");
		System.out.println("Lest calculate the Area of a triangle");
		System.out.print("Enter the length of side 1 a: ");
		double s1=input.nextDouble();
		System.out.print("Enter the length of side 2 b: ");
		double s2=input.nextDouble();
		System.out.print("Enter the length of side 3 c: ");
		double s3=input.nextDouble();
		Number10.calculateAreaOfTriangel(s1,s2,s3);
		
		System.out.println("=====================================");
		System.out.println("Compare your equation with ax^2+bx+c=0");
		System.out.print("Enter the value of a: ");
		int a=input.nextInt();
		System.out.print("Enter the value of b: ");
		int b=input.nextInt();
		System.out.print("Enter the value of c: ");
		int c=input.nextInt();
		Number10.calculateValueOfX(a,b,c);
		
		//System.out.println("Enter the length of a side of a triangle");
		

		
	}
	
	public static void calculateDistanceTravel( double initialVelocity, double finalVelocity, float time ) {
		
		double a= (finalVelocity-initialVelocity)/time;
		double distance=initialVelocity*time+(a*time*time)/2;
		System.out.println("The calculated distance travelled in meter is "+distance);
		
	}
	public static void calculateAreaOfTriangel(double side1,double side2,double side3) {
		double s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("The area of the give triangel is: "+area);
		
		
	}
	public static void calculateValueOfX(int a,int b,int c) {
		double x=(double)(-b+Math.sqrt(b*b-4*a*c))/(2*a*c);
		System.out.print("The value of x for the given equation is:"+x);
		
		
	}

}
