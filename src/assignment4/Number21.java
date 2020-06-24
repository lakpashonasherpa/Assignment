package assignment4;

import javax.swing.JOptionPane;

//21.Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
public class Number21 {
	
public static void main(String[] args) {
	String s=JOptionPane.showInputDialog("Enter the number to see the equivalent name of the week");
	//int num=Integer.parseInt(s);
	if(s!=null) {
		int num=Integer.parseInt(s);
		switch(num) {
		case 1:
			JOptionPane.showMessageDialog(null, "Monday");
			
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Tuesday");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Wednesday");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Thrusday");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Friday");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Saturday");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sunday");
			break;
			
		default:
			System.out.println("Enter the number valid number ");
			break;

		
		
		}
	}
}
}
