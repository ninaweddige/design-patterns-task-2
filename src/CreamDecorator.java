public class CreamDecorator extends HotDrinkDecorator{
    private HotDrink hotDrink;
    private static final String description = "CREAM";
    private static double price = 0.1;

    public CreamDecorator(HotDrink hotDrink){
        this.hotDrink = hotDrink;
    }

    @Override
    public String getHotDrinkDescription() {
        return hotDrink.getHotDrinkDescription() + " with "  + description;
    }

    @Override
    public double getPrice() {
        return hotDrink.getPrice() + price;
    }
}
