package iuh.fit.stock_observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject {
    private double price;
    private List<StockObserver> investors = new ArrayList<>();

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    @Override
    public void registerInvestor(StockObserver observer) {
        investors.add(observer);
    }

    @Override
    public void removeInvestor(StockObserver observer) {
        investors.remove(observer);
    }

    @Override
    public void notifyInvestors() {
        investors.forEach(investor -> investor.update(price));
    }
}