import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPark {
    private Park park;
    @Before
    public void before(){
        park = new Park("Forest Park");
    }

    @Test
    public void canGetName(){
        assertEquals("Forest Park", park.getName());
    }
}
