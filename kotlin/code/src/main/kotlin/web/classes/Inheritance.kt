package web.classes

open class Student(val firstName: String, val lastName: String) {
    open fun schoolFees(): Double {
        return 0.0
    }
}

// Classes are final in Kotlin. We have to explicitly mark the superclass with the open modifier
class GraduateStudent(firstName: String, lastName: String) : Student(firstName, lastName) {

    var country = ""

    // Secondary constructor
    constructor(firstName: String, lastName: String, country: String = "USA") : this(firstName, lastName) {
        this.country = country
    }

    // Note that if you override a member of a superclass or interface,
    // the overriding member will also be open by default
    override fun schoolFees(): Double {
        return super.schoolFees() + calculateSchoolFees()
    }

    private fun calculateSchoolFees(): Double {
        return 0.0
    }

    fun name(): String {
        return "$firstName $lastName"
    }
}