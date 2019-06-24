package community

class Pangram2 {

  fun isPangram(text: String): Boolean {
    val lowerText = text.toLowerCase()
    return ('a'..'z').all {it in lowerText}
  }

}
