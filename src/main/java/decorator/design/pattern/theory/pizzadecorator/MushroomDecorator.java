package decorator.design.pattern.theory.pizzadecorator;

import decorator.design.pattern.theory.Pizza;

public class MushroomDecorator implements Pizza {

    private final Pizza pizza;

    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return 50 + pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return "";
    }
}
