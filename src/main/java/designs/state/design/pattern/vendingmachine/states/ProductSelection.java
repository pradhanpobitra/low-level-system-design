package designs.state.design.pattern.vendingmachine.states;

import designs.state.design.pattern.vendingmachine.Coin;
import designs.state.design.pattern.vendingmachine.Inventory;
import designs.state.design.pattern.vendingmachine.VendingMachine;
import designs.state.design.pattern.vendingmachine.product.Product;

import java.util.Optional;

public class ProductSelection implements State {
    @Override
    public void acceptCoins(VendingMachine vendingMachine, Coin coin) {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) {
        System.out.println("Setting the state to " + StateType.DISPENSE_PRODUCT.name());
        vendingMachine.changeState(StateType.DISPENSE_PRODUCT);
    }

    @Override
    public void exit(VendingMachine vendingMachine) {
        System.out.println("Setting the state to " + StateType.REFUND.name());
        vendingMachine.changeState(StateType.REFUND);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory) {
        Optional<Product> product = inventory.getProducts().stream().filter(p -> p.getCode() == productCode).findFirst();
        if(product.isEmpty() || product.get().getQuantity() == 0) {
            System.out.println("The product " + productCode + " does not exist");
        } else {
            System.out.println("The product " + product.get().getCode() + " has been selected");
            vendingMachine.setSelectedProduct(product.get());
        }
    }
}
