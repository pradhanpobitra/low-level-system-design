package decorator.design.pattern.theory.basepizza;

import decorator.design.pattern.theory.Pizza;

public class MargheritaPizza implements Pizza {

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }
}
