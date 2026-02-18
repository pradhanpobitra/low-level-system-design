package designs.snake_and_ladder;

public class Dice {
    private final int lowest;
    private final int highest;

    public Dice(int lowest, int highest) {
        this.lowest = lowest;
        this.highest = highest;
    }

    public int rollDice() {
        return (int) Math.ceil(Math.random() * (highest - lowest)) + lowest;
    }
}
