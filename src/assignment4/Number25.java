package assignment4;

import javax.swing.JOptionPane;

public class Number25 {
	//25.Write a program that prompts the user to enter the number of students and each student’s name and score. 
	//Finally display the student with highest score.
public static void main(String[] args) {
	String z=JOptionPane.showInputDialog("Enter the number of students");
	
	
	
if(z!=null) {
	int num=Integer.parseInt(z);
	String studentName="";
	int maxScore=0;
	
	
	for(int i=1;i<=num;i++) {
		String x=JOptionPane.showInputDialog("Enter the name");
		String name=x;
		String y=JOptionPane.showInputDialog("Enter the score");
		int score=Integer.parseInt(y);
		if(score>maxScore) {
			maxScore=score;
			studentName=name;
			
		}
		
	}
	System.out.println("Student with hightst score is "+studentName+" "+maxScore);
	
}
System.out.println("exit");
}
}
