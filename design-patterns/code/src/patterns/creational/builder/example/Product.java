package patterns.creational.builder.example;

class Product {

    private String name;
    private String color;

    Product() {
    }

    String getColor() {
        return color;
    }

    void setColor(final String color) {
        this.color = color;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [name = " + name + ", color = " + color + "]";
    }

}
