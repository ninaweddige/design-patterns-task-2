public class Main {

    public static void main(String[] args){
        //One plain coffee
        HotDrink coffee0 = new Coffee();
        System.out.println(coffee0.getHotDrinkDescription() +
                " : " + coffee0.getPrice());

        //One plain tea
        HotDrink tea0 = new Tea();
        System.out.println(tea0.getHotDrinkDescription() +
                " : " + tea0.getPrice());

        //Coffee with sugar
        HotDrink coffeeWithSugar = new SugarDecorator(coffee0);
        System.out.println(coffeeWithSugar.getHotDrinkDescription() +
                " : " + coffeeWithSugar.getPrice());
        System.out.println(coffee0.getHotDrinkDescription() +
                " : " + coffee0.getPrice());

        //Coffee with cream
        HotDrink coffeeWithCream = new CreamDecorator(coffee0);
        System.out.println(coffeeWithCream.getHotDrinkDescription() +
                " : " + coffeeWithCream.getPrice());
        System.out.println(coffee0.getHotDrinkDescription() +
                " : " + coffee0.getPrice());

        //Coffee with sugar and two creams
        HotDrink coffeeWithOneSugarOneCream = new CreamDecorator(coffeeWithSugar);
        HotDrink coffeeWithOneSugarTwoCreams = new CreamDecorator(coffeeWithOneSugarOneCream);
        System.out.println(coffeeWithOneSugarTwoCreams.getHotDrinkDescription() +
                " : " + coffeeWithOneSugarTwoCreams.getPrice());
        System.out.println(coffee0.getHotDrinkDescription() +
                " : " + coffee0.getPrice());
    }
}
