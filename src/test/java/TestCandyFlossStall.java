import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCandyFlossStall {
    private CandyFlossStall candyFlossStall;
    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Twister","McGready","E28");
    }

    @Test
    public void canGetName(){
        assertEquals("Twister", candyFlossStall.getName());
    }
}
