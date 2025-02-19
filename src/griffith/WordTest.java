package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WordTest {
    @Test
    public void testContains() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertTrue(word.contains('h'));
        assertFalse(word.contains('z'));
    }

    @Test
    public void testLength() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertEquals(5, word.length());
    }

    @Test
    public void testNotNull() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertNotNull(word.getLetters());}
}