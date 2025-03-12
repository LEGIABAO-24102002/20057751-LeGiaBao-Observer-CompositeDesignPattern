package iuh.fit.stock_observer;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();
        Investor investor1 = new Investor("Le Dinh Tuan");
        stock.registerInvestor(investor1);
        stock.setPrice(125.010);

        Investor investor2 = new Investor("Tran Xuan Dinh");
        stock.registerInvestor(investor2);
        stock.setPrice(150.750);

        Investor investor3 = new Investor("Le Gia Bao");
        stock.registerInvestor(investor3);
        stock.setPrice(120.780);
    }
}
