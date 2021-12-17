public class SugarDecorator extends HotDrinkDecorator{
    private HotDrink hotDrink;
    private final static String description = "SUGAR";
    private static double price = 0.05;

    public SugarDecorator(HotDrink hotDrink){
        this.hotDrink = hotDrink;
    }

    @Override
    public String getHotDrinkDescription() {
        return hotDrink.getHotDrinkDescription() + " with " + description;
    }

    @Override
    public double getPrice() {
        return hotDrink.getPrice() + price;
    }
}
