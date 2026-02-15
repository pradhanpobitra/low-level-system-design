package designs.tictactoe;

public class PieceFactory {

    public Piece getPiece(PieceType pieceType) {
        if(pieceType == PieceType.X) {
            return new PieceX();
        } else if(pieceType == PieceType.O) {
            return new PieceO();
        }
        return null;
    }
}
