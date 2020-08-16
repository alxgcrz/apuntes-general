package web

import web.utils.hello
import web.utils.saySomething
// Import aliasing
// When you have libraries that have conflicting class or function names (e.g. they each declare a
// function with the same name), you can use the as keyword to give that imported entity a temporary name.
import web.utils.sayGoodbye as bye

/**
 * Kotlin From Scratch: Packages and Basic Functions
 */
fun main(args: Array<String>) {

    // Imports
    println(saySomething())
    println(bye())
    println(hello("John"))

    // [Functions]
    fun calCircumference(radius: Double): Double {
        return (2 * Math.PI) * radius
    }

    // Single-line or one-line functions are functions that are just single expressions.
    fun calCircumferenceInline(radius: Double) = (2 * Math.PI) * radius

    // Named parameters allow more readable functions by naming the parameters that are
    // being passed to a function when called.
    fun printFullName(firstName: String, lastName: String, middleName: String) {
        println("My full name is $firstName $middleName $lastName")
    }
    printFullName("John", "Doe", "Williams")
    printFullName(firstName = "John", middleName = "Williams", lastName = "Doe")

    // In Kotlin, we can give a function default values for any of its parameters.
    // These default values are used if nothing is assigned to the arguments during the function call.
    fun calcArea(width: Double, height: Double = width) = width * height
    println(calcArea(24.0)) // => 576.0
    println(calcArea(24.0, 12.0)) // => 288.0

    // Unlimited arguments
    // The vararg modifier allows callers to pass in a comma-separated list of arguments.
    fun printIntegers(vararg ints: Int) {
        println(ints.contentToString())
    }
    printIntegers(1, 2, 3, 4, 5) // => [1, 2, 3, 4, 5]
    printIntegers(10, 12, 16, 20) // => [10, 12, 16, 20]

    // When a function has multiple parameters, the vararg parameter is typically the last one
    fun printNumbers(myDouble: Double, myFloat: Float, vararg ints: Int) {
        println("[$myDouble] [$myFloat] ${ints.contentToString()}")
    }

    // It is also possible to have parameters after the vararg, but you'll need to use named parameters
    // to specify them when you call the function.
    fun printNumbers(myDouble: Double, myFloat: Float, vararg ints: Int, myString: String) {
        println("[$myDouble] [$myFloat] ${ints.contentToString()} [$myString]")
    }

    printNumbers(1.2, 3.4F, 4, 8) // => [1.2] [3.4] [4, 8]
    printNumbers(1.5, 2.3F, 5, 1, myString = "Hello") // => [1.5] [2.3] [5, 1] [Hello]

    // Spread operator will unpack the array and then pass the individual elements as arguments
    // into the function
    val intArray = intArrayOf(1, 2, 3, 4)
    printIntegers(*intArray) // prints [1, 2, 3, 4]

    // Return multiple values (Pair)
    // Sometimes we want to return multiple values from a function. One way is to use the Pair type
    // in Kotlin to create a Pair and then return it. This Pair structure encloses two values
    // that can later be accessed
    val userNameAndStatePair: Pair<String?, String?> = getUserNameAndState(101)
    println(userNameAndStatePair.first)
    println(userNameAndStatePair.second)

    // Multiple values with destructuring (better & clean solution)
    val (name, state) = getUserNameAndState(101)
    println("[$name] - [$state]") // prints [Chike] - [Lagos]

    // Multiple values (Triple)
    val (name1, state1, age) = getUserNameStateAndAge(101)
    println("[$name1] - [$state1] - [$age]") // prints [Chike] - [Lagos] - [6]

}

// With '@JvmOverloads' the Kotlin compiler generates the Java overloaded functions and
// the Java callers can choose which one to call
@JvmOverloads
fun calculateCircumference(radius: Double, pi: Double = Math.PI) = (2 * pi) * radius

// Methods created in Java with @JvmOverloads
// double web.calculateCircumference(double radius, double pi);
// double web.calculateCircumference(double radius);

// Return multiple values with Pair type
fun getUserNameAndState(id: Int): Pair<String?, String?> {
    require(id > 0, { "Error: id is less than 0" })

    val userNames: Map<Int, String> = mapOf(101 to "Chike", 102 to "Segun", 104 to "Jane")
    val userStates: Map<Int, String> = mapOf(101 to "Lagos", 102 to "Imo", 104 to "Enugu")

    val userName = userNames[id]
    val userState = userStates[id]
    return Pair(userName, userState)
}

fun getUserNameStateAndAge(id: Int): Triple<String?, String?, Int> {
    require(id > 0, { "id is less than 0" })

    val userNames: Map<Int, String> = mapOf(101 to "Chike", 102 to "Segun", 104 to "Jane")
    val userStates: Map<Int, String> = mapOf(101 to "Lagos", 102 to "Imo", 104 to "Enugu")

    val userName = userNames[id]
    val userState = userStates[id]
    val userAge = 6
    return Triple(userNames[id], userStates[id], userAge)
}