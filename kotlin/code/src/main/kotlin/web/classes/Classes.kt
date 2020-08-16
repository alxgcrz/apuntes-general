package web.classes

/* Kotlin */
class Book {
    var title: String
    val isbn: Long

    constructor(title: String, isbn: Long) {
        this.title = title
        this.isbn = isbn
    }
}

// [Primary constructor]
// A primary constructor doesn't have any place to put a block of code, so we utilize the init modifier
// to initialize incoming parameters from the primary constructor.
class Movie constructor(title: String, year: Int) {
    var title: String
    var year: Int

    init {
        this.title = title
        this.year = year
    }
}

// Notice that in the primary constructor parameter list, we defined our mutable properties
// directly inside the primary constructor with the var keyword.
class Game constructor(var title: String, var year: Int)

// In fact, we can also omit the constructor keyword, but only if it doesn't have any visibility
// modifier (public, private, or protected) or any annotations.
class Serie(var title: String = "unknown title", var year: Int = 0)

// If we want to create our own custom getter or setter for a property, we have to define that
// property in the class body instead of the constructor header.
class Person(val name: String = "John") {
    val lastname get() = "Doe"

    // Property with custom getter function
    val age: Int
        get() {
            return 30
        }

    // Property with custom setter function
    var id = "X123456789"
        set(value) {
            if (!value.isNotEmpty()) {
                throw IllegalArgumentException("id must not be empty")
            }
            field = value
        }
}

// Class with primary and secondary constructor
// Note that we can't declare properties inside a secondary constructor,
// as we did for the primary constructor. If we want to do this,
// we have to declare it inside the class body and then initialize it in the secondary constructor.
class Motorcycle(val model: String, val plateNo: String) {
    var new: Boolean? = null
    var colour: String = ""

    // In Kotlin, every secondary constructor must call the primary constructor,
    // or call another secondary constructor that calls the primary constructor
    // We use the this keyword to achieve that.
    constructor(model: String, plateNo: String, new: Boolean) : this(model, plateNo) {
        this.new = new
    }

    constructor(model: String, plateNo: String, new: Boolean, colour: String) : this(model, plateNo, new) {
        this.colour = colour
    }
}

// Companion object which has the job of creating a class instance
class Food private constructor(var name: String, var colour: String) {
    init {
        count++
    }

    // Note also that the companion class has unrestricted access to all the properties and functions
    // declared in its companion object, whereas a companion object can't access the class members
    companion object {
        var count: Int = 0
        fun create(name: String, colour: String): Food = Food(name, colour)
    }
}

// [Companion Object Extensions]
// Similarly to how extension functions can extend the functionality of a class,
// we can also extend the functionality of a companion object.
fun Food.Companion.extendsFunction() {
    // do something
}

// Defining an object
// In fact, we are creating singletons when we create objects in Kotlin using the object construct,
// because only one instance of an object exists.
object Singleton {
    val nothing = "Nothing"

    fun doNothing(): Unit {
        // do something
    }

    fun returnSomething(s: String = "something"): String {
        return s
    }

    fun printSomething() {
        println(returnSomething())
    }

    @JvmStatic
    fun printSomethingJava() {
        println(returnSomething())
    }
}

