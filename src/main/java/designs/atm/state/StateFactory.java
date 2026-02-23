package designs.atm.state;

public class StateFactory {
    public static State getState(StateType stateType) {
        switch (stateType) {
            case IDLE -> {
                return new Idle();
            }
            case AUTHENTICATING ->  {
                return new Authenticating();
            }
            case PROCESSING ->   {
                return new Processing();
            }
            case null, default -> {
                return  new Noop();
            }
        }
    }
}
