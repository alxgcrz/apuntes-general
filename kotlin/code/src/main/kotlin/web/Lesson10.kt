package web

/**
 * Kotlin From Scratch: Exception Handling
 */

fun main(args: Array<String>) {

    // [Exceptions]
    // In Kotlin all exceptions are unchecked. Unchecked exceptions that are thrown because of
    // flaws in your code. They are a direct or indirect subclass of the RuntimeException superclass.
    // In Java a method that might throw a exception needs to declare so in its method signature
    // using the 'throws' keyword. This are checked exceptions
    fun foo() {
        try {
            throw Exception("Exception message")
        } catch (e: Exception) {
            println("Exception handled")
        } finally {
            println("inside finally block")
        }
    }

    foo()

    // The try construct can be used as an expression.
    fun foo(number: Int) {
        val result = try {
            if (number != 1) {
                throw IllegalArgumentException()
            }
            true
        } catch (e: IllegalArgumentException) {
            false
        }

        println(result)
    }

    foo(2) // false
}

// However, if we want to communicate with Java callers that the addNumberToTwo() top-level function
// throws an exception, we simply add the @Throws annotation to the function signature.
@Throws(IllegalArgumentException::class)
fun addNumberToTwo(a: Any): Int {
    if (a !is Int) {
        throw IllegalArgumentException("Number must be an integer")
    }
    return 2 + a
}