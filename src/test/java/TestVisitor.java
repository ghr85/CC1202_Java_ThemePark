import Interfaces.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestVisitor {
    private Visitor visitor;
    @Before
    public void before(){
        visitor = new Visitor(1.2,15,10);
    }

    @Test
    public void canGetHeight(){
        assertEquals(1.2,visitor.getHeight());
    }
    @Test
    public void canGetAge(){
        assertEquals(15,visitor.getAge());
    }
    @Test
    public void canGetMoney(){
        assertEquals(10.0,visitor.getMoney());
    }


}
