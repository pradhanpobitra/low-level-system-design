package designs.snake_and_ladder.game.strategy;

import designs.snake_and_ladder.Board;
import designs.snake_and_ladder.Player;

import java.util.List;

public interface WinningStrategy {

    boolean hasWinner(List<Player> players, Board board);
}
