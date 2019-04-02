import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPlayground {
    private Playground playground;
    @Before
    public void before(){
        playground = new Playground("Silent Hill");
    }

    @Test
    public void canGetName(){
        assertEquals("Silent Hill", playground.getName());
    }
}
