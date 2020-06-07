package patterns.creational.builder.example;

interface Builder {

    Product build();

    ConcreteBuilder setName(String name);

    ConcreteBuilder setColor(String color);

}
