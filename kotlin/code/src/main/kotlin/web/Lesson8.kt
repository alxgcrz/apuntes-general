package web

import web.classes.BlogPost
import web.classes.Shape
import web.classes.Square
import web.classes.Triangle
import web.classes.Rectangle
import java.net.URI
import java.util.*

/**
 * Kotlin From Scratch: Advanced Properties and Classes
 */

// Extension Properties
val String.upperCaseFirstLetter: String
    get() = this.substring(0, 1).toUpperCase().plus(this.substring(1))

// Extension Function
fun String.upperCaseFirstLetter(): String {
    // Note that the this keyword inside the function body references the receiver object or instance.
    return this.substring(0, 1).toUpperCase().plus(this.substring(1))
}

fun main(args: Array<String>) {

    // Invoking an extension property
    println("John".upperCaseFirstLetter) // => John
    // Invoking an extension function
    println("Doe".upperCaseFirstLetter()) // => Doe

    // [Data Classes] (POJOs in Java)
    // POJO
    val blogPostA: BlogPostJava = BlogPostJava(
            "My Awesome Post", URI("http://example.com"), "This is an awesome post", Date())
    // Data
    val blogPostB: BlogPost = BlogPost("My Awesome Post B", URI("http://example.com"),
            "This is an awesome post", Date())

    println(blogPostA)
    println(blogPostB)

    // Copy objects (with the ability to change properties during copy)
    val blogPostC = blogPostB.copy(title = "My Awesome Post C")
    println(blogPostC) // prints BlogPostJava(title=My Awesome Post C, url=http://example.com, description=This is an awesome post, publishDate=Sun Nov 05 11:41:34 CET 2017)

    // Destructuring declaration
    val (title, uri, description, date) = blogPostC // we can create a new instance or copy one that exists
    println("$title - $uri - $description - $date") // prints My Awesome Post C - http://example.com - This is an awesome post - Sun Nov 05 11:44:32 CET 2017

    // Nested Classes
    val outerClass = OuterClass()
    outerClass.outerClassFunction()
    val nestedClass = OuterClass.NestedClass()
    nestedClass.nestedClassFunc()

    // Inner Class
    val innerClass = outerClass.InnerClass()
    innerClass.innerClassFunc() // prints outerClassProperty

    // [Enum classes]
    // An enum type declares a set of constants represented by identifiers.
    println(Color.valueOf("GREEN")) // prints GREEN
    println(enumValueOf<Color>("BLUE")) // prints BLUE
    for (color in Color.values()) {
        println(color) // print all values
    }
    val indigo = Color.INDIGO
    println("${indigo.r} - ${indigo.g} - ${indigo.b}") // prints 75 - 0 - 130

    // Enum with when function
    println(getMnemonic(indigo)) // prints in

    // [Sealed class]
    // A sealed class in Kotlin is an abstract class (you never intend to create objects from it)
    // which other classes can extend. These subclasses are defined inside the sealed class body—in
    // the same file. Because all of these subclasses are defined inside the sealed class body,
    // we can know all the possible subclasses by simply viewing the file.
    fun whatIsIt(shape: Shape) = when (shape) {
        is Square -> println("A square")
        is Triangle -> println("A triangle")
        is Rectangle -> println("A rectangle")
    }

    val square = Square()
    whatIsIt(square) // prints A square

}


// To avoid having to do null checks every time we need to invoke a property's method,
// we can mark that property with the lateinit modifier—this means we have declared that property
// (which is an instance of another class) as late-initialized (meaning the property will be
// initialized later).
class Presenter {
    //private var repository: Repository? = null
    private lateinit var repository: Repository

    fun initRepository(repo: Repository): Unit {
        this.repository = repo
    }

    fun save(amount: Double) {
        //repository?.saveAmount(amount)
        repository.saveAmount(amount)
    }
}

class Repository {
    fun saveAmount(amount: Double) {
    }
}

// Nested Classes
class OuterClass {

    val outerClassProperty = "outerClassProperty"

    fun outerClassFunction() {}

    class NestedClass {
        fun nestedClassFunc() {}
    }

    // Inner Class
    inner class InnerClass {
        fun innerClassFunc() {
            val outerClass = this@OuterClass
            println(outerClass.outerClassProperty) // prints "outerClassProperty"
        }
    }
}

// Enum classes
// ust like a normal class, the enum type can have its own constructor
// with properties associated to each enum constant.
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

