package web

/**
 * Kotlin From Scratch: Nullability, Loops, and Conditions
 */
fun main(args: Array<String>) {

    // [Nullability]
    // Kotlin is a null safety language
    // val firstname: String = null // will not compile because is not nullable

    // For the compiler to allow the assignment, declare name as a nullable by adding ? after the type.
    val firstname: String? = null // now this type can store a nullable value
    println(firstname) // => null

    // [The Safe Call Operator: ?.]
    // Now, by adding the safe call operator ?. to the variable before invoking the property,
    // we have explicitly instructed the compiler to invoke the property only if the value isn't null.
    // If the value is null, the compiler will use the string "null" as the value for us.
    // This works also for methods and not just properties.
    val lastname: String? = null
    // println(lastname.toUpperCase()) // will not compile
    println(lastname?.toUpperCase()) // => null

    // When you call a method of a nullable, the return type will also be nullable. So, for example,
    // the return type of the lastname?.length expression when lastname is nullable will be Int?
    val len: Int? = lastname?.length
    println("Length is $len") // => Length is null

    // To bypass nullability checking by the Kotlin compiler, we can replace the ?. operator with !!..
    // This is not recommended, though, because of the high probability of getting NullPointerException errors if used.
    // len = lastname!!.length will throw a NullPointerException

    // [The Elvis Operator: ?:]
    // With the Elvis Operator ?: you can provide a different value if the value is null
    val username: String = lastname ?: "empty"
    println("Username: $username") // => Username: empty

    // [LOOPS] => While, do..while & the for loop
    var i = 0
    while (i < username.length) {
        print("${username[i].toUpperCase()} ") // => E M P T Y
        i++
    }

    i = 0
    do {
        print("${username[i].toUpperCase()} ") // => E M P T Y
        i++
    } while (i < username.length)

    for (index in 1..10) {
        print(" [$index] ") // => [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]  [9]  [10]
    }

    // [Iterating Over an Index Array]
    // Iterating over an index array using the 'withIndex()' function
    // The withIndex() function returns an iterable of IndexedValue type for each element
    val numbers = arrayOf(10, 20, 30, 40, 50, 60, 70, 80)
    for ((index, value) in numbers.withIndex()) {
        print("\nIndex is $index and value is $value") // => Index is 0 and value is 10 ..
    }

    // Iterating over in index array using the 'indices' property
    // This will return just the range of valid indices for the array.
    for (index in numbers.indices) {
        print("\nIndex is $index and value is ${numbers[index]}") // => Index is 0 and value is 10 ..
    }

    // [Conditions] => if, if..else and when
    val number = (Math.random() * 100).toInt()
    if (number % 2 == 0) {
        println("\n$number is divisible by 2")
    } else {
        println("\n$number isn't divisible by 2")
    }

    // We can also check whether a variable is of a particular type using the 'is' keyword
    if (number is Int) {
        println("$number is a integer")
    }

    // [if..else like a expression]
    // Be aware that this will return only the last statement in a particular condition block
    // and also that you can't use an if without an else as an expression.
    val result = if (number % 2 == 0) {
        "This string will not returned"
        "$number is divisible by 2" // <== only this string is returned if executed
    } else {
        "$number isn't divisible by 2"
    }

    // [when lke a expression]
    // The when statement performs different actions based on the possible values of a constant
    // of type Int, String, Byte, Short, or any other object.
    when (number) {
        25 -> println("number is 25")
        49 -> println("number is 49")
        else -> println("number is neither 25 or 49. The number is $number")
    }

    guessTheNumber(number)

    // If we want to execute more than one action on a branch, we need to wrap the actions in curly braces {}
    when (number) {
        25 -> println("number is 25")
        49 -> {
            println("number is 49")
            println("-------------")
        }
        else -> println("number is neither 25 or 49. The number is $number")
    }

    // Moreover, we can combine test values in a single branch.
    when (number) {
        25, 49, 52 -> println("number is either 25, 49 or 52")
        else -> println("number is neither 25 49 or 52. The number is $number")
    }
}

// 'When' without argument. It can use the function argument
fun guessTheNumber(number: Int) {
    when (number) {
        1 -> println("number is 1")
        2 -> println("number is 2")
        3 -> println("number is 3")
        else -> println("number is neither 1, 2 or 3")
    }
}