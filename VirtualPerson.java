public class VirtualPerson
{
    private static final int TOO_COLD = 65;
    private static final int TOO_HOT = 85;

    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException
    {
        int temperature = cup.getTemperature();

        if (temperature <= TOO_COLD)
            throw new TooColdException("I cannot drink this! This is too cold!");
        else if (temperature >= TOO_HOT)
            throw new TooHotException("I cannot drink this! This is too hot!");
        else
        	cup.setContent(0);

    }
}

