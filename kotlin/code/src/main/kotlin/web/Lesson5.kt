package web

import web.utils.checkUserStatus

/**
 * Kotlin From Scratch: More Fun With Functions
 */
fun main(args: Array<String>) {

    // [Top-level function]
    // Top-level functions are functions inside a Kotlin package that are defined outside of any
    // class, object, or interface. This means that they are functions you call directly,
    // without the need to create any object or call any class.
    println("User status: ${checkUserStatus()}")

    // [Lambda expressions]
    // Lambda expressions (or function literals) are also not bound to any entity such as a class,
    // object, or interface.
    // They can be passed as arguments to other functions called higher-order functions
    // Lambda in Kotlin:
    //  - It must be surrounded by curly braces {}.
    //  - It doesn't have the fun keyword.
    //  - There is no access modifier (private, public or protected) because it doesn't belong to any class, object, or interface.
    //  - It has no function name. In other words, it's anonymous.
    //  - No return type is specified because it will be inferred by the compiler.
    //  - Parameters are not surrounded by parentheses ().
    //  - we can assign a lambda expression to a variable and then execute it.

    // Lambda or function literal without arguments and assigned to a variable
    val message = { println("Hey, Kotlin is really cool!") }
    message() // => "Hey, Kotlin is really cool!"

    // Lambda with argument
    // The arrow separates the parameter list from the lambda body.
    val messageA = { name: String -> "Hey $name, Kotlin is really cool!" }
    println(messageA("John"))

    // Lambda with multiple arguments
    val messageB = { name: String, lastName: String -> "Hey $name $lastName, Kotlin is really cool!" }
    println(messageB("John", "Doe"))

    // Passing Lambdas to Functions (Higher-order functions)
    val names = listOf("Luke", "Leia", "Han Solo", "C3PO", "R2D2")
    println(names.last()) // => R2D2

    // Passing a Lambda function to the last() function
    // We can pass lambda expressions as parameters to functions:
    // these are called "higher-order functions", because they are functions of functions.
    println(names.last({ s: String -> s.startsWith("L") })) // => Leia
    println(names.last { s: String -> s.startsWith("L") }) // => Leia
    println(names.last { s -> s.startsWith("L") }) // => Leia

    // We can even simplify the lambda expression further again by replacing the lambda expression argument
    // with the auto-generated default argument name it.
    println(names.last { it.startsWith("L") }) // => Leia

    // [Member functions]
    // This kind of function is defined inside a class, object, or interface.
    // Using member functions helps us to modularize our programs further.
    val circle = Circle()
    println(circle.calculateArea(14.5))

    // [Anonymous function]
    //  - has no name
    //  - is created with the fun keyword
    //  - contains a function body

    // To be explicit about the return type, we need to use an anonymous function instead.
    println(names.last(fun(string): Boolean {
        return string.length > 3
    }))

    // Anonymous function without return type
    names.forEach(fun(string) {
        print("[${string.toUpperCase()}]") // prints [LUKE][LEIA][HAN SOLO][C3PO][R2D2]
    })

    // Nested functions
    fun nestedFunctions(name: String): String {
        return "\nHey $name, this is a nested function"
    }
    println(nestedFunctions("John")) // => Hey John, this is a nested function
    printCircumferenceAndArea(6.6) // => The circle circumference of 6.6 radius is 41,47 and area is 136,85
    // println(calCircumference(6.6)) // Can not call nested functions outside the enclosing function

    // [Infix function]
    // The infix notation allows us to easily call a one-argument member function or extension function.
    circle area 1.2
    println(circle.area)
    println(circle area 2.0)

    // The to Infix Function
    // In Kotlin, we can make the creation of a Pair instance more succinct by using the to infix function
    // instead of the Pair constructor.
    val nameAgeA = Pair("John", 38)
    val nameAgeB = "Henry" to 42
    val nameAgeC = "William".to(32)

    println(nameAgeA) // prints (John, 38)
    println(nameAgeB) // prints (Henry, 42)
    println(nameAgeC) // prints (William, 32)

    // Use the to infix function to create a map collection
    val colleagues = mapOf("John" to 38, "Henry" to 42, "William".to(32))
    println(colleagues) // prints {John=38, Henry=42, William=32}

    val colleaguesPair = mapOf(Pair("John", 38), Pair("Henry", 42), Pair("William", 32))
    println(colleaguesPair) // prints {John=38, Henry=42, William=32}
}

// Nested functions
fun printCircumferenceAndArea(radius: Double) {
    fun calCircumference(radius: Double): Double = (2 * Math.PI) * radius
    val circumference = "%.2f".format(calCircumference(radius))

    // In this case we use the parameter 'radius' directly because local functions
    // have access to all parameters of the enclosing function
    fun calArea(): Double = (Math.PI) * Math.pow(radius, 2.0)

    val area = "%.2f".format(calArea())

    println("The circle circumference of $radius radius is $circumference and area is $area")
}

class Circle {

    var area = 0.0

    // Member function
    fun calculateArea(radius: Double): Double {
        require(radius > 0, { "Radius must be greater than 0" })
        return Math.PI * Math.pow(radius, 2.0)
    }

    // Infix function
    infix fun area(radius: Double): Double {
        area = Math.PI * Math.pow(radius, 2.0)
        return area
    }

}