package web.utils

// Extension function
fun String.upperCaseFirstLetter(): String {

    // Note that the this keyword inside the function body references the receiver object or instance.
    return this.substring(0, 1).toUpperCase().plus(this.substring(1))
}

class ClassB {
    override fun toString(): String {
        return "ClassB.toString()"
    }
}

// Member extension functions
class ClassA {

    fun ClassB.exFunction() {
        println(toString()) // calls ClassB toString()
        println(this@ClassA.toString()) // class ClassA toString
    }

    fun callExFunction(classB: ClassB) {
        classB.exFunction() // call the extension function
    }

    override fun toString(): String {
        return "ClassA.toString()"
    }
}



