package patterns.decorator.theory.basepizza;

import patterns.decorator.theory.Pizza;

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
