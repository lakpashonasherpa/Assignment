package assignment2;

import javax.swing.JOptionPane;

public class Number8 {
	//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Click ok to begain");
		String x=JOptionPane.showInputDialog("Enter the temperature in Celcius");
		if(x!=null)
		{
		double c=Double.parseDouble(x);
		Number8.celciusToFahrenheit(c);
		}
		
		String y=JOptionPane.showInputDialog("Enter the temperature in Fahrenheit");
		if(y!=null) 
		{
		double f= Double.parseDouble(y);
		Number8.fahrenheitToCelcius(f);
		}
		
		JOptionPane.showMessageDialog(null, "Thanks you");
	}
static void fahrenheitToCelcius(double fahrenheit) {
	
	
	double celcius=(fahrenheit-32)*5/9;
	JOptionPane.showMessageDialog(null, "Temperature in Celcius"+celcius);
}
static void celciusToFahrenheit(double celcius) {
	double fahrenheit=celcius*9/5+32;
	JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit"+fahrenheit);
	
	
}
}
