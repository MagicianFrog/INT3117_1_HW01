import org.junit.Test;
import static org.junit.Assert.*;

public class BoundaryTest {

    // Normal a
    @Test
    public void boundaryTest1() {
        assertEquals("PASS", Version1.solution(10, 0, 0));
    }

    @Test
    public void boundaryTest2() {
        assertEquals("FAIL", Version1.solution(10, 6, 4));
    }

    @Test
    public void boundaryTest3() {
        assertEquals("FAIL", Version1.solution(10, 1, 1));
    }

    @Test
    public void boundaryTest4() {
        assertEquals("INVALID", Version1.solution(10, -1, -1));
    }

    @Test
    public void boundaryTest5() {
        assertEquals("INVALID", Version1.solution(10, 7, 5));
    }

    @Test
    public void boundaryTest6() {
        assertEquals("FAIL", Version1.solution(10, 5, 3));
    }

    // Normal b
    @Test
    public void boundaryTest7() {
        assertEquals("FAIL", Version1.solution(0, 3, 0));
    }

    @Test
    public void boundaryTest8() {
        assertEquals("PASS", Version1.solution(20, 3, 4));
    }

    @Test
    public void boundaryTest9() {
        assertEquals("FAIL", Version1.solution(1, 3, 1));
    }

    @Test
    public void boundaryTest10() {
        assertEquals("INVALID", Version1.solution(-1, 3, -1));
    }

    @Test
    public void boundaryTest11() {
        assertEquals("INVALID", Version1.solution(21, 3, 5));
    }

    @Test
    public void boundaryTest12() {
        assertEquals("PASS", Version1.solution(19, 3, 3));
    }

    // Normal c
    @Test
    public void boundaryTest13() {
        assertEquals("FAIL", Version1.solution(0, 0, 2));
    }

    @Test
    public void boundaryTest14() {
        assertEquals("PASS", Version1.solution(20, 6, 2));
    }

    @Test
    public void boundaryTest15() {
        assertEquals("FAIL", Version1.solution(1, 1, 2));
    }

    @Test
    public void boundaryTest16() {
        assertEquals("INVALID", Version1.solution(-1, -1, 2));
    }

    @Test
    public void boundaryTest17() {
        assertEquals("INVALID", Version1.solution(21, 7, 2));
    }

    @Test
    public void boundaryTest18() {
        assertEquals("PASS", Version1.solution(19, 5, 2));
    }

    // All normal
    @Test
    public void boundaryTest19() {
        assertEquals("FAIL", Version1.solution(10, 3, 2));
    }
}
