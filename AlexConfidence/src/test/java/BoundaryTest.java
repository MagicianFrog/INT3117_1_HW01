import org.junit.Test;
import static org.junit.Assert.*;

public class BoundaryTest {

    @Test
    public void testPassCase() {
        assertEquals("PASS", Version1.version1(14, 2, 2));
    }

    @Test
    public void testFailCase() {
        assertEquals("FAIL", Version1.version1(1, 5, 0));
    }

    @Test
    public void testBoundaryCase() {
        assertEquals("PASS", Version1.version1(8, 0, 0));
    }
}
