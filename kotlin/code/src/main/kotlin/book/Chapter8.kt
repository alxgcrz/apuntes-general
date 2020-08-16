package book

/**
 *   Programming Kotlin
 *   [Chapter 8]
 *   - Type parametrization
 *   - Type bounds and recursive type bounds
 *   - Invariance, covariance and contravariance
 *   - Algebraic data types
 */
fun main(args: Array<String>) {
    // Parameterised functions
    fun <T> random(param: T): T = param

    fun <K, V> mapping(key: K, value: V) {}

    val randomInt = random(1)
    val randomDouble = random(10.0)
    val map = mapping(1, "ES")

    // [Parameterized types]
    class Sequence<T>

    class Dictionary<K, V>

    val seq = Sequence<Int>()
    val dict = Dictionary<Int, String>()
}