package patterns.creational.factorymethod.example;

class ConcreteCreatorB extends Creator {

    @Override
    Product factoryMethod() {
        return new ConcreteProductB();
    }

}
