package decorator.design.pattern.myThought.basepizzas;

public class MargheritaPizza implements Pizza {

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }
}
