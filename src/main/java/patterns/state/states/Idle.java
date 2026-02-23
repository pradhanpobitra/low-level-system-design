package patterns.state.states;

import patterns.state.Coin;
import patterns.state.Inventory;
import patterns.state.VendingMachine;

public class Idle implements State {
    public void acceptCoins(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Setting the state to " + StateType.ACCEPTING_COINS.name());
        vendingMachine.changeState(StateType.ACCEPTING_COINS);
        int coinValue = vendingMachine.getCoinValue();
        vendingMachine.setCoinValue(coinValue + coin.getValue());
        System.out.println("The coin + " + coin.getValue() + " has been accepted");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void confirm(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void exit(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
