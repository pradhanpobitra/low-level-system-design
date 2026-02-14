package decorator.design.pattern.myThought.basepizzas;

public class FarmhousePizza implements Pizza {

    @Override
    public int getCost() {
        return 350;
    }

    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }
}
