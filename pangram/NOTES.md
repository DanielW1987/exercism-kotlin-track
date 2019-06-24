Since I wasn't too sure of the differences either, I decided to do some research. Without a Java background, the differences may not be obvious.

Using package Pangram, Kotlin emits a class named PangramKt in the package Pangram with the static method isPangram. I don't like this approach much, since you wouldn't normally create a package with capital letters in Java, and when dealing with this Kotlin code from the Java side, importing Pangram.PangramKt then calling PangramKt.isPangram seems non-trivial. Though this approach seems perfectly fine if you're only dealing with Kotlin.

Using object, Kotlin simply emits a final, uninstantiatable class named Pangram with the static method isPangram. This is closest to the best practice for "utility classes" in Java, where you'd define a public final class (to prevent extending) with a private constructor (to prevent instantiation) and add static methods to it.

Using class generates a non-final class named Pangram with a public default constructor. This is the wrong approach (in my opinion) since Pangram is never (nor supposed to be) extended or instantiated.

*from* [exercism.io](https://exercism.io/tracks/kotlin/exercises/pangram/solutions/f1d3cf0ac107437abf7727e465ce3949)