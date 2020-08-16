package web.abstract

// Abstract class
abstract class Employee(val firstName: String, val lastName: String) {

    // We can also store state in abstract classes.
    val company = "Company SA"

    abstract fun earnings(): Double

    // Note that not all members have to be abstract.
    fun fullName(): String {
        return "$lastName $firstName"
    }

    open fun email() = "$firstName@company.com"
}

// Class that extends the abstract class
class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {

    override fun earnings(): Double {
        return 2000.0
    }

    // Concrete classes (subclasses of the abstract class) can override a method's default implementation
    // but only if the method has the open modifier specified
    override fun email(): String {
        return "${firstName}_programing@company.com"
    }
}