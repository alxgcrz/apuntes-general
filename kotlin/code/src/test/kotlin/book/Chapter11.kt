package book

import io.kotlintest.*
import io.kotlintest.matchers.*
import io.kotlintest.specs.*
import java.util.*

// [FunSpec]
class StringTestWithFunSpec : FunSpec() {
    init {
        test("String.startsWith should be true for a prefix") {
            "helloworld".startsWith("hello") shouldBe true
        }
        test("String.endsWith should be true for a prefix") {
            "helloworld".endsWith("world") shouldBe true
        }

    }
}

// [StringSpec]
class StringTestWithStringSpec : StringSpec() {
    init {
        "strings.length should return size of string" {
            "hello".length shouldBe 5
            "hello" shouldBe haveLength(5)
        }
    }
}

// [ShouldSpec]
class StringTestWithShouldSpec : ShouldSpec() {
    init {
        should("return the length of the string") {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }
        // Nested form
        "String.length" {
            should("return the length of the string") {
                "sammy".length shouldBe 5
                "".length shouldBe 0
            }
        }
    }
}

// [WordSpec]
class StringTestWithWordSpec : WordSpec() {
    init {
        "String.length" should {
            "return the length of the string" {
                "sammy".length shouldBe 5
                "".length shouldBe 0
            }
        }
    }
}

// [FeatureSpec]
class StringTestWithFeatureSpec : FeatureSpec() {
    init {
        feature("Hello World") {
            scenario("should starts with 'Hello'") {
                "Hello World".startsWith("Hello")
            }
            scenario("should ends with 'World'") {
                "Hello World".endsWith("World")
            }
        }
    }
}

// [BehaviorSpec]
class StringTestWithBehaviorSpec : BehaviorSpec() {
    init {
        given("a stack") {
            val stack = Stack<String>()
            `when`("an item is pushed") {
                stack.push("kotlin")
                then("the stack should not be empty") {
                    stack.isEmpty() shouldBe true
                }
            }
            `when`("the stack is popped") {
                stack.pop()
                then("it should be empty") {
                    stack.isEmpty() shouldBe false
                }
            }
        }
    }
}

// [String matchers]
class StringTestWithDifferentMatchers : StringSpec() {
    init {
        "Tests string prefixes" {
            "Hello".startsWith("He") shouldBe true
            "Hello" shouldBe startWith("He")
        }
        "Tests substrings"{
            "Hello" shouldBe include("el")
        }
        "Test string suffixes" {
            "Hello".endsWith("llo") shouldBe true
            "Hello" shouldBe endWith("llo")
        }
        "Tests the length of a string" {
            "Hello".length shouldBe 5
            "Hello" shouldBe haveLength(5)
        }
        "Tests the equality using a regular expression" {
            "Hello" shouldBe match("He...")
        }
    }
}

// [Collection matchers]
class CollectionTestWithDifferentMatchers : StringSpec() {
    private val listWithDifferentIntegers = listOf(1, 2, 3, 4, 5)
    private val mapWithKeyAndValues = mapOf<Int, String>(1 to "Hello", 2 to "World")

    init {
        "Tests that a collection should contain the given element" {
            listWithDifferentIntegers shouldBe contain(3)
        }
        "Test the size of the collection" {
            listWithDifferentIntegers shouldBe haveSize<Int>(5)
        }
        "Tests that the collections should be sorted" {
            listWithDifferentIntegers shouldBe sorted<Int>()
        }
        "Tests that the collection has a single element that is equal to the given element" {
            listWithDifferentIntegers shouldNotBe singleElement(2)
        }
        "Tests that the collection contains all the given elements. The order of these elements does not matter." {
            listWithDifferentIntegers shouldBe containsAll(1, 2, 4)
        }
        "Tests whether the collection is empty or not" {
            listWithDifferentIntegers shouldNotBe beEmpty<Int>()
        }
        "Tests whether the map contains mapping from a key to any value" {
            mapWithKeyAndValues shouldBe haveKey(2)
        }
        "Tests whether the map contains the value for at least one key" {
            mapWithKeyAndValues shouldBe haveValue("Hello")
        }
        "Tests that the map contains the exact mapping of the key to the value" {
            mapWithKeyAndValues shouldBe contain(2, "World")
        }
    }
}

// [Floating point matchers]
class FloatNumberTestWithTolerance : StringSpec() {
    private val randomDouble = 18.005
    private val enoughDouble = 18.006

    init {
        "Test if two numbers are equals" {
            randomDouble shouldNotBe equals(enoughDouble)
            randomDouble shouldBe (enoughDouble plusOrMinus 0.01)
        }
    }
}

// [Expecting exceptions]
// Sometimes, we want to assert that a function will throw an exception, perhaps to test a
// precondition we may have added.
// Note that 'shouldThrow' will also fail the test if the wrong type of exception is thrown.
class ExceptionTest : StringSpec() {
    init {
        "Testing IllegalArgumentException" {
            shouldThrow<IllegalArgumentException> {
                addNumberToTwo(10.0) shouldEqual 12.0
            }
        }
    }
}

@Throws(IllegalArgumentException::class)
fun addNumberToTwo(a: Any): Int {
    if (a !is Int) {
        throw IllegalArgumentException("Number must be an integer")
    }
    return 2 + a
}

// [Combining matchers]
class CombiningMatchers : StringSpec() {
    init {
        "Combining matchers" {
            "Hello World" should (startWith("Hel") and endWith("rld"))
        }
    }
}

// [Inspectors]
// KotlinTest inspectors are an easy way to test the contents of collections.
val kings = listOf("Stephen I", "Henry I", "Henry II", "Henry III", "William I", "William III")

class InspectorTests : StringSpec() {
    init {
        "all kings should have a regal number" {
            forAll(kings) {
                it should endWith("I")
            }
        }
        "only one king has the name Stephen" {
            forOne(kings) {
                it should startWith("Stephen")
            }
        }
        "some kings have regal number II" {
            forSome(kings) {
                it should endWith("II")
            }
        }
        "at least one King has the name Henry" {
            forAtLeastOne(kings) {
                it should startWith("Henry")
            }
        }
    }
}

// [Interceptors]
class UsingInterceptors : StringSpec() {

    val myinterceptor: (TestCaseContext, () -> Unit) -> Unit = { context, test ->
        val start = System.currentTimeMillis()
        test()
        val end = System.currentTimeMillis()
        val duration = end - start
        println("This test took $duration millis")
    }

    init {
        "Tests the equality using a regular expression" {
            "Hello" shouldBe match("He...")
        }.config(interceptors = listOf(myinterceptor))
    }
}

// [Project config]
object codeExecutionBeforeAndAfterTestCases : ProjectConfig() {
    override fun beforeAll() {
        // ...code
    }

    override fun afterAll() {
        // ...code
    }
}

// [Tags, conditions and config]
class ConfigExampleWithTag : ShouldSpec() {
    init {
        should("run multiple times") {
            println("Test invocation")
        }.config(invocations = 5)
    }
}

// [Conditions]
class ConfigExampleWithCondition : ShouldSpec() {
    private fun isMultiCore() = Runtime.getRuntime().availableProcessors() > 1

    init {
        should("test enabled") {
            "Hello".length shouldBe 5
        }.config(enabled = true)

        // We can extend this to use runtime lookup by defining a function instead of a hardcoded
        // value. In fact, anything that is an expression can be used.
        should("test enabled if the CPU is multicore") {
            "Hello".length shouldBe 5
        }.config(enabled = isMultiCore())
    }
}

// [Tags]
object ElasticSearch : Tag()

object Windows : Tag()
class ConfigExampleWithTags : ShouldSpec() {
    init {
        should("test enabled") {
            "Hello".length shouldBe 5
        }.config(tags = setOf(ElasticSearch, Windows))
    }
}

// [One instance]
class OneInstanceOfTheseTests : ShouldSpec() {
    override val oneInstancePerTest = true

    init {
        // tests here
    }
}

// [Resources]
class ResourceExample : StringSpec() {
    val input = autoClose(javaClass.getResourceAsStream("data.csv"))

    init {
        "your test case" {
            // use input stream here
        }
    }
}