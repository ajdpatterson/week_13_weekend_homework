package AccessoriesTest;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.TubaGrease;

import static org.junit.Assert.assertEquals;

public class TubaGreaseTest {
    TubaGrease tubaGrease;

    @Before
    public void before(){
        tubaGrease = new TubaGrease("oil", 10, 50, "high");
    }
    @Test
    public void hasMaterial(){
        assertEquals("oil", tubaGrease.getMaterial());
    }

    @Test
    public void hasViscosity(){
        assertEquals("high", tubaGrease.getViscosity());
    }
}
