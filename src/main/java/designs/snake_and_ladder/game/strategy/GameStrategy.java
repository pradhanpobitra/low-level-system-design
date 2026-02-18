package designs.snake_and_ladder.game.strategy;

import designs.snake_and_ladder.Board;
import designs.snake_and_ladder.Dice;
import designs.snake_and_ladder.Player;

import java.util.List;

public abstract class GameStrategy {
    protected final WinningStrategy winningStrategy;

    public GameStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public abstract void playGame(List<Player> players, Board board, List<Dice> dices);
}
