package designs.state.design.pattern.vendingmachine.states;

import designs.state.design.pattern.vendingmachine.Coin;
import designs.state.design.pattern.vendingmachine.Inventory;
import designs.state.design.pattern.vendingmachine.VendingMachine;

public interface State {
    void acceptCoins(VendingMachine vendingMachine, Coin coin);

    void confirm(VendingMachine vendingMachine);

    void exit(VendingMachine vendingMachine);

    void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory);
}
