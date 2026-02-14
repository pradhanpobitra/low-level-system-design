package decorator.design.pattern.myThought.toppings;

public class ExtraCheeseTopping implements PizzaTopping {

    @Override
    public int getCost() {
        return 75;
    }

    @Override
    public String getName() {
        return " Extra Cheese,";
    }
}
