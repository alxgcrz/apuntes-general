package web

// Immutable (constant)
const val firstname: String = "John"

/**
 * Kotlin From Scratch: Variables, Basic Types, and Arrays
 */
fun main(args: Array<String>) {
    // Immutable (constant)
    // Value cannot change
    val firstName = "John"

    // Mutable (variable)
    // The value of the variable can change, but its type cannot!
    var lastName = "doe" //Omit the type. Inferred by compiler
    lastName = "Doe"

    // It is highly recommended that you start by making your variables immutable by declaring them with
    // the val keyword, so as not to maintain too many states. This makes your code safer for multithreading,
    // because it ensures your variables cannot be modified by other threads unexpectedly.

    // In Kotlin, all types are objects
    val myLong: Long = 64L // 64 bits
    val myInt: Int = 32 // 32 bits
    val myShort: Short = 16 // 16 bits
    val myByte: Byte = 8 // 8 bits

    val myDouble: Double = 64.0 // 64 bits
    val myFloat: Float = 32.0F // 32 bits

    val myHexadecimal = 0x0F
    val myBinary = 0b011010

    // Print all values
    println("$myLong - $myInt - $myShort - $myByte - $myDouble - $myFloat - $myHexadecimal - $myBinary")

    // Another thing you should know about the val keyword is that you can declare it with a
    // type only and assign it a value later.
    val model: String
    model = "BMW"

    println(firstName)
    println(lastName)
    println("$firstname $lastName - $model")

    // Explicit conversion is needed
    // Each number type has helper functions that convert from one number type to another
    val newInt = myLong.toInt()
    val newShort = newInt.toShort()
    val newByte = newShort.toByte()
    println(newByte)

    // Direct conversion
    val intValue = "1212".toInt()
    println(intValue)

    // Strings can be created with either double quotes or triple quotes. In addition to that,
    // escape characters can be used with double quotes.
    val myString = "This is a String"
    val escapeString = "\nThis is a String with new line \n"

    // To create a string that spans multiple lines in the source file, we use triple quotes
    val multipleStringLines = """
        This is first line
        This is second line
        This is third line """
    println(multipleStringLines)

    // Using string templates, we can insert variables and expressions into a string.
    // If you need to use '$' just escape it with \$
    val accountBalance = 200
    println("Your account balance is $accountBalance \$")

    // Also, you can call methods from an interpolated String directly; you have to add
    // curly braces ${} to wrap it.
    println("My name is $firstname and the first letter is ${firstname.first()}")

    // Another cool thing you can do is to perform some logic inside the curly braces
    // when creating a String literal.
    val age = (Math.random() * 100).toInt()
    println("You are ${if (age > 40) "old" else "young"} ($age)")

    // [Array]
    // In Kotlin, there are two web.web.web.web.web.main ways to create an array:
    // using the helper function arrayOf() or the constructor Array().
    val myArray = arrayOf("BMW", "Z1", 2017, "Electric")
    val otherArray = Array(10, { it + 1 }) // => [1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    println("Brand: ${myArray[0]} - Model: ${myArray[1]}")

    // Ensure the array only contents same types
    // We also have other utility functions to create arrays of other types such as charArrayOf(),
    // booleanArrayOf(), longArrayOf(), shortArrayOf(), byteArrayOf(), and so on
    val intValues = intArrayOf(10, 20, 43, 97)
    val other = arrayOf(43, 922, 23)

    println(intValues.contentToString())
    println("Content: ${other.contentToString()} ")

    // [The Array Constructor]
    // The constructor of this class requires a size and a lambda function.
    // In this case, the job of the lambda function is to initialize the array with elements.
    val arrayConstructor = Array(5, { i -> i * 2 })
    println(arrayConstructor.contentToString())

}
