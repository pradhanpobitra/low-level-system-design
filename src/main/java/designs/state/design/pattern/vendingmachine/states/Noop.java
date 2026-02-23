package designs.state.design.pattern.vendingmachine.states;

import designs.state.design.pattern.vendingmachine.Coin;
import designs.state.design.pattern.vendingmachine.Inventory;
import designs.state.design.pattern.vendingmachine.VendingMachine;

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
