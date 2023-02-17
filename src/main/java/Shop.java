import behaviours.ISell;
import stock.instruments.Guitar;
import stock.instruments.Piano;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }

    public double getTotalProfit() {
        double total = 0;
        for (ISell item: stock){
            double profit = item.getSellPrice() - item.getPurchasePrice();
            total += profit;
        }
        return total;

    }
}
