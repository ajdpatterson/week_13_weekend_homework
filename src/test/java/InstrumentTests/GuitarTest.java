package InstrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.Guitar;
import stock.instruments.InstrumentFamily;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar("bone", "white", 1000, 2000, "twang", 5, InstrumentFamily.STRINGS);
    }

    @Test
    public void hasMaterial(){
        assertEquals("bone", guitar.getMaterial());
    }

    @Test
    public void hasStrings(){
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("twang", guitar.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100, guitar.calculateMarkup(), 0.00);
    }
}
