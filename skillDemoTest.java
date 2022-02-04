import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void testAdd(){
        assertEquals(4, skillDemo.add(1,2));
    }
}
