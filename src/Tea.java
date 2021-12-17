public class Tea extends HotDrink {
    private static double price = 0.5;
    private static final String description = "TEA";

    @Override
    public String getHotDrinkDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
