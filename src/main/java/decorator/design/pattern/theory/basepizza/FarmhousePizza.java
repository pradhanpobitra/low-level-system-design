package decorator.design.pattern.theory.basepizza;

import decorator.design.pattern.theory.Pizza;

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
