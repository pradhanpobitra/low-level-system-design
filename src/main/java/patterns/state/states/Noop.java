package patterns.state.states;

import patterns.state.Coin;
import patterns.state.Inventory;
import patterns.state.VendingMachine;

public class Noop implements State {

    @Override
    public void acceptCoins(VendingMachine vendingMachine, Coin coin) {

    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory) {

    }

    @Override
    public void confirm(VendingMachine vendingMachine) {

    }

    @Override
    public void exit(VendingMachine vendingMachine) {

    }
}
