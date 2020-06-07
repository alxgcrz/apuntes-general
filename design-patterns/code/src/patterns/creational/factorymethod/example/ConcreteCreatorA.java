package patterns.creational.factorymethod.example;

class ConcreteCreatorA extends Creator {

    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }

}
