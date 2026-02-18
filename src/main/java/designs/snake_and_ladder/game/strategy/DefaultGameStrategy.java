package designs.snake_and_ladder.game.strategy;

import designs.snake_and_ladder.Board;
import designs.snake_and_ladder.Dice;
import designs.snake_and_ladder.Player;
import designs.snake_and_ladder.jump.Jump;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DefaultGameStrategy extends GameStrategy {
    public DefaultGameStrategy(WinningStrategy winningStrategy) {
        super(winningStrategy);
    }

    @Override
    public void playGame(List<Player> players, Board board, List<Dice> dices) {
        Deque<Player> playerDeque = new LinkedList<>(players);
        while(!playerDeque.isEmpty()) {
            Player currentPlayer = playerDeque.poll();

            int stepSize = 0;
            for(Dice dice : dices) {
                stepSize += dice.rollDice();
            }

            int nextPosition = Math.min(currentPlayer.getPosition() + stepSize, board.getLastCellPosition());

            currentPlayer.setPosition(nextPosition);
            Jump jump = board.getCell(nextPosition).getJump();
            if(jump != null) {
                currentPlayer.setPosition(jump.getEnd());
            }
            System.out.println("Player: " + currentPlayer.getName() + " is at: " + currentPlayer.getPosition());
            if(this.winningStrategy.hasWinner(players, board)) {
                System.out.println("Player " + currentPlayer.getName() + " won!");
                return;
            }
            playerDeque.addLast(currentPlayer);
        }
    }
}
