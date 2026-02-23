package patterns.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayProducts();

        vendingMachine.acceptCoin(Coin.TWENTY_RUPEE);
        vendingMachine.acceptCoin(Coin.TWENTY_RUPEE);
        vendingMachine.confirm();

        vendingMachine.selectProduct(101);
        vendingMachine.confirm();

        vendingMachine.confirm();
        vendingMachine.cancelOrder();


    }
}
