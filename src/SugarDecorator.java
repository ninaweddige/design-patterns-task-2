public class SugarDecorator extends HotDrinkDecorator{
    private HotDrink hotDrink;

    public SugarDecorator(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
        this.description = "SUGAR";
        this.price = 0.05;
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
