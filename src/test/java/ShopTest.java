import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import stock.accessories.Drumsticks;
import stock.instruments.Guitar;
import stock.instruments.InstrumentFamily;
import stock.instruments.Piano;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Piano piano;
    Guitar guitar;
    ArrayList<ISell> stock;
    Drumsticks drumsticks;

    @Before
    public void before(){
        piano = new Piano("ivory", "red", 1000, 2000, "plink plonk", true, InstrumentFamily.PERCUSSION);
        stock = new ArrayList<>();
        drumsticks = new Drumsticks("wood", 1000, 2000, 2);
        guitar = new Guitar("wood", "blue", 1000,2000, "twang", 5, InstrumentFamily.STRINGS);
        stock.add(guitar);
        shop = new Shop(stock);
    }

    @Test
    public void hasStock(){
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addItem(piano);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.removeItem(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canGetTotalProfit(){
        shop.addItem(piano);
        shop.addItem(guitar);
        shop.addItem(drumsticks);
        assertEquals(4000, shop.getTotalProfit(), 0.00);
    }
}
