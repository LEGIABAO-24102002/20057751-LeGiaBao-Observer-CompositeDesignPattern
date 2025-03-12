package iuh.fit.coffeeshop_composite;

public class Product implements OrderComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price + " VND";
    }
}
