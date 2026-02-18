package designs.snake_and_ladder.game;

import designs.snake_and_ladder.Board;
import designs.snake_and_ladder.Dice;
import designs.snake_and_ladder.Player;
import designs.snake_and_ladder.game.strategy.GameStrategy;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final List<Dice> dices;
    private final GameStrategy gameStrategy;

    public Game(Board board, List<Player> players, List<Dice> dices, GameStrategy gameStrategy) {
        this.board = board;
        this.players = new LinkedList<>(players);
        this.dices = dices;
        this.gameStrategy = gameStrategy;
    }

    public void startGame() {
        gameStrategy.playGame(players, board, dices);
    }
}
