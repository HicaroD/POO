package exercicio5;

public class OrderItem {
    private int quantity;
    private double price;
    Product product;

    public OrderItem(int quantity, double productPrice, Product product) {
        this.quantity = quantity;
        this.price = productPrice;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double subTotal() {
        return getQuantity() * price;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, Quantity: %s, Subtotal: $%s\n", product.getName(), product.getPrice(), getQuantity(),
                subTotal());
    }
}
