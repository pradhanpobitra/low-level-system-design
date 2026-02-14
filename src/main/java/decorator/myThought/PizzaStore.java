package decorator.myThought;

import decorator.myThought.basepizzas.FarmhousePizza;
import decorator.myThought.basepizzas.Pizza;
import decorator.myThought.toppings.ExtraCheeseTopping;
import decorator.myThought.toppings.MushroomTopping;
import decorator.myThought.toppings.PizzaTopping;

import java.util.Collections;
import java.util.List;

public class PizzaStore {

    public static void main(String[] args) {
        // base pizza
        Pizza basePizza = new FarmhousePizza();

        // toppings
        PizzaTopping cheeseTopping = new ExtraCheeseTopping();
        PizzaTopping mushroomTopping = new MushroomTopping();

        // decorated pizza
        PizzaDecorator decoratedPizza = new PizzaDecorator(basePizza, List.of(cheeseTopping, mushroomTopping));

        System.out.println("Decorated Pizza:");
        System.out.println(decoratedPizza.getDescription());
        System.out.println("Decorated Pizza Cost:");
        System.out.println(decoratedPizza.getCost());

        // with no toppings
        basePizza = new FarmhousePizza();
        decoratedPizza = new PizzaDecorator(basePizza, Collections.emptyList());
        System.out.println("Decorated Pizza:");
        System.out.println(decoratedPizza.getDescription());
        System.out.println("Decorated Pizza Cost:");
        System.out.println(decoratedPizza.getCost());
    }
}