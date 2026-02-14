package decorator.design.pattern.theory;

import decorator.design.pattern.theory.basepizza.FarmhousePizza;
import decorator.design.pattern.theory.pizzadecorator.CheeseDecorator;
import decorator.design.pattern.theory.pizzadecorator.MushroomDecorator;

public class PizzaStore {

    public static void main(String[] args) {
        final Pizza basePizza = new FarmhousePizza();

        final Pizza decoratedPizza = new MushroomDecorator(new CheeseDecorator(basePizza));

        System.out.println(decoratedPizza.getPrice());
    }
}
