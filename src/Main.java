public class Main {

    public static void main(String[] args){
        //One plain coffee
        HotDrink coffee = new Coffee();
        System.out.println(coffee.getHotDrinkDescription() +
                " : " + coffee.getPrice());

        //One plain tea
        HotDrink tea = new Tea();
        System.out.println(tea.getHotDrinkDescription() +
                " : " + tea.getPrice());

        //Coffee with sugar
        HotDrink coffeeWithSugar = new SugarDecorator(coffee);
        System.out.println(coffeeWithSugar.getHotDrinkDescription() +
                " : " + coffeeWithSugar.getPrice());
        System.out.println(coffee.getHotDrinkDescription() +
                " : " + coffee.getPrice());

        //Coffee with cream
        HotDrink coffeeWithCream = new CreamDecorator(coffee);
        System.out.println(coffeeWithCream.getHotDrinkDescription() +
                " : " + coffeeWithCream.getPrice());
        System.out.println(coffee.getHotDrinkDescription() +
                " : " + coffee.getPrice());

        //Coffee with sugar and two creams
        HotDrink coffeeWithOneSugarOneCream = new CreamDecorator(coffeeWithSugar);
        HotDrink coffeeWithOneSugarTwoCreams = new CreamDecorator(coffeeWithOneSugarOneCream);
        System.out.println(coffeeWithOneSugarTwoCreams.getHotDrinkDescription() +
                " : " + coffeeWithOneSugarTwoCreams.getPrice());
        System.out.println(coffee.getHotDrinkDescription() +
                " : " + coffee.getPrice());

        //Tea with sugar
        HotDrink teaWithSugar = new SugarDecorator(tea);
        System.out.println(teaWithSugar.getHotDrinkDescription() +
                " : " + teaWithSugar.getPrice());
        System.out.println(tea.getHotDrinkDescription() +
                " : " + tea.getPrice());

        //Tea with cream
        HotDrink teaWithCream = new CreamDecorator(tea);
        System.out.println(teaWithCream.getHotDrinkDescription() +
                " : " + teaWithCream.getPrice());
        System.out.println(tea.getHotDrinkDescription() +
                " : " + tea.getPrice());

        //Tea with sugar and two creams
        HotDrink teaWithOneSugarOneCream = new SugarDecorator(teaWithCream);
        HotDrink teaWithOneSugarTwoCreams = new CreamDecorator(teaWithOneSugarOneCream);
        System.out.println(teaWithOneSugarTwoCreams.getHotDrinkDescription() +
                " : " + teaWithOneSugarTwoCreams.getPrice());
        System.out.println(tea.getHotDrinkDescription() +
                " : " + tea.getPrice());

    }
}
