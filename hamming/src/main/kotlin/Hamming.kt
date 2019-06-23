import java.lang.IllegalArgumentException

object Hamming {

  fun compute(strand1: String, strand2: String): Int {
    ensureThatStrandLengthIsEqual(strand1, strand2)

    if (strandContentIsEqual(strand1, strand2)) {
      return 0
    }

    return calculateHammingDistance(strand1, strand2)
  }

  private fun ensureThatStrandLengthIsEqual(strand1: String, strand2: String) {
    if (strand1.length != strand2.length) {
      throw IllegalArgumentException("left and right strands must be of equal length.")
    }
  }

  private fun strandContentIsEqual(strand1: String, strand2: String) = strand1 == strand2

  private fun calculateHammingDistance(strand1: String, strand2: String): Int {
    var counter = 0

    strand1.forEachIndexed { index, c ->
      if (strand2[index] != c) {
        counter++
      }
    }

    return counter
  }

}
