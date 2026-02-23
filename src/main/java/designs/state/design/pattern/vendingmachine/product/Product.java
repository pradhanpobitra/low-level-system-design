package designs.state.design.pattern.vendingmachine.product;

public class Product {
    private final ProductType productType;
    private int quantity;
    private final int price;
    private final int code;

    public Product(ProductType productType, int quantity, int price, int code) {
        this.productType = productType;
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decrementQuantity() {
        this.quantity--;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString(){
        return "Product: " + productType.toString() + ", available quantity:  " + quantity + ", price per quantity: " + price;
    }
}
