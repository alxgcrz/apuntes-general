package patterns.structural.adapter.example2;

/*Calculate the area of a Triangle using CalculatorAdapter. */
class CalculatorAdapter {

    double getArea(Triangle t) {
        Calculator calculator = new Calculator();
        Rect rect = new Rect();
        //Area of Triangle=0.5*base*height
        rect.height = t.base;
        rect.width = 0.5 * t.height;
        return calculator.getArea(rect);
    }

}
