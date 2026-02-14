package decorator.design.pattern.myThought;

import decorator.design.pattern.myThought.basepizzas.Pizza;
import decorator.design.pattern.myThought.toppings.PizzaTopping;

import java.util.List;

public class PizzaDecorator implements Pizza {

    private final Pizza basePizza;
    private final List<PizzaTopping> toppings;

    public PizzaDecorator(Pizza basePizza, List<PizzaTopping> toppings) {
        this.basePizza = basePizza;
        this.toppings = toppings;
    }

    @Override
    public int getCost() {
        int cost = basePizza.getCost();
        for (PizzaTopping topping : toppings) {
            cost += topping.getCost();
        }

        return cost;
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder(basePizza.getDescription());
        if(!toppings.isEmpty()) {
            description.append(" with");
            for (PizzaTopping topping : toppings) {
                description.append(topping.getName());
            }
            description.deleteCharAt(description.length()-1);
        }
        return description.toString();
    }
}
