public class VirtualCafe {
	public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) {
        try {
            cust.drinkCoffee(cup);
            System.out.println("Coffee is just right.");

        }
        catch (TooColdException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            // Deal with an irate customer...
        }
        catch (TooHotException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            // Deal with an irate customer...
        }
    }
}

