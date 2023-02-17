package InstrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.Drums;
import stock.instruments.InstrumentFamily;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    Drums drums;

    @Before
    public void before(){
        drums = new Drums("steel", "red", 1000, 2000, "bang bang", false, InstrumentFamily.PERCUSSION);
    }

    @Test
    public void hasMaterial(){
        assertEquals("steel", drums.getMaterial());
    }

    @Test
    public void hasCymbals(){
        assertEquals(false, drums.isCymbals());
    }

    @Test
    public void canPlay(){
        assertEquals("bang bang", drums.play());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentFamily.PERCUSSION, drums.getInstrumentFamily());
    }
}
