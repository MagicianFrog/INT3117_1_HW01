import org.junit.Test;
import static org.junit.Assert.*;

public class DataFlowTestV2 {

    private String version(int a, int b, int c) {
        return Version2.sol(a, b, c);
    }

    @Test
    public void DFTest1() {
        assertEquals("FAIL", version(1, 0, 1));
    }

    @Test
    public void DFTest2() {
        assertEquals("FAIL", version(0, 2, 1));
    }

    @Test
    public void DFTest3() {
        assertEquals("FAIL", version(0, 4, 3));
    }

    @Test
    public void DFTest4() {
        assertEquals("FAIL", version(2, 1, 0));
    }

    @Test
    public void DFTest5() {
        assertEquals("FAIL", version(7, 6, 1));
    }

    @Test
    public void DFTest6() {
        assertEquals("PASS", version(14, 0, 1));
    }

    @Test
    public void DFTest7() {
        assertEquals("FAIL", version(7, 0, 1));
    }

    @Test
    public void DFTest8() {
        assertEquals("FAIL", version(8, 0, 1));
    }

    @Test
    public void DFTest9() {
        assertEquals("FAIL", version(7, 5, 0));
    }

    @Test
    public void DFTest10() {
        assertEquals("PASS", version(15, 0, 1));
    }

    @Test
    public void DFTest11() {
        assertEquals("PASS", version(14, 1, 4));
    }

    @Test
    public void DFTest12() {
        assertEquals("INVALID", version(-1, 0, 1));
    }

    @Test
    public void DFTest13() {
        assertEquals("INVALID", version(20, 9, 4));
    }

    @Test
    public void DFTest14() {
        assertEquals("INVALID", version(9, 6, 7));
    }

}