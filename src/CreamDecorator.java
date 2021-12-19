public class CreamDecorator extends HotDrinkDecorator{
    private HotDrink hotDrink;

    public CreamDecorator(HotDrink hotDrink){
        this.hotDrink = hotDrink;
        this.description = "CREAM";
        this.price = 0.1;
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
