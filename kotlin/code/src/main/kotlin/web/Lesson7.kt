package web

import web.classes.*
import web.classes.Person

/**
 * Kotlin From Scratch: Classes and Objects
 */
fun main(args: Array<String>) {

    // A class is a program unit that groups together functions and data to perform some related tasks.
    // We declare a class in Kotlin using the class keyword—similar to Java.
    // This is the simplest class declaration
    class Dog

    // Instantiate a class
    val dog = Dog()
    val book = Book("Romeo and Juliet", 1234567890)
    val film = Movie("Kill Bill", 2003)
    val game = Game("The Witcher 3", 2015)
    val serie = Serie("Game of Thrones")

    // We don't have to call the property getter method to access or call the setter
    // to set a property in Kotlin
    serie.year = 2011
    println("[${serie.title}] - [${serie.year}]") // prints [Game of Thrones] - [2011]

    // This is because the property is immutable, having been defined with the val keyword.
    // book.isbn = 987654321 // will not compile

    // Custom getters and setters
    val person = Person()
    println("[${person.id}] - [${person.name}] - [${person.lastname}] - [${person.age}]")

    val MotoA = Motorcycle(model = "Honda CBR", plateNo = "1224GHZ")
    val MotoB = Motorcycle(model = "Yamaha", plateNo = "3333GTR", new = false)
    val MotoC = Motorcycle("BMW", "1111GTR", false, "Green")

    // [Any and Nothing Types]
    // In Kotlin, the topmost type in the type hierarchy is called Any.
    // This is equivalent to the Java Object type. This means that all classes in Kotlin explicitly
    // inherit from the Any type, including String, Int, Double, and so on.
    // The Any type contains three methods: equals, toString, and hashcode.
    // We can also utilize the Nothing class in Kotlin in functions that always return an exception
    fun throwException(): Nothing {
        throw Exception("Exception message")
    }

    // throwException()

    // [Smart Casting]
    // Casting means taking an object of another type and converting it into another object type.
    if (MotoA is Motorcycle) {
        println(MotoA.plateNo)
    }

    // [Explicit Casting]
    // We can use the as operator (or unsafe cast operator) to explicitly cast a reference
    // of a type to another type in Kotlin.
    val moto = MotoB as Motorcycle
    println(moto.model)

    // If the explicit casting operation is illegal, note that a ClassCastException will be thrown.
    // To prevent an exception from being thrown when casting, we can use the safe cast operator
    // (or nullable cast operator) as?.
    val serieA: Serie? = book as? Serie
    println(serieA?.title) // prints null instead throw a ClassCastException

    // [OBJECTS]
    // Note that an object in Kotlin is not an instance of a specific class!
    //  - They can have properties, methods, and an init block.
    //  - These properties or methods can have visibility modifiers.
    //  - They can't have constructors (primary or secondary).
    //  - They can extend other classes or implement an interface.
    //  - Only one instance of an object exists.
    Singleton.doNothing()
    Singleton.printSomething()
    println(Singleton.nothing)

    // Companion objects
    val tomato = Food.create("Tomato", "Red")
    println("${tomato.name} - ${tomato.colour}") // prints Tomato - Red

    val potato = Food.create("Potato", "Brown")

    println("Count: ${Food.count}") // prints Count: 2
}
