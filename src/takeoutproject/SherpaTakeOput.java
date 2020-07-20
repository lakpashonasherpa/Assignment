package takeoutproject;

public class SherpaTakeOput {
public  void displayMainMenu() {
	System.out.println("The following are the Food Menu that we serve");
	System.out.println("1. Italian Food ");
	System.out.println("2. American Food ");
	System.out.println("3. Chinese Food ");
}
public  void displayItalianFoodMenu() {
	System.out.println("Italian Food Lists");
	System.out.println("------------------");
	System.out.println("1.Lasagna Tray ");
	System.out.println("2.Pizza Pack");
	System.out.println("3.Gazpacho Soup, salad and bread sticks pack");
	//System.out.println("Choose what type of food you'd like to order:");

}
public  void displayChineseMenu() {
	System.out.println("Chinese Food Lists");
	System.out.println("-------------------");
System.out.println("1.Chicken and Broccoli Tray(includes 7 wonton soups, 7 egg rolls)");
System.out.println("2.Sweet and Sour Pork Tray(includes 7 hot and sour soupd, 7 egg rools)");
System.out.println("3.Shrimp Fried Rice Tray(includes 10 egg rolls)");

}
public  void displayAmericanMenu() {
	System.out.println("American Food Lists");
	System.out.println("--------------------");
	System.out.println("1.Hamburger and Hot Dog Tray-includes buns and condiments");
	System.out.println("2.Grilled Chicken Sandwich and Mozzarella Sticks Tray-includes dipping sauces");
	System.out.println("3.Barbeque Tray-includes buns and peach cobber");
}
public int determineTrays(int people, int feeds) {
	int trays=people/feeds;

	return trays;
}
public  double getSubtotal(double price, int trays) {
	
	double costs=price*trays;
	
	return costs;

}

public  double getTax(double subtotal, double taxrate) {
	double tax= subtotal*taxrate;
	return tax;
}
public  double getTips(double subtotal, double tiprate) {
	double tips=subtotal*tiprate;
	
	return tips;
}
public  double getGrandTotal(double subtotal, double tax, double tip) {
	double total=subtotal+tax+tip;
	return total;
}
public  double pricePerPerson(double grandTotal, int people) {
	double pricePerson =grandTotal/people;
	return pricePerson;
}
public  int determineLeftOvers(int feeds, int trays, int people) {
	int leftover=feeds*trays-people;
	return leftover;
}

}
