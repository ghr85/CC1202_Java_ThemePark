import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDodgems {
    private Dodgems dodgems;
    @Before
    public void before(){
        dodgems = new Dodgems("Spinner");
    }

    @Test
    public void canGetName(){
        assertEquals("Spinner", dodgems.getName());
    }
}
