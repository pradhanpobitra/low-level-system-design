package designs.snake_and_ladder;

import designs.snake_and_ladder.jump.Jump;

public class Board {
    private final Cell[] cells;

    public Board(int cellCount) {
        cells = new Cell[cellCount+1];
        for (int i = 1; i <= cellCount; i++) {
            cells[i] = new Cell();
        }
    }

    public int getLastCellPosition() {
        return cells.length - 1;
    }

    public void configureJump(Jump jump) {
        int start = jump.getStart();
        cells[start].setJump(jump);
    }

    public Cell getCell(int position) {
        return cells[position];
    }
}
