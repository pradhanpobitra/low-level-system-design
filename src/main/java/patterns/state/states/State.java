package patterns.state.states;

import patterns.state.Coin;
import patterns.state.Inventory;
import patterns.state.VendingMachine;

public interface State {
    void acceptCoins(VendingMachine vendingMachine, Coin coin);

    void confirm(VendingMachine vendingMachine);

    void exit(VendingMachine vendingMachine);

    void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory);
}
