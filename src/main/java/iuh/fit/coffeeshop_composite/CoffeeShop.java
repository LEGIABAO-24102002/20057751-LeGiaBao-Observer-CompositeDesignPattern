package iuh.fit.coffeeshop_composite;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Table> tables = new ArrayList<>();

    public void addTable(Table table) {
        tables.add(table);
    }

    public double calculateRevenue() {
        return tables.stream().mapToDouble(Table::getPrice).sum();
    }

    public void printRevenue() {
        System.out.println("=== Coffee Shop Revenue ===");
        for (Table table : tables) {
            System.out.println(table);
        }
        System.out.println("Total Revenue: " + calculateRevenue() + " VND");
    }
}
