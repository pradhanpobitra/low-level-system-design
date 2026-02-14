package decorator.theory;

import decorator.theory.basepizza.FarmhousePizza;
import decorator.theory.pizzadecorator.CheeseDecorator;
import decorator.theory.pizzadecorator.MushroomDecorator;

public class PizzaStore {

    public static void main(String[] args) {
        final Pizza basePizza = new FarmhousePizza();

        final Pizza decoratedPizza = new MushroomDecorator(new CheeseDecorator(basePizza));

        System.out.println(decoratedPizza.getPrice());
    }
}
