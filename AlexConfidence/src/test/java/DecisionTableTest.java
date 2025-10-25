import org.junit.Test;
import static org.junit.Assert.*;

public class DecisionTableTest {

    private String version(int a, int b, int c) {
        return Version2.sol(a, b, c);
    }

    @Test
    public void DecisionTableTest1() {
        assertEquals("INVALID", version(-3, 5, 0));
    }

    @Test
    public void DecisionTableTest2() {
        assertEquals("INVALID", version(5, -1, 2));
    }

    @Test
    public void DecisionTableTest3() {
        assertEquals("INVALID", version(5, 3, 5));
    }

    @Test
    public void DecisionTableTest4() {
        assertEquals("FAIL", version(4, 4, 1));
    }

    @Test
    public void DecisionTableTest5() {
        assertEquals("FAIL", version(6, 3, 2));
    }

    @Test
    public void DecisionTableTest6() {
        assertEquals("FAIL", version(13, 2, 0));
    }

    @Test
    public void DecisionTableTest7() {
        assertEquals("PASS", version(11, 1, 3));
    }

    @Test
    public void DecisionTableTest8() {
        assertEquals("PASS", version(19, 2, 1));
    }

    @Test
    public void DecisionTableTest9() {
        assertEquals("PASS", version(16, 1, 3));
    }


}