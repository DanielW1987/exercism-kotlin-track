import java.util.stream.Collectors

class Anagram(private val word: String) {

  fun match(candidates: List<String>): Set<String> {
    val sortedWord = word.toLowerCase().toCharArray().sortedArray()
    return candidates.stream()
            .filter { word.length == it.length }
            .filter { ! word.equals(it, ignoreCase = true) }
            .filter { it.toLowerCase().toCharArray().sortedArray().contentEquals(sortedWord) }
            .collect(Collectors.toSet())
  }

}
