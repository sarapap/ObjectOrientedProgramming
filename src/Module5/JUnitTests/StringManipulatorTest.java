package Module5.JUnitTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    @Test
    void testConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("AppleBanana", sm.concantenate("Apple", "Banana"));
        System.out.println("**--- Method testConcatenate() executed ---**");
    }

    @Test
    void testFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(6, sm.findLength("Banana"));
        System.out.println("**--- Method testFindLength() executed ---**");
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("APPLE", sm.convertToUpperCase("Apple"));
        System.out.println("**--- Method testConvertToUpperCase() executed ---**");
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("apple", sm.convertToLowerCase("Apple"));
        System.out.println("**--- Method testConvertToLowerCase() executed ---**");
    }

    @Test
    void testContainsSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("Apple or Banana", "Banana"));
        System.out.println("**--- Method testContainsSubstring() executed ---**");
    }



}
