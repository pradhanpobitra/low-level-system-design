package designs.tictactoe;

import java.util.List;
import java.util.Scanner;

public class GameConsole {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        System.out.println("Enter number of rows:");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        Player player1 = new Player(PieceType.X, "Pobitra");
        Player player2 = new Player(PieceType.O, "Chayanika");

        Game game = new Game(rows, List.of(player1, player2));

        game.startGame();
    }
}
