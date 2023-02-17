package InstrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.InstrumentFamily;
import stock.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "black", 1000, 2000, "tinkling", true, InstrumentFamily.PERCUSSION);
    }

    @Test
    public void hasMaterialType(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasStool(){
        assertEquals(true, piano.isStool());
    }
}
