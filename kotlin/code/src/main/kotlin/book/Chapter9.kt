package book

import java.util.*

/**
 *   Programming Kotlin
 *   [Chapter 9]
 *   - What destructuring is and how data classes are automatically eligible for destructuring operations
 *   - How you get copy, toString, hashCode and equals methods implemented for you
 *   - Rules to obey when defining data classes
 *   - Limitations of data classes
 */
fun main(args: Array<String>) {
    // Data classes
    data class BlogEntry(var title: String, var description: String?, val publishTime: String?)

    val blogEntry = BlogEntry(title = "Kotlin is awesome", description = null, publishTime = "30/04/2018")

    // [The copy method]
    val copyBlogEntry = blogEntry.copy(title = "Properties in Kotlin")

    println(blogEntry) // => BlogEntry(title=Kotlin is awesome, description=null, publishTime=30/04/2018)
    println(copyBlogEntry) // => BlogEntry(title=Properties in Kotlin, description=null, publishTime=30/04/2018)

    // [hashCode method]
    data class BlogEntry2(var title: String, var description: String?, val publishTime: Date?) {
        override fun hashCode(): Int {
            return super.hashCode()
        }
    }

    // [equals method]
    data class BlogEntry3(var title: String, var description: String?, val publishTime: Date?) {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }
    }

    // [Destructed declarations]
    val (title, description, publishTime) = blogEntry
    println("$title - $description - $publishTime") // => Kotlin is awesome - null - 30/04/2018
}

