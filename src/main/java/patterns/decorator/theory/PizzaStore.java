package patterns.decorator.theory;

import patterns.decorator.theory.basepizza.FarmhousePizza;
import patterns.decorator.theory.pizzadecorator.CheeseDecorator;
import patterns.decorator.theory.pizzadecorator.MushroomDecorator;

public class PizzaStore {

    public static void main(String[] args) {
        final Pizza basePizza = new FarmhousePizza();

        final Pizza decoratedPizza = new MushroomDecorator(new CheeseDecorator(basePizza));

        System.out.println(decoratedPizza.getPrice());
    }
}
