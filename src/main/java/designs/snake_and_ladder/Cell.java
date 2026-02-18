package designs.snake_and_ladder;

import designs.snake_and_ladder.jump.Jump;

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
