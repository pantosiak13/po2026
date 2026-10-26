package agh.po.lab3;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat cb = new CodingBat();

    @Test
    public void testStartHi() {
        assertTrue(cb.startHi("hi there"));
        assertFalse(cb.startHi("hello"));
        assertFalse(cb.startHi("h"));
    }

    @Test
    public void testParrotTrouble() {
        assertTrue(cb.parrotTrouble(true, 6));
        assertFalse(cb.parrotTrouble(true, 7));
        assertFalse(cb.parrotTrouble(false, 6));
    }

    @Test
    public void testSum3() {
        assertEquals(6, cb.sum3(new int[]{1, 2, 3}));
        assertEquals(18, cb.sum3(new int[]{5, 11, 2}));
        assertEquals(7, cb.sum3(new int[]{7, 0, 0}));
    }

    @Test
    public void testHelloName() {
        assertEquals("Hello Bob!", cb.helloName("Bob"));
        assertEquals("Hello Alice!", cb.helloName("Alice"));
        assertEquals("Hello X!", cb.helloName("X"));
    }
}