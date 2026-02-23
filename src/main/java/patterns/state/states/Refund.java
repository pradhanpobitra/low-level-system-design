package patterns.state.states;

import patterns.state.Coin;
import patterns.state.Inventory;
import patterns.state.VendingMachine;

public class Refund implements State {
    @Override
    public void acceptCoins(VendingMachine vendingMachine, Coin coin) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) {
        throw   new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exit(VendingMachine vendingMachine) {
        if(vendingMachine.getCoinValue() != 0) {
            System.out.println("Your money has been refunded. Amount: " + vendingMachine.getCoinValue());
        }
        vendingMachine.setCoinValue(0);
        vendingMachine.setSelectedProduct(null);
        System.out.println("Setting the state to " + StateType.IDLE.name());
        vendingMachine.changeState(StateType.IDLE);
    }
}
