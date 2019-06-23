package community

data class Anagram(val text: String) {
  private val lowerText = text.toLowerCase()

  fun match(candidates: Collection<String>) = candidates
          .map { it to it.toLowerCase() }
          .filter { it.second != lowerText && it.second.toList().sorted() == lowerText.toList().sorted() }
          .map { it.first }.toSet()
}