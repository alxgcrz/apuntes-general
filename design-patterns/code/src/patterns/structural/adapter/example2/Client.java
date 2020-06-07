package patterns.structural.adapter.example2;

public class Client {

    public static void main(String[] args) {
        CalculatorAdapter cal = new CalculatorAdapter();
        Triangle triangle = new Triangle(20, 10);
        System.out.println("Area of Triangle is :" + cal.getArea(triangle));
    }

}
