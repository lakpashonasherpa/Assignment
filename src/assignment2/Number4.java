package assignment2;

import javax.swing.JOptionPane;

public class Number4 {

	public static void main(String[] args) {
	String pp=JOptionPane.showInputDialog("Enter principle ammount");
	String tt=JOptionPane.showInputDialog("Enter the time:");
	String rr=JOptionPane.showInputDialog("Input the Rate:");
	if(pp!=null&&tt!=null&&rr!=null) {
	
	double p= Double.parseDouble(pp);
	float t=Float.parseFloat(tt);
	float r= Float.parseFloat(rr);
	
	double si=(p*t*r)/100;
	
	JOptionPane.showMessageDialog(null, "Simple Intrest is"+si);
	}
	
	
	
	}

}
