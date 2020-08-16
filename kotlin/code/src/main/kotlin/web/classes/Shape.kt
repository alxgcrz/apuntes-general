package web.classes

// Shape.kt

/* A sealed class in Kotlin is an abstract class (you never intend to create objects from it)
which other classes can extend. These subclasses are defined inside the sealed class body—in
the same file. Because all of these subclasses are defined inside the sealed class body,
we can know all the possible subclasses by simply viewing the file.
*/
sealed class Shape

class Square : Shape()
class Triangle : Shape()
class Rectangle : Shape()