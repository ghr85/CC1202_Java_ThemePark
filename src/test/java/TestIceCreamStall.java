import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestIceCreamStall {
    private IceCreamStall iceCreamStall;
    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Twister","McGready","E28");
    }

    @Test
    public void canGetName(){
        assertEquals("Twister", iceCreamStall.getName());
    }
}
