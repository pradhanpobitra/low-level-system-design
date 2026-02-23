package designs.state.design.pattern.vendingmachine.states.factory;

import designs.state.design.pattern.vendingmachine.states.*;

public class StateFactory {

    public static State getState(StateType stateType){
        return switch (stateType){
            case IDLE -> new Idle();
            case ACCEPTING_COINS -> new AcceptingCoins();
            case DISPENSE_PRODUCT -> new DispenseProduct();
            case PRODUCT_SELECTION -> new ProductSelection();
            case REFUND ->  new Refund();
            case null, default -> new Noop();
        };
    }
}
