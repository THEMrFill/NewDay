package uk.co.newday.philip.arnold

import junit.framework.Assert.assertEquals
import org.junit.Test

class CountSentencesTests {
    @Test
    fun CheckParagraphLengthSimple() {
        val simple = "A simple sentence with no separators"
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 1)
    }

    @Test
    fun CheckParagraphLengthSimpleWithSeparator() {
        val simple = "A simple sentence with a full stop."
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 2)
    }
    @Test
    fun CheckParagraphLengthSimpleWithSeparator2() {
        val simple = "A simple sentence with a question mark?"
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 2)
    }
    @Test
    fun CheckParagraphLengthSimpleWithSeparator3() {
        val simple = "A simple sentence with an exclamation mark!"
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 2)
    }

    @Test
    fun CheckParagraphLengthSimpleWithMultipleSeparators() {
        val simple = "A simple sentence with a full stop.?!"
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 4)
    }

    @Test
    fun CheckParagraphLengthTwoSentencesNoEndSeparator() {
        val simple = "First Sentence. Second sentence"
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 2)
    }

    @Test
    fun CheckParagraphLengthTwoSentencesEndSeparator() {
        val simple = "First Sentence. Second sentence!"
        assertEquals(SentenceLength.BreakUpParagraph(simple).size, 3)
    }
}