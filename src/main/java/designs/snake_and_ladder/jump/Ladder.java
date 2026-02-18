package designs.snake_and_ladder.jump;

public class Ladder extends Jump {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public PropsType getPropsType() {
        return PropsType.LADDER;
    }
}
