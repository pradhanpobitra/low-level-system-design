package designs.tictactoe;

public class Board {
    private final int rows;
    private final int columns;
    private final Piece[][] board;
    private int placedCells;

    public Board(int rows) {
        this.rows = rows;
        this.columns = rows;
        this.board = new Piece[rows][rows];
        this.placedCells = 0;
    }

    public boolean isCellEmpty(int row, int column) {
        if(row >= rows ||  column >= columns) {
            System.out.println("Invalid row or column");
            return false;
        }
        return board[row][column] == null;
    }

    public void placePiece(int row, int column, Piece piece) {
        board[row][column] = piece;
        placedCells++;
    }

    public boolean isBoardFull() {
        return placedCells == rows * columns;
    }

    public boolean hasPlayerWon(int row, int column) {
        int rowMatchCounter = 0;
        int columnMatchCounter = 0;

        for (int i = 0; i < rows; i++) {
            if(board[i][column] == null) continue;
            if(board[i][column].getType() == board[row][column].getType()) rowMatchCounter++;
        }
        if(rowMatchCounter == rows)  return true;

        for(int j = 0; j < columns; j++) {
            if(board[row][j] == null) continue;
            if(board[row][j].getType() == board[row][column].getType()) columnMatchCounter++;
        }
        if(columnMatchCounter == columns)  return true;

        rowMatchCounter = 0;
        for(int i = 0, j = 0; i < rows && j < columns; i++, j++) {
            if(board[i][j] == null) continue;
            if(board[i][j].getType() == board[row][column].getType()) rowMatchCounter++;
        }
        if (rowMatchCounter == rows)  return true;

        rowMatchCounter = 0;
        for(int i = 0, j = columns-1; i < rows && j >= 0; i++, j--) {
            if(board[i][j] == null) continue;
            if(board[i][j].getType() == board[row][column].getType()) rowMatchCounter++;
        }
        if (rowMatchCounter == rows)  return true;

        return false;
    }
}
