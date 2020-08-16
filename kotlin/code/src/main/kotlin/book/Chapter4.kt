package book

import java.util.*

/**
 *   Programming Kotlin
 *   [Chapter 4]
 *   - Functions and functions literals
 *   - Extension functions
 *   - Named parameters and default parameters
 *   - Operator overloading
 *   - Recursion and tail recursion
 */
fun main(args: Array<String>) {
    // [Defining functions]
    fun hello(): String = "Hello World"

    fun hello2(): Unit = println("Hello") // => Hello

    fun hello3() = println("Hello") // => Hello

    // Return type inferred by the compiler
    fun bye() = "Good bye"

    // [Single expression functions]
    fun hello4() = "Hello"

    // Or
    fun hello5(): String {
        return "Hello"
    }

    // [Member functions]
    val length = "Hello".take(5) // take(n: Int) is a member function of String class

    // [Local or nested functions]
    fun reverse(str: String) = str.reversed() // This function is nested because it is inside of the web.web.web.web.web.main function

    // Functions can even be nested multiple times.
    fun fizzbuzz(start: Int, end: Int) {
        for (k in start..end) {
            fun isFizz(): Boolean = k % 3 == 0
            fun isBuzz(): Boolean = k % 5 == 0
            when {
                isFizz() && isBuzz() -> println("Fizz Buzz")
                isFizz() -> println("Fizz")
                isBuzz() -> println("Buzz")
                else -> println(k)
            }
        }
    }

    // [Named and default parameters]
    fun bar(k: Int, m: Long = 1L, j: Boolean = true) = println("$k - $m - $j")

    // Once a parameter has been named, all the following parameters must be named too.
    bar(10) // => Omit default parameters
    bar(15, 30L)
    bar(20, 2L, true)
    bar(m = 30L, j = false, k = 10)
    bar(k = 10, m = 20L, j = true)
    bar(5, m = 2L, j = true)
    bar(6, 1L, j = true)

    // [Extension functions]
    fun String.reverse() = this.reversed()
    println("Hello World".reverse()) // => dlroW olleH

    // [Infix functions]
    class InfixAccount {
        var balance = 0.0

        infix fun add(amount: Double) {
            this.balance = balance + amount
        }
    }

    val account = InfixAccount()
    // Infix notation
    account add 100.0
    println("Account balance: ${account.balance}")

    // Normal notation
    val map1 = mapOf(Pair("London", "UK"), Pair("Bucharest", "Romania"))
    // Infix notation
    val map2 = mapOf("London" to "UK", "Bucharest" to "Romania")

    // [Function literal]
    // we can define function literals. To do so, we simply enclose the code in braces
    val printHello = { println("Hello") }
    printHello()

    // Function literals can also accept parameters
    val printMessage = { message: String -> println(message) }
    printMessage("Hello")

    // [Multiple return value]
    data class Result(val result: Int, val status: Boolean)

    fun checkStatus() = Result(10, true)
    val (result, status) = checkStatus()


    // An alternative to a custom class is using the Kotlin standard library 'Pair' type.
    fun roots(k: Int): Pair<Double, Double> {
        require(k >= 0)
        val root = Math.sqrt(k.toDouble())
        return Pair(root, -root)
    }

    val (a, b) = roots(9)
    println("$a # $b") // => 3.0 # -3.0

    // [varargs]
    fun brands(vararg brand: String) {
        for (brand in brand) {
            println("Brand: $brand")
        }
    }

    brands("BMW", "Audi", "Ford")

    fun car(vararg model: String, year: Int) {}
    car("Audi", "A6", year = 2005)

    // [Spread operator]
    val spread = arrayOf("Sony", "Nintendo", "Microsoft")
    brands(*spread)

    // [Standard Library Functions]
    // Apply, Let, Use, Run, Lazy, With, Repeat
    repeat(10, { println("Hello $it") }) // => Hello 0, Hello 1, Hello 2 ... Hello 9

    // [Assertions]
    // require, requireNotNull, check, error
    fun foo(k: Int, value: Boolean) {
        require(k > 10, { "k should be greater than 10" })
        requireNotNull(k)
        check(value)
        if (k == 20) error("Error: k == 20")
    }

    // [Generic functions]
    fun <T> choose(t1: T, t2: T, t3: T): T {
        return when (Random().nextInt(3)) {
            0 -> t1
            1 -> t2
            else -> t3
        }
    }
    // We can use the function with integers
    val r = choose(5, 7, 9)

    // Also we can use the function with strings
    val s = choose("BMW", "Audi", "Ford")

}

// [Top-level functions]
fun hello(): String = "Hello World!!"

fun sayHello(name: String) = println("Hello $name")








