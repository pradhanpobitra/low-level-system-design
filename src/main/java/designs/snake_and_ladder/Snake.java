package designs.snake_and_ladder;

public class Snake extends Jump {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public PropsType getPropsType() {
        return PropsType.SNAKE;
    }
}
