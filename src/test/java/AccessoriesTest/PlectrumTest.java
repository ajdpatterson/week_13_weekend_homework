package AccessoriesTest;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.Plectrum;

import static org.junit.Assert.assertEquals;

public class PlectrumTest {
    Plectrum plectrum;

    @Before
    public void before(){
        plectrum = new Plectrum("plastic", 10, 50, "red");
    }
    @Test
    public void hasMaterial(){
        assertEquals("plastic", plectrum.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("red", plectrum.getColour());
    }
}
