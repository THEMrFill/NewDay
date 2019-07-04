package uk.co.newday.philip.arnold

import junit.framework.Assert.assertEquals
import org.junit.Test

class GetMaximumSentenceWordsInParagraphsTests {
    @Test
    fun CheckEmptyStringTest() {
        val count = SentenceLength.GetMaximumSentenceWordsInAParagraph("")
        assertEquals(count, 0)
    }

    @Test
    fun CheckASingleWordTest() {
        val count = SentenceLength.GetMaximumSentenceWordsInAParagraph("hello")
        assertEquals(count, 1)
    }

    @Test
    fun CheckTwoWordsTest() {
        val count = SentenceLength.GetMaximumSentenceWordsInAParagraph("hello there")
        assertEquals(count, 2)
    }

    @Test
    fun CheckTwoSameSentencesTest() {
        val count =
            SentenceLength.GetMaximumSentenceWordsInAParagraph("hello there. hello there")
        assertEquals(count, 2)
    }

    @Test
    fun CheckOneSentenceLotsOfEmptyTest() {
        val count = SentenceLength.GetMaximumSentenceWordsInAParagraph("hello there!?!!?.")
        assertEquals(count, 2)
    }

    @Test
    fun CheckSuppliedTextOneTest() {
        val count =
            SentenceLength.GetMaximumSentenceWordsInAParagraph("We test coders. Give us a try?")
        assertEquals(count, 4)
    }

    @Test
    fun CheckSuppliedTextTwoTest() {
        val count =
            SentenceLength.GetMaximumSentenceWordsInAParagraph("Forget  CVs..Save time . x x")
        assertEquals(count, 2)
    }


    @Test
    fun CheckLoremIpsumOneTest() {
        val count =
            SentenceLength.GetMaximumSentenceWordsInAParagraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vitae quam at enim congue molestie. Mauris accumsan est magna. Pellentesque euismod efficitur diam, non euismod dolor elementum et. Curabitur vitae nulla eu dolor molestie efficitur. Mauris sit amet turpis a nisl sagittis sagittis scelerisque eu sapien. Cras risus urna, fermentum a tempus vitae, lacinia et mi. Quisque risus eros, tincidunt tincidunt pharetra ornare, elementum at dui. Curabitur commodo, ligula in interdum congue, nunc ante rhoncus sapien, at vestibulum ipsum dui ac massa.")
        // longest sentence is: Curabitur commodo, ligula in interdum congue, nunc ante rhoncus sapien, at vestibulum ipsum dui ac massa
        assertEquals(count, 16)
    }

    @Test
    fun CheckLoremIpsumTwoTest() {
        // two longest sentences of the same length:
        // Aenean nec arcu non risus pellentesque venenatis sed ac ante
        // Aenean lacus ex, iaculis at dictum vel, varius ac nibh
        val count =
            SentenceLength.GetMaximumSentenceWordsInAParagraph("Curabitur pulvinar magna ac porttitor feugiat. Sed malesuada sapien quis bibendum imperdiet. Aenean nec arcu non risus pellentesque venenatis sed ac ante. Duis gravida molestie mattis. Praesent auctor gravida felis, eu condimentum nibh porttitor eget. Aenean lacus ex, iaculis at dictum vel, varius ac nibh. Suspendisse cursus aliquam vulputate. Cras sit amet varius dolor, id accumsan turpis. Curabitur quis volutpat enim, ut porttitor nisi. Pellentesque varius nunc sed lacus mattis, ullamcorper aliquam erat imperdiet. Pellentesque dapibus accumsan arcu vitae tincidunt.")
        assertEquals(count, 10)
    }
}