object Pangram {

  fun isPangram(text: String): Boolean {
    return text.toLowerCase()
            // .replace(Regex("[^a-z]"), "")
            .filter { it.isLetter() }
            .toSet()
            .size == 26
  }

}
