public class MainClass {
	public static void main(String[] args) {
		int temperature = 10;

		// Create a new coffee cup and set the temperature of it
		CoffeeCup cup = new CoffeeCup(temperature, 150);
		// Create and serve a virtual customer.
		VirtualPerson cust = new VirtualPerson();
		VirtualCafe.serveCustomer(cust, cup);
	}
}
