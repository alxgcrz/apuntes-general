package patterns.structural.adapter.example2;

/*Calculator can calculate the area of a rectangle. To calculate the area we need a Rectangle input.*/
class Calculator {

    double getArea(Rect rectangle) {
        return rectangle.height * rectangle.width;
    }

}
