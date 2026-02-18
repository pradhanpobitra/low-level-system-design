package designs.snake_and_ladder;

import designs.snake_and_ladder.game.Game;
import designs.snake_and_ladder.game.strategy.DefaultGameStrategy;
import designs.snake_and_ladder.game.strategy.DefaultWinningStrategy;
import designs.snake_and_ladder.jump.Ladder;
import designs.snake_and_ladder.jump.Snake;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Player player3 = new Player("Player3");
        Player player4 = new Player("Player4");
        Player player5 = new Player("Player5");
        Dice dice1 = new Dice(1, 6);
        Dice dice2 = new Dice(1, 6);
        Board board = new Board(100);

        board.configureJump(new Ladder(5, 21));
        board.configureJump(new Ladder(25, 34));
        board.configureJump(new Ladder(40, 90));

        board.configureJump(new Snake(99, 47));
        board.configureJump(new Snake(45, 20));
        board.configureJump(new Snake(15, 3));


        Game game = new Game(board, List.of(player1, player2, player3, player4, player5),
                List.of(dice1, dice2),
                new DefaultGameStrategy(new DefaultWinningStrategy()));
        game.startGame();
    }
}
