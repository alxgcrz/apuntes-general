package book

/**
 *   Programming Kotlin
 *   [Chapter 10]
 *   - Standard library for collections
 *   - Mutable and immutable collections
 *   - Stream API
 */
fun main(args: Array<String>) {

    // [Arrays]
    // Declaring and initializing arrays can be done like this:
    val intArray = arrayOf(1, 2, 3, 4, 5)
    println("Int array:${intArray.joinToString(", ")}") // => Int array:1, 2, 3, 4, 5

    val ints = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Built in int array:${ints.joinToString(", ")}") // => Built in int array:1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    // [Lists]
    val intList: List<Int> = listOf(1, 2, 3, 4, 5) // immutable
    val emptyList: List<String> = emptyList() // immutable
    val nonNulls: List<String> = listOfNotNull("a", "b", null, "c") // immutable
    val doubleList: ArrayList<Double> = arrayListOf(10.0, 20.0, 30.0) // mutable
    val cartoonsList: MutableList<String> = mutableListOf("Tom&Jerry", "Dexter's Laboratory")  // mutable

    // [Maps]
    val map: Map<String, String> = mapOf("a" to "aston martin", "b" to
            "bmw", "m" to "mercedes", "f" to "ferrari")
    val mutableMap: MutableMap<String, String> = mutableMapOf("AL" to
            "Alabama", "AK" to "Alaska", "AZ" to "Arizona")
    val hashMap: java.util.HashMap<String, String> = hashMapOf("a" to "aston martin", "b" to
            "bmw", "m" to "mercedes", "f" to "ferrari")
    val linkedHashMap: java.util.LinkedHashMap<String, String> =
            linkedMapOf("red" to "#FF0000", "azure" to "#F0FFFF", "white" to "#FFFFFF")
    val sortedMap: java.util.SortedMap<Int, String> = sortedMapOf(4 to
            "d", 1 to "a", 3 to "c", 2 to "b")

    // [Sets]
    // A set is a collection that contains no duplicate items.
    val intSet: Set<Int> = setOf(1, 21, 21, 2, 6, 3, 2) // => 1, 21, 2, 6, 3
    val hashSet: HashSet<Int> = hashSetOf(1, 21, 3, 26, 3, 2) // => 1, 26, 2, 3, 21
    val sortedIntegers: java.util.TreeSet<Int> = sortedSetOf(11, 0, 9, 11, 9, 8) //0, 8, 9, 11
    val charSet: java.util.LinkedHashSet<Char> = linkedSetOf('a', 'x', 'a', 'z', 'a') // a, x, z
    val longSet: MutableSet<Long> = mutableSetOf(20161028141216, 20161029121211, 20161029121211) //20161028141216, 20161029121211


    // [Sequences]
    val charSequence: Sequence<Char> = charArrayOf('a', 'b', 'c').asSequence() // a, b, c
    val longsSequence: Sequence<Long> = listOf(12000L, 11L, -1999L).asSequence() // 1200, 11, -1999
    val mapSequence: Sequence<Map.Entry<Int, String>> = mapOf(1 to "A", 2 to "B", 3 to "C").asSequence() // 1=A, 2=B, 3=C
    val setSequence: Sequence<String> = setOf("Anna", "Andrew", "Jack", "Laura", "Anna").asSequence() //Anna, Andrew, Jack, Laura
    val intSeq: Sequence<Int> = sequenceOf(1, 2, 3, 4, 5)
    val emptySeq: Sequence<Int> = emptySequence<Int>()
    val infiniteSequence = generateSequence(100) {
        if ((it + 1) % 2 == 0) it + 1 else it + 2
    }
    println(infiniteSequence.takeWhile { it < 110 }.toList()) // => [100, 102, 104, 106, 108]
}