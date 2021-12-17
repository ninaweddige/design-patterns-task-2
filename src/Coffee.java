public class Coffee extends HotDrink {
    private static double price = 0.60;
    private static final String description = "COFFEE";

    public Coffee(){}

    @Override
    public String getHotDrinkDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
