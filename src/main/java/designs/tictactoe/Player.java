package designs.tictactoe;

public class Player {
    private final PieceType pieceType;
    private final String name;

    public Player(PieceType pieceType,  String name) {
        this.pieceType = pieceType;
        this.name = name;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public String getName() {
        return name;
    }
}
