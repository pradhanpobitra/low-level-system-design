package designs.state.design.pattern.vendingmachine.states;

import designs.state.design.pattern.vendingmachine.Coin;
import designs.state.design.pattern.vendingmachine.Inventory;
import designs.state.design.pattern.vendingmachine.VendingMachine;
import designs.state.design.pattern.vendingmachine.product.Product;

public class DispenseProduct implements State {
    @Override
    public void acceptCoins(VendingMachine vendingMachine, Coin coin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode, Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) {
        Product selectedProduct = vendingMachine.getSelectedProduct();
        if(selectedProduct == null) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        if(selectedProduct.getQuantity() == 0 || vendingMachine.getCoinValue() < selectedProduct.getPrice()) {
            System.out.println("Order cannot be fulfilled. Available quantity: " +  selectedProduct.getQuantity()
                    + " for product " + selectedProduct.getCode() + " and  price: " + selectedProduct.getPrice()
                    + " with deposit coin value: " + vendingMachine.getCoinValue());
        } else {
            System.out.println("Order for " + selectedProduct.getCode() + " fulfilled");
            vendingMachine.setCoinValue(vendingMachine.getCoinValue() - selectedProduct.getPrice());
            selectedProduct.decrementQuantity();
        }
        System.out.println("Setting the state to " + StateType.REFUND.name());
        vendingMachine.changeState(StateType.REFUND);
    }

    @Override
    public void exit(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
