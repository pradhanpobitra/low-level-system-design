package designs.snake_and_ladder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private final Board board;
    private final Deque<Player> players;
    private final List<Dice> dices;

    public Game(Board board, List<Player> players, List<Dice> dices) {
        this.board = board;
        this.players = new LinkedList<>(players);
        this.dices = dices;
    }

    public void startGame() {
        while(!players.isEmpty()) {
            Player currentPlayer = players.poll();

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
            if(hasPlayerWon(currentPlayer)) {
                System.out.println("Player " + currentPlayer.getName() + " won!");
                return;
            }
            players.addLast(currentPlayer);
        }
    }


    private boolean hasPlayerWon(Player player) {
        return player.getPosition() == board.getLastCellPosition();
    }
}
