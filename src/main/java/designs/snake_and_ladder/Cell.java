package designs.snake_and_ladder;

public class Cell {
    private Jump jump;

    public Cell() {
        this.jump = null;
    }

    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }
}
