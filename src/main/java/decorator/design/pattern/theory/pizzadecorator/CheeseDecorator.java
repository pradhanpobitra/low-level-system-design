package decorator.design.pattern.theory.pizzadecorator;

import decorator.design.pattern.theory.Pizza;

public class CheeseDecorator implements Pizza {

    private final Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return 75 + pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return "";
    }
}
