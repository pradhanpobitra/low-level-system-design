package patterns.state;

import patterns.state.product.Product;
import patterns.state.states.StateType;
import patterns.state.states.factory.StateFactory;

import java.util.List;

// Facade pattern
public class VendingMachine {
    private StateType stateType;
    private final Inventory inventory;
    private int coinValue;
    private Product selectedProduct;

    public VendingMachine() {
        this.stateType = StateType.IDLE;
        this.inventory = new Inventory();
        this.coinValue = 0;
    }

    // customer facing
    public void displayProducts() {
        List<Product> productList = inventory.getProducts();
        for(Product product : productList) {
            System.out.println(product);
        }
    }


    // customer facing
    public void selectProduct(int productCode) {
        StateFactory.getState(stateType).selectProduct(this, productCode, inventory);
    }

    // customer facing
    public void acceptCoin(Coin coin) {
        StateFactory.getState(stateType).acceptCoins(this, coin);
        this.coinValue += coin.getValue();
    }

    // customer facing
    public void confirm() {
        StateFactory.getState(stateType).confirm(this);
    }

    // customer facing
    public void cancelOrder() {
        StateFactory.getState(stateType).exit(this);
    }


    public void changeState(StateType stateType) {
        this.stateType = stateType;
    }
    public Product getSelectedProduct() {
        return selectedProduct;
    }
    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
    public  int getCoinValue() {
        return coinValue;
    }
    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }
}
