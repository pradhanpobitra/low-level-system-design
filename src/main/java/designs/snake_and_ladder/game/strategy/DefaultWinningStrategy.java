package designs.snake_and_ladder.game.strategy;

import designs.snake_and_ladder.Board;
import designs.snake_and_ladder.Player;

import java.util.List;

public class DefaultWinningStrategy implements WinningStrategy {

    @Override
    public boolean hasWinner(List<Player> players, Board board) {
        Player player = players.stream().filter(p ->
                        p.getPosition() == board.getLastCellPosition())
                .findFirst().orElse(null);

        if (player == null) {
            return false;
        }
        System.out.println("Player: " + player.getName() + " has won!!");
        return true;
    }
}
