package iuh.fit.stock_observer;

public interface StockSubject {
    void registerInvestor(StockObserver observer);
    void removeInvestor(StockObserver observer);
    void notifyInvestors();
}
