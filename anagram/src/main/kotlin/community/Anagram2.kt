package community

class Anagram2(private val word: String) {

  fun match(candidates: List<String>): Set<String> {
    val sortedWord = word.toLowerCase().toCharArray().sortedArray()
    return candidates.filter {
      ! word.equals(it, ignoreCase = true) && it.toLowerCase().toCharArray().sortedArray().contentEquals(sortedWord)
    }.toSet()
  }

}
