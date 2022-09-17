package exercicio5;

import java.sql.Date;
import java.util.ArrayList;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items;

    public Order(Date date, OrderStatus status, Client client) {
        this.moment = date;
        this.status = status;
        this.client = client;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public double total() {
        // return items.stream().mapToDouble(item -> item.subTotal()).sum();
        double sum = 0;
        for(OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        String items_as_str = "";
        for(OrderItem item : items) {
            items_as_str += String.format("%s, $%s, Quantity: %s, Subtotal: $%s\n", item.product.getName(), item.product.getPrice(), item.getQuantity(), item.subTotal());
        }
        return String.format("Order moment: %s\nOrder status: %s\nClient: %s\nOrder items:\n%s\nTotal price: $%s\n", moment, status, client, items_as_str, total());
    }
}
