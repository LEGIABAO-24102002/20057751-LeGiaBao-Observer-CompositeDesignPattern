package iuh.fit.coffeeshop_composite;

import java.util.ArrayList;
import java.util.List;

public class Table implements OrderComponent {
    private List<OrderComponent> items = new ArrayList<>();
    private int tableNumber;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItem(OrderComponent item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(OrderComponent::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Table " + tableNumber + " - Total: " + getPrice() + " VND";
    }
}
