package AccessoriesTest;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.Drumsticks;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {
    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("wood", 10, 100, 2);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", drumsticks.getMaterial());
    }

    @Test
    public void hasNumSticks(){
        assertEquals(2, drumsticks.getNumSticks());
    }

    @Test
    public void checkMarkup(){
        assertEquals(900, drumsticks.calculateMarkup(), 0.00);
    }
}
