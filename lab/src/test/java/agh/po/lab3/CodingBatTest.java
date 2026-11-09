package agh.po.lab3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void testMapAB() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        
        assertEquals("HiThere", cb.mapAB(map).get("ab"));
    }

    @Test
    public void testWordLen() {
        Map<String, Integer> res = cb.wordLen(new String[]{"this", "and", "that", "and"});
        
        assertEquals(Integer.valueOf(4), res.get("this"));
        assertEquals(Integer.valueOf(3), res.get("and"));
    }
}