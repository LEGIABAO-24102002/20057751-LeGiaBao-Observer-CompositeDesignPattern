package iuh.fit.stock_observer;

public class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " nhận thông báo: Giá cổ phiếu mới là " + price);
    }
}