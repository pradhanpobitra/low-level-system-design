package patterns.decorator.myThought.toppings;

public class MushroomTopping implements PizzaTopping{

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getName() {
        return " Mushroom,";
    }
}
