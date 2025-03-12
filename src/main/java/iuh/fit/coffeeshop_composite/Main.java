package iuh.fit.coffeeshop_composite;

public class Main {
    public static void main(String[] args) {

        // Tạo sản phẩm
        Product coffee = new Product("Coffee", 30000);
        Product tea = new Product("Tea", 20000);
        Product water = new Product("Water", 10000);

        // Tạo bàn và thêm sản phẩm vào bàn
        Table table1 = new Table(1);
        table1.addItem(coffee);
        table1.addItem(tea);

        Table table2 = new Table(2);
        table2.addItem(water);
        table2.addItem(coffee);
        table2.addItem(tea);

        // Tạo quán cà phê và thêm bàn
        CoffeeShop shop = new CoffeeShop();
        shop.addTable(table1);
        shop.addTable(table2);

        // In doanh thu
        shop.printRevenue();
    }
}
