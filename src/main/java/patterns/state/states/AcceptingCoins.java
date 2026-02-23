package patterns.state.states;

import patterns.state.Coin;
import patterns.state.Inventory;
import patterns.state.VendingMachine;


public class AcceptingCoins implements State {
    public void acceptCoins(VendingMachine vendingMachine, Coin coin) {
        int coinValue = vendingMachine.getCoinValue();
        vendingMachine.setCoinValue(coinValue + coin.getValue());
        System.out.println("The coin + " + coin.getValue() + " has been accepted");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) {
        System.out.println("Setting the state to " + StateType.PRODUCT_SELECTION.name());
        vendingMachine.changeState(StateType.PRODUCT_SELECTION);
    }

    @Override
    public void exit(VendingMachine vendingMachine) {
        System.out.println("Setting the state to " + StateType.REFUND.name());
        vendingMachine.changeState(StateType.REFUND);
    }

    public void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
