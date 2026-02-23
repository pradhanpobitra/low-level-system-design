package designs.state.design.pattern.vendingmachine.states;

public enum StateType {
    IDLE,
    ACCEPTING_COINS,
    PRODUCT_SELECTION,
    DISPENSE_PRODUCT,
    REFUND
}
