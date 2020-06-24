package assignment4;

import javax.swing.JOptionPane;

public class Number23 {

	//23.	Write a Program to sum 1 to nth natural numbers.
	public static void main(String[] args) {
		String x=JOptionPane.showInputDialog("Enter any Number");
		
		int sum=0;
		if(x!=null) {
			int num=Integer.parseInt(x);
			for(int i=1;i<=num;i++) {
				sum+=i;
				
			}
			JOptionPane.showMessageDialog(null, "Sum of "+num+" natural number : "+sum);
		}
		
	}

}
