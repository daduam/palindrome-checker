package io.github.daduam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for PalindromeChecker.
 */
public class PalindromeCheckerTest {
    @Test
    public void shouldCheckIfWordIsPalindrome() {
        assertTrue(PalindromeChecker.check("madam"));
        assertFalse(PalindromeChecker.check("nurses"));
    }

    @Test
    public void shouldCheckIfPhraseIsPalindrome() {
        assertTrue(PalindromeChecker.check("nurses run"));
        assertFalse(PalindromeChecker.check("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void shouldIgnoresWhiteSpaces() {
        assertEquals(PalindromeChecker.check("nurses run"), PalindromeChecker.check("nursesrun"));
        assertEquals(PalindromeChecker.check("the quick brown fox jumps over the lazy dog"),
                PalindromeChecker.check("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    public void shouldIgnoresCase() {
        assertTrue(PalindromeChecker.check("NURSES RUN"));
        assertEquals(PalindromeChecker.check("NURSES RUN"), PalindromeChecker.check("Nurses Run"));
    }
}
