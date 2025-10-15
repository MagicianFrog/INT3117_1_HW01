import org.junit.Test;
import static org.junit.Assert.*;

public class ControlFlowTestV2 {

    private String version(int a, int b, int c) {
        return Version2.solution(a, b, c);
    }

    @Test
    public void CFTest1() {
        assertEquals("INVALID", version(-1, 0, 8));
    }

    @Test
    public void CFTest2() {
        assertEquals("FAIL", version(14, 5, 1));
    }

    @Test
    public void CFTest3() {
        assertEquals("PASS", version(14, 0, 1));
    }

    @Test
    public void CFTest4() {
        assertEquals("FAIL", version(14, 4, 4));
    }

    @Test
    public void CFTest5() {
        assertEquals("PASS", version(14, 2, 3));
    }

}