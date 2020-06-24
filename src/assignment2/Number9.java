package assignment2;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Number9 {
//9.	Write a program that converts pounds into kg. The program prompts the user to enter number of pounds, 
	//converts it to kg and displays the result [1 pound is 0.454 kg].
	public static void main(String[] args) {
		String pp=JOptionPane.showInputDialog("Enter the weight in pound");
		if (pp!=null) {
		double p=Double.parseDouble(pp);
		double conv=p*0.454;
		JOptionPane.showMessageDialog(null, "Weight in kg is "+conv);
		}
	
	/*
	
	public static void main(String[] args) {
		
	
	JTextField username = new JTextField();
	JTextField password = new JPasswordField();
	Object[] message = {
	    "Username:", username,
	    "Password:", password
	};

	int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
	if (option == JOptionPane.OK_OPTION) {
	    if (username.getText().equals("lakpa") && password.getText().equals("user123")) {
	        System.out.println("Login successful");
	    } else {
	        System.out.println("login failed");
	    }
	} else {
	    System.out.println("Login canceled");
	}
		
	}*/
	
	}
	
	
}

