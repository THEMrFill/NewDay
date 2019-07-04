package uk.co.newday.philip.arnold

object SentenceLength {
    fun BreakUpParagraph(input: String): List<String> {
        // break the string into sentences, including empties
        val response = input.split(Regex("[.?!]"))
        return response
    }

    fun CountWordsInString(input: String) : Int {
        // remove multiple spaces
        val inputCheck = input.trim().replace(Regex("\\s+"), " ")
        // break the string up on space, comma, semi-colon, brackets and square braces
        val list = inputCheck.split(Regex("[\\s;,()\\[\\]]"))
        // count the number of words to return
        var count = 0
        for (w in list) {
            if (w.length > 0) {
                count++
            }
        }
        return count
    }

    fun GetMaximumSentenceWordsInAParagraph(input: String): Int {
        val sentences = BreakUpParagraph(input)
        var maximum = 0
        for (sentence in sentences) {
            val len = CountWordsInString(sentence)
            maximum = Math.max(maximum, len)
        }
        return maximum
    }
}