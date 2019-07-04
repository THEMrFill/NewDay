package uk.co.newday.philip.arnold

import junit.framework.Assert.assertEquals
import org.junit.Test

class CountWordsInSentenceTests {
    @Test
    fun CheckNoWordsTest() {
        val count = SentenceLength.CountWordsInString(" ,  ,; ()")
        assertEquals(count, 0)
    }

    @Test
    fun CountOneWordTest() {
        val count = SentenceLength.CountWordsInString("hello")
        assertEquals(count, 1)
    }

    @Test
    fun CountOneWordWithSpaceTest() {
        val count = SentenceLength.CountWordsInString("hello ")
        assertEquals(count, 1)
    }

    @Test
    fun CountTwoWordsTest() {
        val count = SentenceLength.CountWordsInString("hello there")
        assertEquals(count, 2)
    }

    @Test
    fun CountTwoWordsMultipleSpacesTest() {
        val count = SentenceLength.CountWordsInString("hello  there")
        assertEquals(count, 2)
    }

    @Test
    fun CountMultipleWordsMultipleSeparatorsTest() {
        val count = SentenceLength.CountWordsInString("We  test coders, give us a try")
        assertEquals(count, 7)
    }
}