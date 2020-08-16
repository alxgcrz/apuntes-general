package book

import java.io.InputStream
import java.io.OutputStream
import java.math.BigDecimal
import java.util.*

/**
 *   Programming Kotlin
 *   [Chapter 3]
 *   - Object-Oriented Programming in Kotlin
 *   - Object and companion
 */
fun main(args: Array<String>) {
    // [Classes]
    class Deposit

    class Person constructor(val firstName: String, val lastName: String, val age: Int?)

    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith", null)
    println("${person1.firstName},${person1.lastName} is ${person1.age} years old")
    println("${person2.firstName},${person2.lastName} is ${person2.age?.toString()
            ?: "?"} years old")

    // Inside the 'init' block we can validate the incoming parameters.
    class PersonWithValidation /*constructor*/(val firstName: String, val lastName: String, val age: Int?) {
        init {
            require(firstName.trim().isNotEmpty()) {
                "Invalid firstName argument."
            }
            require(lastName.trim().isNotEmpty()) {
                "Invalid lastName argument."
            }
            if (age != null) {
                require(age in 0..149) { "Invalid age argument." }
            }
        }

        // Secondary constructor
        constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
    }

    val personWithValidation = PersonWithValidation(firstName = "John", lastName = "Doe")
    val personWithValidation2 = PersonWithValidation(firstName = "Will", lastName = "Smith", age = 45)

    class Person2(firstName: String, lastName: String, howOld: Int?) {
        private val name: String
        private val age: Int?

        init {
            this.name = "$firstName,$lastName"
            this.age = howOld
        }

        fun getName(): String = this.name
        fun getAge(): Int? = this.age
    }

    val person = Person2("John", "Doe", null)
    println(person.getName()) // => John,Doe

    // [Data classes]
    data class Customer(val id: Int, val name: String, var address: String)

    val customer = Customer(id = 1, name = "John Doe", address = "Sesame Street 1")
    println(customer) // => Customer(id=1, name=John Doe, address=Sesame Street 1)

    // Singleton object
    println(SingletonObjectExample.hello()) // => Hello

    // Companion object
    val myClass = MyClass.create()

    // [Inheritance]
    open class Payment(val amount: BigDecimal)

    class CardPayment(amount: BigDecimal, val number: String, val expiryDate: Date,
                      val type: CardType) : Payment(amount)

    // [Abstract classes]
    abstract class A() {
        abstract fun doSomething()

        // You need to add the 'open' keyword as a prefix if you wanna override the function
        open fun doSomethingElse() {
            // ...
        }
    }

    // [Overriding rules]
    class B() : A() {
        override fun doSomething() {
            // ...
        }

        override fun doSomethingElse() {
            // ..
        }
    }
}

// [Enum classes]
enum class CardType {
    VISA, MASTERCARD, AMEX
}

// Enum class with constructor
enum class Orientation(val angle: Int) {
    North(90), West(180), South(270), East(0)
}

fun orientation() {
    val south = Orientation.South
    println("Angle: ${south.angle} - Name: ${south.name} - Ordinal: ${south.ordinal}")
    println("${Orientation.values()} - ${Orientation.valueOf("West")}")
}

object SingletonObjectExample {
    fun hello(): String {
        return "Hello"
    }
}

// [Companion object]
class MyClass private constructor() {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }

}

// [Interfaces]
interface Document {
    val version: Long
    val size: Long

    // Default implementation
    val name: String
        get() = "NoName"

    fun save(input: InputStream)
    fun load(stream: OutputStream)

    // Default implementation
    fun getDescription(): String {
        return "Document $name has $size byte(-s)"
    }
}

// Implementing the interface
class DocumentImpl : Document {
    override val size: Long
        get() = 0

    override fun load(stream: OutputStream) {
        // ...
    }

    override fun save(input: InputStream) {
        // ...
    }

    override val version: Long
        get() = 0
}

// [Sealed classes]
sealed class IntBinaryTree {
    class EmptyNode : IntBinaryTree()
    class IntBinaryTreeNode(val left: IntBinaryTree, val value: Int, val right: IntBinaryTree) : IntBinaryTree()
}



