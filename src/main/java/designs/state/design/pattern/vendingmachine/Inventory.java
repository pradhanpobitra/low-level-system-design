package designs.state.design.pattern.vendingmachine;

import designs.state.design.pattern.vendingmachine.product.Product;
import designs.state.design.pattern.vendingmachine.product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
        products.add(new Product(ProductType.COKE, 3, 35, 101));
        products.add(new Product(ProductType.SPRITE, 1, 30, 102));
        products.add(new Product(ProductType.FANTA, 3, 25, 103));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
