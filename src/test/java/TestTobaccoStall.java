import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTobaccoStall {
    private TobaccoStall tobaccoStall;
    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Twister","McGready","E28");
    }

    @Test
    public void canGetName(){
        assertEquals("Twister", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("McGready", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals("E28", tobaccoStall.getParkingSpot());
    }

}
