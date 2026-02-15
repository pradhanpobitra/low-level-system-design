package designs.tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final Board board;
    private final Deque<Player> players;
    private final PieceFactory pieceFactory;

    public Game(int rows, List<Player> players) {
        this.board = new Board(rows);
        this.players = new LinkedList<>(players);
        this.pieceFactory = new PieceFactory();
    }

    public void startGame() {
        while(!this.board.isBoardFull()) {
            Player playingPlayer = players.peekFirst();
            System.out.println(playingPlayer.getName() + ", Enter your move: ");
            String input = grabInputFromPlayer();
            String[] inputs = input.split(",");
            int row = Integer.parseInt(inputs[0]);
            int column = Integer.parseInt(inputs[1]);

            if(!this.board.isCellEmpty(row, column)) {
                System.out.println("Invalid input, try again...");
                continue;
            }
            players.removeFirst();
            players.offerLast(playingPlayer);
            this.board.placePiece(row, column, pieceFactory.getPiece(playingPlayer.getPieceType()));
            if(this.board.hasPlayerWon(row, column)) {
                System.out.println("Player: " + playingPlayer.getName() + " won!");
                return;
            }
        }
        System.out.println("Game tied!");
    }

    private String grabInputFromPlayer() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
