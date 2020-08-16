package web

/**
 * Kotlin From Scratch: Ranges and Collections
 */
fun main(args: Array<String>) {

    // [RANGES]
    // It's an interval between a start and an end value. Ranges in Kotlin are closed,
    // meaning that the start value and end value are included in the range.
    // [The .. Operator]
    var range = 1..10

    // We can loop over it using the for loop construct.
    for (i in range) {
        print(" [$i] ${if (i == range.endInclusive) "\n" else ""}") // => [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]  [9]  [10]
    }

    // [The 'rangeTo()' Function]
    range = 1.rangeTo(5)
    for (i in range) {
        print(" [$i] ${if (i == range.endInclusive) "\n" else ""}") // => [1]  [2]  [3]  [4]  [5]
    }

    // We can modify the range using the 'step()' function or 'step' in the form of infix annotation.
    // This will modify the delta between each element in the range.
    val progression = 1..10 step 2
    for (i in progression.withIndex()) {
        print(" [${i.value}] ${if (i.value == progression.last) "\n" else ""}") // => [1]  [3]  [5]  [7]  [9]
    }

    // [The 'downTo()' Function]
    val regression = 30.downTo(1).step(5)
    for (i in regression.withIndex()) {
        print(" [${i.value}] ${if (i.value == regression.last) "\n" else ""}") // => [30]  [25]  [20]  [15]  [10]  [5]
    }

    // [The 'in' Operator]
    // The 'in' operator is used to ascertain whether a value is present in a given range.
    // We can also do the opposite by using !in to check if 5 is not in the range.
    val value = Math.round(Math.random() * 100).toInt()
    if (value in regression) {
        println("$value is in the regression")
    } else if (value !in progression) {
        println("$value is not in the progression")
    }

    // [COLLECTIONS]
    // Kotlin provides its collections API as a standard library built on top of the Java Collections API.
    // Kotlin has two variants of collections: mutable and immutable.
    // A mutable collection provides us with the ability to modify a collection by either
    // adding, removing or replacing an element. Immutable collections cannot be modified
    // and don't have these helper methods.

    // [LIST (Immutable)]
    // A list is an ordered collection of elements
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    println(numbers) // => [1, 2, 3, 4, 5]

    val names: List<String> = listOf("Han Solo", "Luke", "Leia", "Rey")
    println(names) // => [Han Solo, Luke, Leia, Rey]

    val mixedList = listOf("R2D2", 1, "C3PO", 2)
    println("[${mixedList[0]}] - [${mixedList[1]}]")

    // 'emptyList()' function just creates an empty immutable list and returns a Kotlin 'List' interface type.
    val emptyList: List<String> = emptyList()

    // 'listOfNotNull()' function creates a new immutable list containing only elements that are not null
    val nonNullsList = listOfNotNull(2, 45, 2, null, 5, null)
    println(nonNullsList) // => [2, 45, 2, 5]

    // 'arrayListOf()' creates a mutable list and returns a Java 'ArrayList' type.
    val stringList: ArrayList<String> = arrayListOf("Hello", "You", "There")
    println(stringList[0]) // => Hello

    // To add, remove or replace values in a list, we need to make the list a mutable one.
    // We can convert an immutable list to a mutable one by calling the function 'toMutableList()'
    // on the list. However, note that this method will create a new list
    val mutable = names.toMutableList()
    mutable.add("Darth Vader")
    println(mutable.last()) // => Darth Vader

    // Create a mutable list of a certain type
    val mutableList: MutableList<String> = mutableListOf("One", "Two", "Three")
    mutableList.add("Four")
    println(mutableList.first()) // => One

    // Mixed mutable list
    val mixedMutableList = mutableListOf("One", 1, "Two", 2, "Three", 3.0)
    mixedMutableList[5] = 3 // replace value
    println(mixedMutableList.last()) // => 3

    // [Sets (Immutable)]
    // A set is an unordered collection of unique elements. In other words, it can't have any duplicates!
    // 'setOf()' function creates a immutable set of mixed types
    val mixedTypesSet = setOf(2, 4.454, "how", "far", 'c') // will compile

    val intSet: Set<Int> = setOf(1, 3, 4)  // only integers types allowed

    // Using the 'hashSetOf()' function creates a Java HashSet collection which stores elements
    // in a hash table. It's mutable
    val intHashSet = hashSetOf(1, 3, 7, 12)
    intHashSet.add(9)
    println(intHashSet.size) // => 5

    // Using the 'sortedSetOf()' function creates a Java 'TreeSet' collection behind the scenes,
    // which orders elements based on their natural ordering or by a comparator.
    val intSortedSet = sortedSetOf(3, 9, 1, 5, 8)
    for (i in intSortedSet) {
        println(i) // => 13589
    }

    // The 'linkedSetOf()' function returns a Java 'LinkedHashSet' type. This mutable set maintains
    // a linked list of the entries in the set, in the order in which they were inserted.
    val linkedSet = linkedSetOf(5, 2, 7, 2, 5)
    for (i in linkedSet) {
        println(i) // => 527
    }

    // We can use 'mutableSetOf()' to create a mutable set.
    val mutableSet: MutableSet<Int> = mutableSetOf(2, 1, 4, 3)

    // [Maps (Immutable)]
    // Maps associate keys to values. The keys must be unique, but the associated values don't need to be.
    // That way, each key can be used to uniquely identify the associated value, since the map makes
    // sure that you can't have duplicate keys in the collection.
    // To create an immutable or read-only 'Map' collection in Kotlin, we use the 'mapOf()' function
    val callingCodesMap: Map<Int, String> = mapOf(234 to "Nigeria", 1 to "USA", 233 to "Ghana")
    for ((key, value) in callingCodesMap) {
        println("$key is the calling code for $value")
    }
    println(callingCodesMap[234]) // => Nigeria

    // The 'mutableMapOf()' function creates a mutable map for us so that we can add and remove elements in the map
    val currenciesMutableMap: MutableMap<String, String> =
            mutableMapOf("Naira" to "Nigeria", "Dollars" to "USA", "Pounds" to "UK")
    println("Countries are ${currenciesMutableMap.values}") // => Countries are [Nigeria, USA, UK]
    println("Currencies are ${currenciesMutableMap.keys}") // => Currencies are [Naira, Dollars, Pounds]
    currenciesMutableMap["Cedi"] = "Ghana"
    currenciesMutableMap.remove("Dollars")

    // Using the 'hashMapOf()' function returns a Java 'HashMap' type that is mutable
    val personsHashMap: HashMap<Int, String> = hashMapOf(1 to "Luke", 2 to "Leia", 3 to "Han Solo")
    personsHashMap[4] = "Yoda"
    personsHashMap.remove(2)
    println(personsHashMap[1]) // => Luke

    // Using the 'linkedHashMap()' returns a Java 'LinkedHashMap' type that is mutable
    val postalCodesHashMap: java.util.LinkedHashMap<String, String> =
            linkedMapOf("NG" to "Nigeria", "AU" to "Australia", "CA" to "Canada")
    postalCodesHashMap["NA"] = "Namibia"
    postalCodesHashMap.remove("AU")
    postalCodesHashMap["CA"]

    // Using the 'sortedMapOf()' returns a Java 'SortedMap' type which is mutable
    val personsSortedMap: java.util.SortedMap<Int, String> =
            sortedMapOf(2 to "Luke", 1 to "Yoda", 3 to "Leia")
    personsSortedMap[7] = "Adam"
    personsSortedMap.remove(3)

    // [Collection Functions]
    // The 'last()' function returns the last element in a collection such as a list or set.
    // We can also supply a predicate to search within a subset of elements.
    val characters = listOf("Luke", "Leia", "C3PO", "R2D2", "Yoda", "Han Solo")
    println(characters.last()) // => Han Solo

    // given a predicate
    println(characters.last { it.length > 4 }) // => Han Solo
    println(characters.last { it.startsWith("Y") }) // => Yoda

    // The 'first()' function returns the first element when invoked on a collection such as a
    // list or set. If a predicate is given, it then uses the predicate to restrict
    // the operation to a subset of elements.
    println(characters.first()) // => Luke
    println(characters.first { it.endsWith("D2") }) // => R2D2

    val positions = listOf(1, 4, 9, 12, 3, 8)

    // Invoking the 'max()' function on a collection such as a list or set returns the
    // largest element, or null if no largest element is found.
    println(positions.max()) // => 12

    // Invoking the 'min()' function on a collection such as a list or set returns the
    // smallest element, or null if no smallest element is found.
    println(positions.min()) // => 1

    // Calling the 'average()' function will return an average number of elements in the collection.
    println(positions.average()) // => 6.166666666666667

    // Calling 'drop()' returns a new list or set containing all elements except the first n elements
    println(characters.drop(2)) // => [C3PO, R2D2, Yoda, Han Solo]

    // The 'plus()' function returns a collection containing all elements of the original and
    // then the given element if it isn't already in the collection. This will end up creating a
    // new list instead of modifying the list.
    println(characters.plus("Rey")) // => [Luke, Leia, C3PO, R2D2, Yoda, Han Solo, Rey]

    // The opposite of the 'plus()' function is the 'minus()' function. It returns a collection
    // containing all elements of the original set except the given element. This also ends up
    // creating a new list instead of altering the list.
    println(characters.minus("R2D2")) // => [Luke, Leia, C3PO, Yoda, Han Solo]

}