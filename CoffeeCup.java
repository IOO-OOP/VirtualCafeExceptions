class CoffeeCup {
    private int temperature;
    private int content;

    public CoffeeCup(int t, int c) {
        temperature = t;
        content = c;
    }

    public void setTemperature(int t){
        temperature = t;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setContent(int c) {
        content = c;
    }

    public int getContent() {
        return content;
    }
}
