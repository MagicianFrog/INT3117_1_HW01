import org.junit.Test;
import static org.junit.Assert.*;

public class ControlFlowTestV1 {

    private String version(int a, int b, int c) {
        return Version1.solution(a, b, c);
    }

    @Test
    public void CFTest1() {
        assertEquals("FAIL", version(14, 6, 0));
    }

    @Test
    public void CFTest2() {
        assertEquals("PASS", version(14, 2, 1));
    }

    @Test
    public void CFTest3() {
        assertEquals("FAIL", version(14, 5, 3));
    }

    @Test
    public void CFTest4() {
        assertEquals("PASS", version(14, 3, 4));
    }

}