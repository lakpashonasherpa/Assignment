package takeoutproject;

import java.util.Scanner;

public class TestTakeOut {
	public static void main(String[] args) {
		SherpaTakeOput  obj=new SherpaTakeOput();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of people would you like to order for");
		int people=input.nextInt();
		
		if(people>=10 && people<=100) {

		obj.displayMainMenu();
		System.out.println("CHOSE TYPE OF MEAL");
		int choice=input.nextInt();
		int feeds,trays;
		double price, subtotal,tax,tips,total,perperson,leftover;
		double taxrate=0.07;
		double tiprate=0.15;
		
		switch (choice) {
		case 1:
			
			obj.displayItalianFoodMenu();
			System.out.println("CHOSE ONE");
			choice=input.nextInt();
			if(choice==1) {
				feeds=5;
				price=17.99;
				
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
				
			}
			if(choice==2) {
				feeds=7;
				price=15.99;	
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
			}
			if(choice==3) {
				feeds=4;
				price=12.99;
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
				
			}
			
			break;
		case 2:
			obj.displayAmericanMenu();
			System.out.println("CHOSE ONE");
			choice=input.nextInt();
			if(choice==1) {
				feeds=7;
				price=18.99;
				
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
				
			}
			if(choice==2) {
				feeds=5;
				price=22.99;	
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
			}
			if(choice==3) {
				feeds=10;
				price=26.99;
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
				
			}

			
			break;
		case 3:			
			obj.displayChineseMenu();
			System.out.println("CHOSE ONE");
			choice=input.nextInt();
			if(choice==1) {
				feeds=7;
				price=18.99;
				
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
				
			}
			else if(choice==2) {
				feeds=7;
				price=18.99;	
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				System.out.println("Leftover servings for the delivery person"+leftover);
			}
			else if(choice==3) {
				feeds=5;
				price=18.99;
				trays=obj.determineTrays(people, feeds);
				subtotal=obj.getSubtotal(price, trays);
				tax=obj.getTax(subtotal, taxrate);
				tips=obj.getTips(subtotal, tiprate);
				total=obj.getGrandTotal(subtotal, taxrate, tips);
				perperson=obj.pricePerPerson(total, people);
				leftover=obj.determineLeftOvers(feeds, trays, people);

				
				
				System.out.println("You need "+trays+" trays");
				System.out.println("Feeds: "+feeds);
				System.out.println("Price for "+people+" people ("+trays+") trays is: $"+subtotal);
				System.out.println("Tax :$"+tax);
				System.out.println("Tip : $"+tips);
				System.out.println("Total (food, tax,tip): $"+total);
				System.out.println("Price per person: $"+perperson);
				
			}
			else {
				System.out.println("enter the valide choice");
			}
						
			break;
		default:
			System.out.println("Please select the right menu");
			break;
			}
		
		}	else
		{
			System.out.println("you have enter the invalid number.");
		}

		
		
		
		
		System.out.println("Thanks you for your business with us!!!!");
		input.close();
		
	}

}
