package patterns.decorator.theory.basepizza;

import patterns.decorator.theory.Pizza;

public class FarmhousePizza implements Pizza {

    @Override
    public int getPrice() {
        return 350;
    }

    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }
}
