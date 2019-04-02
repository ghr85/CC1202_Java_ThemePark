import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRollercoaster {
   private Rollercoaster rollercoaster;
    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Twister");
    }

    @Test
    public void canGetName(){
        assertEquals("Twister", rollercoaster.getName());
    }
}
